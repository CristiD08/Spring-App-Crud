package com.shop.app.Service.Impl;

import com.shop.app.Entity.produs;
import com.shop.app.Repository.ProdusRepo;
import com.shop.app.Service.ProdusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdusImpl implements ProdusService {

    ProdusRepo produsRepo;

    public ProdusImpl(ProdusRepo produsRepo) {
        this.produsRepo = produsRepo;
    }

    @Override
    public String createProdus(produs produs){
        produsRepo.save(produs);
        return "Ok";
    }

    @Override
    public String updateProdus(produs produs){
        produsRepo.save(produs);
        return "Updated";
    }

    @Override
    public String deleteProdus(int id_produs){
        produsRepo.deleteById(id_produs);
        return "Deleted";
    }

    @Override
    public produs getProdus(int id_produs){
        return produsRepo.findById(id_produs).get();
    }

    @Override
    public List<produs> getAllProduse(){
        return produsRepo.findAll();
    }

}
