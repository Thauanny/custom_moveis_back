package com.customMoveis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.customMoveis.model.Lojista;
import com.customMoveis.model.movel.Movel;
import com.customMoveis.service.LojistaService;
import com.customMoveis.service.MovelService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class LogistaController {

    @Autowired
	private LojistaService lojistaService;
    @Autowired
	private MovelService movelService;

    @GetMapping("/lojista/{id}")
    public Lojista lojista(@PathVariable Integer id){
        return lojistaService.lojista(id);
    }

    @PostMapping("/moveis")
    public Movel cadastrarMoveis(@RequestBody Movel movel) {
        return movelService.cadastrarMoveis(movel);
    }
    
    
}
