package udc.edu.co.reactiveapi.domain.model;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitae {
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
