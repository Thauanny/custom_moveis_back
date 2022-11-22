package com.customMoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customMoveis.model.material.Material;
import com.customMoveis.model.movel.Cadeira;
import com.customMoveis.model.movel.Escrivaninha;
import com.customMoveis.model.movel.GuardaRoupa;
import com.customMoveis.model.movel.GuardaRoupasComEspelho;
import com.customMoveis.model.movel.Mesa;
import com.customMoveis.model.movel.Movel;
import com.customMoveis.model.movel.Sofa;
import com.customMoveis.repository.MaterialRepository;
import com.customMoveis.repository.MovelRepository;

@Service
public class MovelService {
    @Autowired
    private MovelRepository movelRepository;
    @Autowired
    private MaterialRepository materialRepository;
    

    public Cadeira cadastrarCadeira(Cadeira movel) {

        return movelRepository.save(movel);

    }

    public Mesa cadastrarMesa(Mesa movel) {

        return movelRepository.save(movel);

    }

    public Escrivaninha cadastrarEscrivaninha(Escrivaninha movel) {

        return movelRepository.save(movel);

    }

    public Sofa cadastrarSofa(Sofa movel) {

        return movelRepository.save(movel);

    }

    public GuardaRoupa cadastrarGuardaRoupa(GuardaRoupa movel) {

        return movelRepository.save(movel);

    }

    public GuardaRoupasComEspelho cadastrarGuardaRoupasComEspelho(GuardaRoupasComEspelho movel) {

        return movelRepository.save(movel);

    }

    public Material cadastrarMaterial(Material material) {

        return materialRepository.save(material);

    }

    public List<Movel> moveisFindAll() {
        return movelRepository.findAll();
    }

    public Movel movel(Integer id) {
        return movelRepository.findById(id).get();
    }

}
