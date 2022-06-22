package com.cebem.transformatolotu.controllers;

import com.cebem.transformatolotu.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Principal {

    @GetMapping("/cuenta/{palabra}")
    public String count(@PathVariable String palabra) {
        return Utils.cuenta(palabra);

    }
}