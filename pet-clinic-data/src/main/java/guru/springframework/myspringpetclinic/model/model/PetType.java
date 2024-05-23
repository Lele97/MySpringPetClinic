package guru.springframework.myspringpetclinic.model.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PetType extends BaseEntity{

    private String name;

    public PetType(String name) {
        this.name = name;
    }
}
