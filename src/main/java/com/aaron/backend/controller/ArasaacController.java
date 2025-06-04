<<<<<<< HEAD
package com.aaron.backend.controller;

import com.aaron.backend.service.ArasaacService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controlador que permite un enlace ente los servicios y el frontend
@RestController
@RequestMapping("/api/arasaac")
//Esto permite peticiones desde otros dominios o puertos sin esto al hacer una peticion desde el frontend podria dar error
@CrossOrigin(origins = "*")
public class ArasaacController {

    private final ArasaacService arasaacService;

    public ArasaacController(ArasaacService arasaacService) {
        this.arasaacService = arasaacService;
    }

    /* Método que maneja las peticiones GET que se realizan a la URL /api/arasaac/ids. 
    Se encarga de obtener la palabra relacionada al pictograma que quiero buscar. 
    Y llama al servicio ArasaacService para recuperar los ids de las coincidencias pasandole la palabra.*/
    @GetMapping("/ids")
    public List<Integer> getIds(@RequestParam String palabra) {
        return arasaacService.getPictogramIds(palabra);
    }
}
=======
package com.aaron.backend.controller;

import com.aaron.backend.service.ArasaacService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controlador que permite un enlace ente los servicios y el frontend
@RestController
@RequestMapping("/api/arasaac")
//Esto permite peticiones desde otros dominios o puertos sin esto al hacer una peticion desde el frontend podria dar error
@CrossOrigin(origins = "*")
public class ArasaacController {

    private final ArasaacService arasaacService;

    public ArasaacController(ArasaacService arasaacService) {
        this.arasaacService = arasaacService;
    }

    /* Método que maneja las peticiones GET que se realizan a la URL /api/arasaac/ids. 
    Se encarga de obtener la palabra relacionada al pictograma que quiero buscar. 
    Y llama al servicio ArasaacService para recuperar los ids de las coincidencias pasandole la palabra.*/
    @GetMapping("/ids")
    public List<Integer> getIds(@RequestParam String palabra) {
        return arasaacService.getPictogramIds(palabra);
    }
}
>>>>>>> 4818661 (Proyecto inicial conectado a repo existente)
