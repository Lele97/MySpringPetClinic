package guru.springframework.myspringpetclinic.bootsttrap;


import guru.springframework.myspringpetclinic.model.model.Owner;
import guru.springframework.myspringpetclinic.model.model.Vet;
import guru.springframework.myspringpetclinic.model.service.OwnerService;
import guru.springframework.myspringpetclinic.model.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("DataLoader.run");
        System.out.println("**************");
        Owner owner1 = new Owner();
        owner1.setFristName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setFristName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);
        System.out.println("Loaded Owners....");
        Vet vet1 = new Vet();
        vet1.setFristName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);
        Vet vet2 = new Vet();
        vet2.setFristName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);
        System.out.println("Loaded Vets....");
    }
}
