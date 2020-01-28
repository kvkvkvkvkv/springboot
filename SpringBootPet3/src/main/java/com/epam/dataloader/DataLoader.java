package com.epam.dataloader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epam.model.Owner;
import com.epam.model.Vet;
import com.epam.services.OwnerMapService;
import com.epam.services.OwnerService;
import com.epam.services.VetMapService;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetMapService vetService;
	
	public DataLoader() {
		ownerService = new OwnerMapService();
		vetService = new VetMapService();
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Owner owner = new Owner();
		owner.setId(1L);
		owner.setFristName("kv");
		owner.setLastName("kv");
		
		ownerService.save(owner);
		
		Owner owner1 = new Owner();
		owner1.setId(2L);
		owner1.setFristName("kv");
		owner1.setLastName("kvkv");
		
		ownerService.save(owner1);
		System.out.println("inn");
		
		Vet vet = new Vet();
		vet.setId(1L);
		vet.setFristName("dog");
		vet.setLastName("doggo");
		
		vetService.save(vet);
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFristName("dog");
		vet1.setLastName("doggoooo");
		
		vetService.save(vet1);
	}

}
