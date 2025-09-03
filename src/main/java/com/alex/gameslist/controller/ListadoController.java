package com.alex.gameslist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {

    @RequestMapping("")
    public String listarVideojuegos() {
        //lista los videojuegos
        return "listado";
    }
}
