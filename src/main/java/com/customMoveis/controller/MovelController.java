package com.customMoveis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customMoveis.model.material.Material;
import com.customMoveis.model.movel.Cadeira;
import com.customMoveis.model.movel.Escrivaninha;
import com.customMoveis.model.movel.GuardaRoupa;
import com.customMoveis.model.movel.GuardaRoupasComEspelho;
import com.customMoveis.model.movel.Mesa;
import com.customMoveis.model.movel.Movel;
import com.customMoveis.model.movel.Sofa;
import com.customMoveis.service.MovelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/movel")
public class MovelController {

    @Autowired
    private MovelService movelService;

    @PostMapping("/register/cadeira")
    public Cadeira cadastrarMoveis(@RequestBody Cadeira movel) {
        return movelService.cadastrarCadeira(movel);
    }

    @PutMapping("/register/cadeira}")
    public Cadeira AtualizarMoveis(@RequestBody Cadeira movel) {

        return movelService.cadastrarCadeira(movel);
    }

    @PostMapping("/register/mesa")
    public Mesa cadastrarMoveis(@RequestBody Mesa movel) {
        return movelService.cadastrarMesa(movel);
    }

    @PutMapping("/register/mesa")
    public Mesa AtualizarMoveis(@RequestBody Mesa movel) {

        return movelService.cadastrarMesa(movel);
    }

    @PostMapping("/register/escrivaninha")
    public Escrivaninha cadastrarMoveis(@RequestBody Escrivaninha movel) {
        return movelService.cadastrarEscrivaninha(movel);
    }

    @PutMapping("/register/escrivaninha")
    public Escrivaninha AtualizarMoveis(@RequestBody Escrivaninha movel) {

        return movelService.cadastrarEscrivaninha(movel);
    }

    @PostMapping("/register/sofa")
    public Sofa cadastrarMoveis(@RequestBody Sofa movel) {
        return movelService.cadastrarSofa(movel);
    }

    @PutMapping("/register/sofa")
    public Sofa AtualizarMoveis(@RequestBody Sofa movel) {

        return movelService.cadastrarSofa(movel);
    }

    @PostMapping("/register/guardaRoupa")
    public GuardaRoupa cadastrarMoveis(@RequestBody GuardaRoupa movel) {
        return movelService.cadastrarGuardaRoupa(movel);
    }

    @PutMapping("/register/guardaRoupa")
    public GuardaRoupa AtualizarMoveis(@RequestBody GuardaRoupa movel) {

        return movelService.cadastrarGuardaRoupa(movel);
    }

    @PostMapping("/register/guardaRoupaEspelhado")
    public GuardaRoupasComEspelho cadastrarMoveis(@RequestBody GuardaRoupasComEspelho movel) {
        return movelService.cadastrarGuardaRoupasComEspelho(movel);
    }

    @PutMapping("/register/guardaRoupaEspelhado")
    public GuardaRoupasComEspelho AtualizarMoveis(@RequestBody GuardaRoupasComEspelho movel) {

        return movelService.cadastrarGuardaRoupasComEspelho(movel);
    }

    @PostMapping("/register/material")
    public Material cadastrarMateriais(@RequestBody Material material) {
        return movelService.cadastrarMaterial(material);
    }

    @GetMapping("/{id}")
    public Movel movel(@PathVariable Integer id) {
        return movelService.movel(id);
    }

    @GetMapping("/all")
    public List<Movel> moveisFindAll() {
        return movelService.moveisFindAll();
    }

    @GetMapping("/valor/{id")
    public double valor(@PathVariable Integer id) {

        Movel movel = movelService.movel(id);
        double valor = movel.getValor() + movel.getMaterial().getValor();

        return valor;
    }

}
