package com.shop.app.Service;

import com.shop.app.Entity.factura;

import java.util.List;

public interface FacturaService {
    public String createFactura(factura factura);
    public String updateFactura(factura factura);
    public String deleteFactura(int id_factura);
    public factura getFactura(int id_factura);
    public List<factura> getAllFacturi();
}
