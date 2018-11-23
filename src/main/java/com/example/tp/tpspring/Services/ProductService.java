package com.example.tp.tpspring.Services;

import com.example.tp.tpspring.domain.Product;
import com.example.tp.tpspring.domain.Seller;
import com.example.tp.tpspring.repository.ProductRepository;
import com.example.tp.tpspring.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ProductService")
public class ProductService {
        private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllByOrderByCreatedOnDesc(){
            List<Product> listProduct = productRepository.findAllByOrderByCreatedOnDesc();
            return listProduct;
        }
    public Product createProduct(Product product){
        Product newProduct = productRepository.save(product);
        return newProduct;
    }
    public void deleteById(Long id){
        productRepository.deleteById(id);
    }
    public Product updateProduct(Product product){
        Product updateProduct = productRepository.save(product);
        return updateProduct;
    }
}
