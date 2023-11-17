package udc.edu.co.reactiveapi.persistence.hubspot.adapters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;
import udc.edu.co.reactiveapi.domain.ports.PersistancePort;
import udc.edu.co.reactiveapi.persistence.hubspot.mappers.HubspotMapper;
import udc.edu.co.reactiveapi.persistence.hubspot.repository.HubspotRepository;

@Service
@RequiredArgsConstructor
public class HubspotPersistanceAdapter implements PersistancePort {
    private final HubspotRepository hubspotRepository;
    @Override
    public Mono<CurriculumVitae> saveCurriculumVitae(CurriculumVitae curriculumVitae) {
        return hubspotRepository.createContact(HubspotMapper.toCurriculumHubspot(curriculumVitae))
                .map(HubspotMapper::responseToCurriculumHubspot);
    }

    @Override
    public Mono<CurriculumVitae> getCurriculumVitaeById(String typeId, String numberId) {
        return null;
    }
}
