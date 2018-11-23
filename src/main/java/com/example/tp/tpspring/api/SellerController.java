package com.example.tp.tpspring.api;

import com.example.tp.tpspring.Services.SellerService;
import com.example.tp.tpspring.domain.Seller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {
    private SellerService sellerService;

    public SellerController(SellerService sellerService) {
        super();
        this.sellerService = sellerService;
    }
    @GetMapping("/")
    public ResponseEntity<List<Seller>> getSellerByOrderAsc(){
        return new ResponseEntity<List<Seller>>(sellerService.findAllByOrderByNameAsc(),HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Seller> createSeller(@RequestBody Seller seller) {
        return new ResponseEntity<Seller>(sellerService.createSeller(seller),HttpStatus.OK);

    }
    @DeleteMapping("/")
    public void deleteSellerById(Long id){
        sellerService.deleteById(id);
    }
    @PutMapping("/")
    public ResponseEntity<Seller> updateSeller(@RequestBody Seller seller) {
        return new ResponseEntity<Seller>(sellerService.updateSeller(seller),HttpStatus.OK);

    }
}
