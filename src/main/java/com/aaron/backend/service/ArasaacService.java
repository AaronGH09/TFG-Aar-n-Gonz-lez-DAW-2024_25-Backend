package com.aaron.backend.service;

import java.util.List;

//Interfaz con los servicios para la API de ARASAAC.
public interface ArasaacService {

    //Metodo para busca pictogramas relacionados con una palabra y devuelve sus ids.
    List<Integer> getPictogramIds(String word);
}