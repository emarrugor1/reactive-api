package udc.edu.co.reactiveapi.persistence.hubspot.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class CurriculumHubspot {
    @JsonProperty("firstname")
    private String fullName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("fecha_de_nacimiento")
    private String dateOfBirth;
    @JsonProperty("phone")
    private String phoneNumber;
    @JsonProperty("numero_identificacion")
    private String numberId;
    @JsonProperty("tipo_identificacion")
    private String typeId;
    @JsonProperty("professional_profile")
    private String professionalProfile;
    @JsonProperty("conocimiento_tecnico")
    private String technicalKnowledge;
    @JsonProperty("experiencia")
    private String experience;
    @JsonProperty("formacion_academica")
    private String academicBackground;
}
