package guru.springframework.myspringpetclinic.model.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {

    private Long id;

    public boolean isNew() {
        return this.id == null;
    }
}
