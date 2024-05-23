package guru.springframework.myspringpetclinic.model.service.map;

import guru.springframework.myspringpetclinic.model.model.Pet;
import guru.springframework.myspringpetclinic.model.service.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
