package udc.edu.co.reactiveapi.persistence.hubspot.mappers;

import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;
import udc.edu.co.reactiveapi.persistence.hubspot.dto.HubspotCreateResponse;
import udc.edu.co.reactiveapi.persistence.hubspot.entities.CurriculumHubspot;

public class HubspotMapper {
    private HubspotMapper(){}
    public static CurriculumHubspot toCurriculumHubspot(CurriculumVitae curriculumVitae){
        return CurriculumHubspot.builder()
                .dateOfBirth(curriculumVitae.getDateOfBirth())
                .experience(curriculumVitae.getExperience())
                .email(curriculumVitae.getEmail())
                .academicBackground(curriculumVitae.getAcademicBackground())
                .fullName(curriculumVitae.getFullName())
                .numberId(curriculumVitae.getNumberId())
                .typeId(curriculumVitae.getTypeId())
                .phoneNumber(curriculumVitae.getPhoneNumber())
                .professionalProfile(curriculumVitae.getProfessionalProfile())
                .technicalKnowledge(curriculumVitae.getTechnicalKnowledge())
                .build();
    }
    public static CurriculumVitae toCurriculumVitae(CurriculumHubspot curriculumHubspot){
        return CurriculumVitae.builder()
                .dateOfBirth(curriculumHubspot.getDateOfBirth())
                .experience(curriculumHubspot.getExperience())
                .email(curriculumHubspot.getEmail())
                .academicBackground(curriculumHubspot.getAcademicBackground())
                .fullName(curriculumHubspot.getFullName())
                .numberId(curriculumHubspot.getNumberId())
                .typeId(curriculumHubspot.getTypeId())
                .phoneNumber(curriculumHubspot.getPhoneNumber())
                .professionalProfile(curriculumHubspot.getProfessionalProfile())
                .technicalKnowledge(curriculumHubspot.getTechnicalKnowledge())
                .build();
    }
    public static CurriculumVitae responseToCurriculumHubspot(HubspotCreateResponse response){
        return CurriculumVitae.builder()
                .dateOfBirth(response.getProperties().getDateOfBirth())
                .experience(response.getProperties().getExperience())
                .email(response.getProperties().getEmail())
                .academicBackground(response.getProperties().getAcademicBackground())
                .fullName(response.getProperties().getFullName())
                .numberId(response.getProperties().getNumberId())
                .typeId(response.getProperties().getTypeId())
                .phoneNumber(response.getProperties().getPhoneNumber())
                .professionalProfile(response.getProperties().getProfessionalProfile())
                .technicalKnowledge(response.getProperties().getTechnicalKnowledge())
                .build();
    }
}
