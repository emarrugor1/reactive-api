package udc.edu.co.reactiveapi.domain.usecases;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.domain.api.CurriculumUsecase;
import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;
import udc.edu.co.reactiveapi.domain.ports.PersistancePort;

@RequiredArgsConstructor
public class GetCurriculumVitaeUseCase implements CurriculumUsecase {
    private final PersistancePort persistancePort;
    @Override
    public Mono<CurriculumVitae> getCurriculumVitaeById(
            String typeId, String numberId){
        return persistancePort.getCurriculumVitaeById(typeId,numberId);
    }
    @Override
    public Mono<CurriculumVitae> saveCurriculumVitae(
            CurriculumVitae curriculumVitae){
        return persistancePort.saveCurriculumVitae(curriculumVitae);
    }
}
