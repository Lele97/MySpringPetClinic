package guru.springframework.myspringpetclinic.model.service;

import guru.springframework.myspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
