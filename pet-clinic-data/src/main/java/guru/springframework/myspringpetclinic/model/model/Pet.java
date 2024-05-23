package guru.springframework.myspringpetclinic.model.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Locale;

@EqualsAndHashCode(callSuper = true)
@Data
public class Pet extends BaseEntity{

    private PetType petType;

    private Owner ovner;

    private Locale birthDate;
}
