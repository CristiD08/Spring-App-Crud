package com.shop.app.Service.Impl;

import com.shop.app.Entity.clienti;
import com.shop.app.Repository.ClientiRepo;
import com.shop.app.Service.ClientiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientiImpl implements ClientiService {

    ClientiRepo clientiRepo;

    public ClientiImpl(ClientiRepo clientiRepo) {
        this.clientiRepo = clientiRepo;
    }

    @Override
    public String createClient(clienti clienti){
        clientiRepo.save(clienti);
        return "Ok";
    }

    @Override
    public String updateClient(clienti clienti){
        clientiRepo.save(clienti);
        return "Updated";
    }

    @Override
    public String deleteClient(int id_client){
        clientiRepo.deleteById(id_client);
        return "Deleted";
    }

    @Override
    public clienti getClient(int id_client){
        return clientiRepo.findById(id_client).get();
    }

    @Override
    public List<clienti> getAllClienti(){
        return clientiRepo.findAll();
    }

}
