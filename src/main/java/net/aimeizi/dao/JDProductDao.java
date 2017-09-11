package net.aimeizi.dao;

import net.aimeizi.domain.Product;
import java.util.List;

public interface JDProductDao {
    void save(Product product);

    List<Product> findAll();
}