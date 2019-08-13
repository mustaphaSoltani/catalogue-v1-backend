package org.must.catservice.dao;

import org.must.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProduitRestService {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(value="/listProduit")
    public List<Produit> produitList() {
        return produitRepository.findAll();
    }

    @GetMapping(value="/listProduit/{id}")
    public Produit produitList(@PathVariable(name = "id") Long id) {
        return produitRepository.findById(id).get();
    }

    @PutMapping(value="/listProduit/{id}")
    public Produit update(@PathVariable(name = "id") Long id, @RequestBody Produit p) {
        p.setId(id);
        return produitRepository.save(p);
    }

    @PostMapping(value="/listProduit/{id}")
    public Produit save(@RequestBody Produit p) {
        return produitRepository.save(p);
    }

    @DeleteMapping(value="/listProduit/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        produitRepository.deleteById(id);
    }
}
