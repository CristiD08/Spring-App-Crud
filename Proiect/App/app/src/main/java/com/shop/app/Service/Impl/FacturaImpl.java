package com.shop.app.Service.Impl;

import com.shop.app.Entity.factura;
import com.shop.app.Repository.FacturaRepo;
import com.shop.app.Service.FacturaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaImpl implements FacturaService {

    FacturaRepo facturaRepo;

    public FacturaImpl(FacturaRepo facturaRepo) {
        this.facturaRepo = facturaRepo;
    }

    @Override
    public String createFactura(factura factura) {
        facturaRepo.save(factura);
        return "Ok";
    }

    @Override
    public String updateFactura(factura factura){
        facturaRepo.save(factura);
        return "Updated";
    }

    @Override
    public String deleteFactura(int id_factura) {
        facturaRepo.deleteById(id_factura);
        return "Deleted";
    }

    @Override
    public factura getFactura(int id_factura) {
        return facturaRepo.findById(id_factura).get();
    }

    @Override
    public List<factura> getAllFacturi() {
        return facturaRepo.findAll();
    }


}
