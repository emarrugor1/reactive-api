package udc.edu.co.reactiveapi.domain.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitae {
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
