package com.customMoveis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.customMoveis.model.Lojista;
import com.customMoveis.service.LojistaService;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/lojista")
public class LogistaController {

    @Autowired
    private LojistaService lojistaService;


    @GetMapping("/{id}")
    public ResponseEntity<?> lojista(@PathVariable Integer id) {
        return ResponseEntity.ok(lojistaService.lojista(id));
    }

    @GetMapping("/all")
    public List<Lojista> lojistas() {
        return lojistaService.lojistas();
    }

}
