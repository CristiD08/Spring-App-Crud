package com.shop.app.Controller;

import com.shop.app.Entity.clienti;
import com.shop.app.Service.ClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/clienti")
public class ClientiController
{
    @Autowired
    ClientiService clientiService;

    public ClientiController(ClientiService clientiService) {
        this.clientiService = clientiService;
    }

    @GetMapping("/{id_client}")
    public clienti getClient(@PathVariable("id_client") int id_client)
    {
        return clientiService.getClient(id_client);
    }

    @GetMapping
    public List<clienti> getAllClienti()
    {
        return clientiService.getAllClienti();
    }

    @PostMapping
    public String createClient(@RequestBody clienti client)
    {
        clientiService.createClient(client);
        return "Client creat cu succes";
    }

    @PutMapping("/update_client/{id_client}")
    public String updateClient(@PathVariable("id_client") int id_client, @RequestBody clienti client)
    {
        clienti client_update = clientiService.getClient(id_client);
        client_update.setNume(client.getNume());
        client_update.setPrenume(client.getPrenume());
        client_update.setCi(client.getCi());
        client_update.setAdresa(client.getAdresa());
        clientiService.updateClient(client_update);
        return "Client actualizat cu succes";
    }


    @DeleteMapping("/deleteClient-{id_client}")
    public String deleteClient(@PathVariable("id_client") int id_client)
    {
        clientiService.deleteClient(id_client);
        return "Client sters cu succes";
    }


}
