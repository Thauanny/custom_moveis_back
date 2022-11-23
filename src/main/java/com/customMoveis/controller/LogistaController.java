package com.customMoveis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.customMoveis.service.LojistaService;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/lojista")
public class LogistaController {

    @Autowired
    private LojistaService lojistaService;

    @GetMapping("/{id}")
    public ResponseEntity<?> lojista(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(lojistaService.lojista(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Nao foi possivel cadastrar lojista\"}");
        }

    }

    @GetMapping("/all")
    public ResponseEntity<?> lojistas() {

        try {
            return ResponseEntity.ok(lojistaService.lojistas());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"message\": \"Lojista nao encontrado\"}");
        }

    }

}
