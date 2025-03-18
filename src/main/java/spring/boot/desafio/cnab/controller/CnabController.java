package spring.boot.desafio.cnab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.boot.desafio.cnab.service.CnabService;

@RestController
@RequestMapping("/cnab")
public class CnabController {

    @Autowired
    private CnabService cnabService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestPa) {
        return entity;
    }
}
