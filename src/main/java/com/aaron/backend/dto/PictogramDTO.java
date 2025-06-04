package com.aaron.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
//Esta es el DTO que representa un pictograma recibido desde la API de ARASAAC para sacar los ids de estos
public class PictogramDTO {

    @JsonProperty("_id") //Nombre de la propiedad que voy a querer almacenar del Json y desde la cual 
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}