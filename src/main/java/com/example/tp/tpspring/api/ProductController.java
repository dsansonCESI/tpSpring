package com.example.tp.tpspring.api;

import com.example.tp.tpspring.Services.ProductService;
import com.example.tp.tpspring.Services.SellerService;
import com.example.tp.tpspring.domain.Product;
import com.example.tp.tpspring.domain.Seller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product")
public class ProductController {
        private ProductService productService;

        public ProductController(ProductService productService) {
            super();
            this.productService = productService;
        }
        @GetMapping("/")
        public ResponseEntity<List<Product>> getProductByOrderDesc(){
            return new ResponseEntity<List<Product>>(productService.findAllByOrderByCreatedOnDesc(),HttpStatus.OK);
        }
        @PostMapping("/")
        public ResponseEntity<Product> createProduct(@RequestBody Product product) {
            return new ResponseEntity<Product>(productService.createProduct(product),HttpStatus.OK);

        }
        @DeleteMapping("/")
        public void deleteSellerById(Long id){
            productService.deleteById(id);
        }
        @PutMapping("/")
        public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
            return new ResponseEntity<Product>(productService.updateProduct(product),HttpStatus.OK);
        }
}


