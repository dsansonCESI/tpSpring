package com.example.tp.tpspring.repository;

import com.example.tp.tpspring.domain.Product;
import com.example.tp.tpspring.domain.Seller;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SellerRepository extends CrudRepository<Seller,Long> {
    List<Seller> findAllByOrderByNameAsc();

}
