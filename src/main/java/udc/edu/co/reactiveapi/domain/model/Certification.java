package udc.edu.co.reactiveapi.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Certification {
    private String name;
    private double hours;
    private String institution;
    private LocalDate certificationDate;
}
