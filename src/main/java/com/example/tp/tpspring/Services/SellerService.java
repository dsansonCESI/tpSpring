package com.example.tp.tpspring.Services;

import com.example.tp.tpspring.domain.Seller;
import com.example.tp.tpspring.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service("sellerService")
public class SellerService {
    private SellerRepository sellerRepository;

    @Autowired
    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public List<Seller> findAllByOrderByNameAsc(){
        List<Seller> listSeller = sellerRepository.findAllByOrderByNameAsc();
        return listSeller;
    }
    public Seller createSeller(Seller seller){
        Seller newSeller = sellerRepository.save(seller);
        return newSeller;
    }
    public void deleteById(Long id){
        sellerRepository.deleteById(id);
    }
    public Seller updateSeller(Seller seller){
        Seller updateSeller = sellerRepository.save(seller);
        return updateSeller;
    }



}
