package com.customMoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customMoveis.model.material.Material;
import com.customMoveis.repository.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public Material cadastrarMaterial(Material material) {

        return materialRepository.save(material);

    }

    public List<Material> materiaisFindAll() {
        return materialRepository.findAll();
    }

}
