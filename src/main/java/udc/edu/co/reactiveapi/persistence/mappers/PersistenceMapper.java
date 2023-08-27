package udc.edu.co.reactiveapi.persistence.mappers;

import udc.edu.co.reactiveapi.domain.model.CurriculumVitae;
import udc.edu.co.reactiveapi.persistence.entities.CurriculumDocument;

public class PersistenceMapper {
    private PersistenceMapper(){}
    public static CurriculumDocument toCurriculumDocument(CurriculumVitae curriculumVitae){
        return CurriculumDocument.builder()
                .dateOfBirth(curriculumVitae.getDateOfBirth())
                .experience(curriculumVitae.getExperience())
                .academicBackground(curriculumVitae.getAcademicBackground())
                .fullName(curriculumVitae.getFullName())
                .numberId(curriculumVitae.getNumberId())
                .typeId(curriculumVitae.getTypeId())
                .phoneNumber(curriculumVitae.getPhoneNumber())
                .professionalProfile(curriculumVitae.getProfessionalProfile())
                .technicalKnowledge(curriculumVitae.getTechnicalKnowledge())
                .build();
    }
    public static CurriculumVitae toCurriculumVitae(CurriculumDocument curriculumDocument){
        return CurriculumVitae.builder()
                .dateOfBirth(curriculumDocument.getDateOfBirth())
                .experience(curriculumDocument.getExperience())
                .academicBackground(curriculumDocument.getAcademicBackground())
                .fullName(curriculumDocument.getFullName())
                .numberId(curriculumDocument.getNumberId())
                .typeId(curriculumDocument.getTypeId())
                .phoneNumber(curriculumDocument.getPhoneNumber())
                .professionalProfile(curriculumDocument.getProfessionalProfile())
                .technicalKnowledge(curriculumDocument.getTechnicalKnowledge())
                .build();
    }

}
