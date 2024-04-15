package com.shop.app.Service;

import com.shop.app.Entity.comanda;

import java.util.List;

public interface ComandaService {
    public String createComanda(comanda comanda);
    public String updateComanda(comanda comanda);
    public String deleteComanda(int id_comanda);
    public comanda getComanda(int id_comanda);
    public List<comanda> getAllComenzi();

}
