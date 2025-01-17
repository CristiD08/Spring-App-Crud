package com.shop.app.Service;

import com.shop.app.Entity.clienti;

import java.util.List;

public interface ClientiService {
    public String createClient(clienti clienti);
    public String updateClient(clienti clienti);
    public String deleteClient(int id_client);
    public clienti getClient(int id_client);
    public List<clienti> getAllClienti();
}
