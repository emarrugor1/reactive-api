package udc.edu.co.reactiveapi.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AcademicBackground {
    private List<Title> titles;
    private List<Certification> certifications;
}
