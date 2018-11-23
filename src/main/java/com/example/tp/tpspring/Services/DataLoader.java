package com.example.tp.tpspring.Services;

import com.example.tp.tpspring.domain.Product;
import com.example.tp.tpspring.domain.Seller;
import com.example.tp.tpspring.repository.ProductRepository;
import com.example.tp.tpspring.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Date;

@Service("DataLoader")
public class DataLoader {
    private ProductRepository productRepository;
    private SellerRepository sellerRepository;

    @Autowired
    public DataLoader(ProductRepository productRepository, SellerRepository sellerRepository) {
        super();
        this.productRepository = productRepository;
        this.sellerRepository = sellerRepository;
    }

    @PostConstruct
    private void loadData(){

        Seller seller1 = new Seller(null,"Sanson","30 rue ","31000","Toulouse",null);
        sellerRepository.save(seller1);
        Seller seller2 = new Seller(null,"Albator","30 rue ","31000","Toulouse",null);
        sellerRepository.save(seller2);
        Product product = new Product(null,"TV","Télévision HD","/images/tv85h20.png",1111.99, Date.valueOf("2003-10-10"),seller1);
        productRepository.save(product);
        Product product2 = new Product(null,"HIFI","Hifi","/images/tv85h20.png",1111.99, Date.valueOf("2018-10-10"),seller1);
        productRepository.save(product2);

    }
}
