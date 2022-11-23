package com.customMoveis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.customMoveis.model.material.Material;
import com.customMoveis.service.MaterialService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @PostMapping("/register")
    public ResponseEntity<?> cadastrarMateriais(@RequestBody Material material) {
        try {
            Material resMaterial = materialService.cadastrarMaterial(material);
            return ResponseEntity.ok(resMaterial);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Nao foi possivel cadastrar material\"}");
        }

    }

    @GetMapping("/all")
    public ResponseEntity<?> materiaisFindAll() {
        try {
            List<Material> resMaterial = materialService.materiaisFindAll();
            return ResponseEntity.ok(resMaterial);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"message\": \"Sem materiais cadastrados\"}");
        }

    }

}
