package com.customMoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customMoveis.model.movel.Movel;
import com.customMoveis.repository.MovelRepository;

@Service
public class MovelService {
    @Autowired
   private MovelRepository movelRepository;

   public Movel cadastrarMoveis(Movel movel){
    return movelRepository.save(movel);
   }

   public List<Movel> moveisFindAll(){
    return movelRepository.findAll();
   }

   public Movel movel(Integer id){
    return movelRepository.findById(id).get();
   }
 
   
}
