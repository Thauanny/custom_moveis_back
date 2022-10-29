package com.customMoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customMoveis.model.Lojista;
import com.customMoveis.repository.lojistaRepository;

@Service
public class LojistaService {
    @Autowired
	private lojistaRepository lojistaRepository;


   public Lojista lojista(Integer id){
        return lojistaRepository.findById(id).get();
    }
}
