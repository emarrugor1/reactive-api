package udc.edu.co.reactiveapi.persistence.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import udc.edu.co.reactiveapi.domain.model.AcademicBackground;
import udc.edu.co.reactiveapi.domain.model.Experience;

import java.time.LocalDate;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "curriculums")
public class CurriculumDocument {
    @Id
    private String id;
    private String fullName;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String numberId;
    private String typeId;
    private String professionalProfile;
    private String technicalKnowledge;
    private Experience experience;
    private AcademicBackground academicBackground;
}
