package com.customMoveis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Material cadastrarMateriais(@RequestBody Material material) {
        return materialService.cadastrarMaterial(material);
    }

    @GetMapping("/all")
    public List<Material> materiaisFindAll() {
        return materialService.materiaisFindAll();
    }


}
