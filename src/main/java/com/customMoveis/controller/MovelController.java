package com.customMoveis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.customMoveis.model.movel.Movel;
import com.customMoveis.service.MovelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/movel")
public class MovelController {

    @Autowired
    private MovelService movelService;

    @PostMapping("/register")
    public Movel cadastrarMoveis(@RequestBody Movel movel) {
        return movelService.cadastrarMoveis(movel);
    }

    @GetMapping("/{id}")
    public Movel movel(@PathVariable Integer id) {
        return movelService.movel(id);
    }

    @GetMapping("/all")
    public List<Movel> moveisFindAll() {
        return movelService.moveisFindAll();
    }

}
