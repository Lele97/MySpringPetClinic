package guru.springframework.myspringpetclinic.model.service;

import guru.springframework.myspringpetclinic.model.Owner;

import java.util.List;

public interface OwnerInterface {

    Owner findByLastName(String lastname);

    Owner findById(Long id);

    Owner save(Owner owner);

    List<Owner> findAll();
}
