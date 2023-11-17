package udc.edu.co.reactiveapi.domain.usecases;

import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.domain.api.CurriculumUsecaseApi;
import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;
import udc.edu.co.reactiveapi.domain.ports.PersistancePort;

public class CurriculumUseCaseApi implements CurriculumUsecaseApi {
    private final PersistancePort persistancePort;

    public CurriculumUseCaseApi(PersistancePort persistancePort) {
        this.persistancePort = persistancePort;
    }

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
