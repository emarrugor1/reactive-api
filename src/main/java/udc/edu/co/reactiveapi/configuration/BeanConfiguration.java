package udc.edu.co.reactiveapi.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import udc.edu.co.reactiveapi.domain.api.CurriculumUsecaseApi;
import udc.edu.co.reactiveapi.domain.ports.PersistancePort;
import udc.edu.co.reactiveapi.domain.usecases.CurriculumUseCaseApi;
import udc.edu.co.reactiveapi.persistence.hubspot.adapters.HubspotPersistanceAdapter;
import udc.edu.co.reactiveapi.persistence.hubspot.repository.HubspotRepository;
import udc.edu.co.reactiveapi.persistence.mongodb.adapters.PersistenceAdapter;
import udc.edu.co.reactiveapi.persistence.mongodb.repository.CurriculumRepository;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final HubspotRepository hubspotRepository;
    private final CurriculumRepository mongoDbRepository;

    @Bean
    public PersistancePort getHubspotPersistancePort(){
        return new HubspotPersistanceAdapter(hubspotRepository);
    }
    @Bean
    public PersistancePort getMongoDbPersistancePort(){
        return new PersistenceAdapter(mongoDbRepository);
    }
    @Bean
    public CurriculumUsecaseApi getCurriculumUseCaseWithHubspotBean(){
        return new CurriculumUseCaseApi(getHubspotPersistancePort());
    }
    @Bean
    public CurriculumUsecaseApi getCurriculumUseCaseWithMongoDbBean(){
        return new CurriculumUseCaseApi(getMongoDbPersistancePort());
    }

}
