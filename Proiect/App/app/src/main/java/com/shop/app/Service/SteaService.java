package com.shop.app.Service;

import com.shop.app.Entity.stea;

import java.util.List;

public interface SteaService {
    public String createStea(stea stea);
    public String updateStea(stea stea);
    public String deleteStea(int id_stea);
    public stea getStea(int id_stea);
    public List<stea> getAllStele();
}
