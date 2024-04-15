package com.shop.app.Service.Impl;

import com.shop.app.Entity.comanda;
import com.shop.app.Repository.ComandaRepo;
import com.shop.app.Service.ComandaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComandaImpl implements ComandaService {

    ComandaRepo comandaRepo;

    public ComandaImpl(ComandaRepo comandaRepo) {
        this.comandaRepo = comandaRepo;
    }

    @Override
    public String createComanda(comanda comanda) {
        comandaRepo.save(comanda);
        return "Ok";
    }

    @Override
    public String updateComanda(comanda comanda) {
        comandaRepo.save(comanda);
        return "Updated";
    }

    @Override
    public String deleteComanda(int id_comanda){
        comandaRepo.deleteById(id_comanda);
        return "Deleted";
    }

    @Override
    public comanda getComanda(int id_comanda){
        return comandaRepo.findById(id_comanda).get();
    }

    @Override
    public List<comanda> getAllComenzi(){
        return comandaRepo.findAll();
    }


}
