package udc.edu.co.reactiveapi.entrypoints.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.domain.api.CurriculumUsecase;
import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;

@RestController
@RequestMapping("curriculums")
@RequiredArgsConstructor
public class DocumentController {
    private final CurriculumUsecase curriculumUsecase;

    @PostMapping
    public Mono<CurriculumVitae> saveCurriculumVitae(@RequestBody CurriculumVitae curriculumVitae){
        return curriculumUsecase.saveCurriculumVitae(curriculumVitae);
    }
    @GetMapping
    public Mono<CurriculumVitae> getCurriculumVitae(
            @RequestParam String typeId,
            @RequestParam String numberId){
        return curriculumUsecase.getCurriculumVitaeById(typeId,numberId);
    }
}
