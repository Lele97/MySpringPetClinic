package guru.springframework.myspringpetclinic.model.service;

import guru.springframework.myspringpetclinic.model.model.Owner;

public interface OwnerInterface extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);
}
