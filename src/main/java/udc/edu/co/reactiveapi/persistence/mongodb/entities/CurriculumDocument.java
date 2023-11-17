package udc.edu.co.reactiveapi.persistence.mongodb.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private String email;
    private String dateOfBirth;
    private String phoneNumber;
    private String numberId;
    private String typeId;
    private String professionalProfile;
    private String technicalKnowledge;
    private String experience;
    private String academicBackground;
}
