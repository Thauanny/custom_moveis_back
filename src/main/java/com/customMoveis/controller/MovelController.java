package com.customMoveis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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
    public ResponseEntity<?> cadastrarMoveis(@RequestBody Cadeira movel) {

        try {
            Cadeira resMovel = movelService.cadastrarCadeira(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PutMapping("/register/cadeira}")
    public ResponseEntity<?> AtualizarMoveis(@RequestBody Cadeira movel) {

        try {
            Cadeira resMovel = movelService.cadastrarCadeira(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar material antes\"}");
        }

    }

    @PostMapping("/register/mesa")
    public ResponseEntity<?> cadastrarMoveis(@RequestBody Mesa movel) {

        try {
            Mesa resMovel = movelService.cadastrarMesa(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PutMapping("/register/mesa")
    public ResponseEntity<?> AtualizarMoveis(@RequestBody Mesa movel) {
        try {
            Mesa resMovel = movelService.cadastrarMesa(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PostMapping("/register/escrivaninha")
    public ResponseEntity<?> cadastrarMoveis(@RequestBody Escrivaninha movel) {
        try {
            Escrivaninha resMovel = movelService.cadastrarEscrivaninha(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PutMapping("/register/escrivaninha")
    public ResponseEntity<?> AtualizarMoveis(@RequestBody Escrivaninha movel) {

        try {
            Escrivaninha resMovel = movelService.cadastrarEscrivaninha(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PostMapping("/register/sofa")
    public ResponseEntity<?> cadastrarMoveis(@RequestBody Sofa movel) {

        try {
            Sofa resMovel = movelService.cadastrarSofa(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PutMapping("/register/sofa")
    public ResponseEntity<?> AtualizarMoveis(@RequestBody Sofa movel) {
        try {
            Sofa resMovel = movelService.cadastrarSofa(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PostMapping("/register/guardaRoupa")
    public ResponseEntity<?> cadastrarMoveis(@RequestBody GuardaRoupa movel) {
        try {
            GuardaRoupa resMovel = movelService.cadastrarGuardaRoupa(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PutMapping("/register/guardaRoupa")
    public ResponseEntity<?> AtualizarMoveis(@RequestBody GuardaRoupa movel) {

        try {
            GuardaRoupa resMovel = movelService.cadastrarGuardaRoupa(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PostMapping("/register/guardaRoupaEspelhado")
    public ResponseEntity<?> cadastrarMoveis(@RequestBody GuardaRoupasComEspelho movel) {

        try {
            GuardaRoupasComEspelho resMovel = movelService.cadastrarGuardaRoupasComEspelho(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }

    }

    @PutMapping("/register/guardaRoupaEspelhado")
    public ResponseEntity<?> AtualizarMoveis(@RequestBody GuardaRoupasComEspelho movel) {

        try {
            GuardaRoupasComEspelho resMovel = movelService.cadastrarGuardaRoupasComEspelho(movel);
            return ResponseEntity.ok(resMovel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Necessario cadastrar lojista ou material antes\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> movel(@PathVariable Integer id) {

        try {
            Movel movel = movelService.movel(id);
            return ResponseEntity.ok(movel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\": \"Nao encontrado\"}");
        }

    }

    @GetMapping("/all")
    public ResponseEntity<?> moveisFindAll() {
        List<Movel> movel = movelService.moveisFindAll();
        if (!(movel.isEmpty())) {
            return ResponseEntity.ok(movel);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"message\": \"Nao existem moveis registrados\"}");
        }

    }

    @GetMapping("/valor/{id}")
    public ResponseEntity<?> valor(@PathVariable Integer id) {

        try {
            Movel movel = movelService.movel(id);
            double valor = movel.getValor() + movel.getMaterial().getValor();
            return ResponseEntity.ok("{\"body\": " + valor + "}");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"message\": \"Movel nao encontrado\"}");
        }

    }

}
