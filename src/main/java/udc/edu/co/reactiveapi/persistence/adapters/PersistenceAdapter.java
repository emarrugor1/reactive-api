package udc.edu.co.reactiveapi.persistence.adapters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;
import udc.edu.co.reactiveapi.domain.ports.PersistancePort;
import udc.edu.co.reactiveapi.persistence.mappers.PersistenceMapper;
import udc.edu.co.reactiveapi.persistence.repository.CurriculumRepository;

@Repository
@RequiredArgsConstructor
public class PersistenceAdapter implements PersistancePort {

    private final CurriculumRepository curriculumRepository;

    @Override
    public Mono<CurriculumVitae> saveCurriculumVitae(CurriculumVitae curriculumVitae) {
        return curriculumRepository.save(
                PersistenceMapper.toCurriculumDocument(curriculumVitae))
                .map(PersistenceMapper::toCurriculumVitae);
    }

    @Override
    public Mono<CurriculumVitae> getCurriculumVitaeById(String typeId, String numberId) {
        return curriculumRepository.findByTypeIdAndNumberId(typeId, numberId)
                .map(PersistenceMapper::toCurriculumVitae);
    }
}
