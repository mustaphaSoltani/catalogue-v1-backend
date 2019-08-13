package org.must.catservice;

import org.must.catservice.dao.ProduitRepository;
import org.must.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {
@Autowired
private ProduitRepository produitRepository;
@Autowired
private RepositoryRestConfiguration restConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Produit.class);
        produitRepository.save(new Produit(null,"Ordinateur dell",1200,50));
        produitRepository.save(new Produit(null,"Smartpfhone",423,100));
        produitRepository.save(new Produit(null,"tablette hp",852,88));

        produitRepository.findAll().forEach(produit -> {
            System.out.println(produit.toString());
        });


    }
}
