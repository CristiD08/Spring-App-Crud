package com.shop.app.Repository;

import com.shop.app.Entity.produs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdusRepo extends JpaRepository <produs, Integer> {
}
