package guru.springframework.myspringpetclinic.model.service;

import guru.springframework.myspringpetclinic.model.model.Owner;
import guru.springframework.myspringpetclinic.model.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Owner> findAll();

}
