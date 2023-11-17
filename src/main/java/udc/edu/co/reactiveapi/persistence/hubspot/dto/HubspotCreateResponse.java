package udc.edu.co.reactiveapi.persistence.hubspot.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import udc.edu.co.reactiveapi.persistence.hubspot.entities.CurriculumHubspot;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HubspotCreateResponse {
    private String id;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private CurriculumHubspot properties;
}
