<<<<<<< HEAD
package com.aaron.backend.service;

import com.aaron.backend.dto.PictogramDTO;
import com.aaron.backend.exception.ArasaacException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArasaacServiceImpl implements ArasaacService {

//    RestTemplate permite hacer solicitudes http como get a otra api en este caso la API de ARASAAC
    private final RestTemplate restTemplate = new RestTemplate();

//    Basicamente en este metodo creamos las url de la api con la palabra que le pasamos y posteriormente hacemos el llamado a la api gracias a RestTemplate y guardamos el
//    resultado en un array de PictogramDTO el cual luego recoremos con un bucle para guardar los ids en una lista la cual luego devolvemos.
    @Override
    public List<Integer> getPictogramIds(String word) {

        // Creación de la URL para la búsqueda de pictogramas en español
        String url = "https://api.arasaac.org/v1/pictograms/es/search/" + word;

        try {
            // Realiza una solicitud GET a la URL y espera un arreglo de objetos PictogramDTO como respuesta
            ResponseEntity<PictogramDTO[]> response = restTemplate.getForEntity(url, PictogramDTO[].class);

            // Recorre el arreglo de pictogramas y extrae sus IDs en una lista la cual se devuelve
            if (response.getBody() != null) {
                List<Integer> ids = new ArrayList<>();
                for (PictogramDTO pictograma : response.getBody()) {
                    ids.add(pictograma.getId());
                }
                return ids;
            }
        } catch (Exception e) {
            // Lanza una excepción si ocurre un error
            throw new ArasaacException("Error al conectar con ARASAAC", HttpStatus.NOT_FOUND);
        }
        // Retorna una lista vacía si no se encontró ningún pictograma
        return List.of();
    }
=======
package com.aaron.backend.service;

import com.aaron.backend.dto.PictogramDTO;
import com.aaron.backend.exception.ArasaacException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArasaacServiceImpl implements ArasaacService {

//    RestTemplate permite hacer solicitudes http como get a otra api en este caso la API de ARASAAC
    private final RestTemplate restTemplate = new RestTemplate();

//    Basicamente en este metodo creamos las url de la api con la palabra que le pasamos y posteriormente hacemos el llamado a la api gracias a RestTemplate y guardamos el
//    resultado en un array de PictogramDTO el cual luego recoremos con un bucle para guardar los ids en una lista la cual luego devolvemos.
    @Override
    public List<Integer> getPictogramIds(String word) {

        // Creación de la URL para la búsqueda de pictogramas en español
        String url = "https://api.arasaac.org/v1/pictograms/es/search/" + word;

        try {
            // Realiza una solicitud GET a la URL y espera un arreglo de objetos PictogramDTO como respuesta
            ResponseEntity<PictogramDTO[]> response = restTemplate.getForEntity(url, PictogramDTO[].class);

            // Recorre el arreglo de pictogramas y extrae sus IDs en una lista la cual se devuelve
            if (response.getBody() != null) {
                List<Integer> ids = new ArrayList<>();
                for (PictogramDTO pictograma : response.getBody()) {
                    ids.add(pictograma.getId());
                }
                return ids;
            }
        } catch (Exception e) {
            // Lanza una excepción si ocurre un error
            throw new ArasaacException("Error al conectar con ARASAAC", HttpStatus.NOT_FOUND);
        }
        // Retorna una lista vacía si no se encontró ningún pictograma
        return List.of();
    }
}
