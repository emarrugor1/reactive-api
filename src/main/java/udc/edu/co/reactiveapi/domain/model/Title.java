package udc.edu.co.reactiveapi.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Title {
    private String name;
    private String institution;
    private LocalDate graduationDate;
}
