package udc.edu.co.reactiveapi.domain.api;

import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;

public interface CurriculumUsecase {
    Mono<CurriculumVitae> saveCurriculumVitae(CurriculumVitae curriculumVitae);
    Mono<CurriculumVitae> getCurriculumVitaeById(String typeId, String numberId);
}
