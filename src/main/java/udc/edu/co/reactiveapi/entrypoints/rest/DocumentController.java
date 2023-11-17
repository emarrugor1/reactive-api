package udc.edu.co.reactiveapi.entrypoints.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.domain.api.CurriculumUsecaseApi;
import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;

@RestController
@RequestMapping("curriculums")
public class DocumentController {

    private final CurriculumUsecaseApi curriculumUsecaseApi;
    @Value("${spring.config.activate-mongodb}")
    private boolean activateMongoDb;

    @Autowired
    public DocumentController(@Qualifier("getCurriculumUseCaseWithMongoDbBean") CurriculumUsecaseApi curriculumUsecaseApiMongoDb,
                              @Qualifier("getCurriculumUseCaseWithHubspotBean") CurriculumUsecaseApi curriculumUsecaseApiHubspot) {
        if (activateMongoDb){
            this.curriculumUsecaseApi = curriculumUsecaseApiMongoDb;
        }else {
            this.curriculumUsecaseApi = curriculumUsecaseApiHubspot;
        }
    }

    @PostMapping
    public Mono<CurriculumVitae> saveCurriculumVitae(@RequestBody CurriculumVitae curriculumVitae){
        return curriculumUsecaseApi.saveCurriculumVitae(curriculumVitae);
    }
    @GetMapping
    public Mono<CurriculumVitae> getCurriculumVitae(
            @RequestParam String typeId,
            @RequestParam String numberId){
        return curriculumUsecaseApi.getCurriculumVitaeById(typeId,numberId);
    }
}
