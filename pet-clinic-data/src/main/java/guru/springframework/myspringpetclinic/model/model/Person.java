package guru.springframework.myspringpetclinic.model.model;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Person extends BaseEntity {

    private String fristName;

    private String lastName;
}
