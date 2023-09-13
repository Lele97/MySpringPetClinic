package guru.springframework.myspringpetclinic.model.model;

import java.util.Locale;

public class Pet extends BaseEntity{

    private PetType petType;
    private Owner ovner;
    private Locale birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOvner() {
        return ovner;
    }

    public void setOvner(Owner ovner) {
        this.ovner = ovner;
    }

    public Locale getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Locale birthDate) {
        this.birthDate = birthDate;
    }
}
