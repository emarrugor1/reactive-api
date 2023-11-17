package udc.edu.co.reactiveapi.persistence.hubspot.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.persistence.hubspot.dto.HubspotCreateResponse;
import udc.edu.co.reactiveapi.persistence.hubspot.entities.CurriculumHubspot;

import java.util.HashMap;
import java.util.Map;

@Component
public class HubspotRepository {
    private final WebClient webClient;

    public HubspotRepository(@Value("${spring.data.hubspot.endpoints.url}") String apiUrl,
                         @Value("${spring.data.hubspot.token-reactive-api}") String apiKey) {
        this.webClient = WebClient.builder()
                .baseUrl(apiUrl)
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .build();
    }
    public Mono<HubspotCreateResponse> createContact(CurriculumHubspot contact) {
        Map<String,CurriculumHubspot> request = new HashMap<>();
        request.put("properties",contact);
        return webClient.post()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(HubspotCreateResponse.class);
    }
}
