package udc.edu.co.reactiveapi.domain.ports;

import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;

public interface PersistancePort {
    Mono<CurriculumVitae> saveCurriculumVitae(CurriculumVitae curriculumVitae);
    Mono<CurriculumVitae> getCurriculumVitaeById(String typeId, String numberId);
}
