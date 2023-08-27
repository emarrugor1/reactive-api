package udc.edu.co.reactiveapi.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import udc.edu.co.reactiveapi.domain.api.CurriculumUsecase;
import udc.edu.co.reactiveapi.domain.ports.PersistancePort;
import udc.edu.co.reactiveapi.domain.usecases.GetCurriculumVitaeUseCase;
import udc.edu.co.reactiveapi.persistence.adapters.PersistenceAdapter;
import udc.edu.co.reactiveapi.persistence.repository.CurriculumRepository;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final CurriculumRepository curriculumRepository;

    @Bean
    public PersistancePort getPersistancePort(){
        return new PersistenceAdapter(curriculumRepository);
    }
    @Bean
    public CurriculumUsecase getCurriculumUseCase(){
        return new GetCurriculumVitaeUseCase(getPersistancePort());
    }

}
