<<<<<<< HEAD
package com.aaron.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/* Manejador de excepciones para el backend.*/
@ControllerAdvice
public class ArasaacExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ArasaacErrorResponse> manejarArasaacException(ArasaacException ex) {
        ArasaacErrorResponse error = new ArasaacErrorResponse(
            ex.getStatus().value(),
            ex.getMessage()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ArasaacErrorResponse> manejarExcepcion(Exception exc) {
        ArasaacErrorResponse error = new ArasaacErrorResponse(500,"Error inesperado en el servidor.");
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
=======
package com.aaron.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/* Manejador de excepciones para el backend.*/
@ControllerAdvice
public class ArasaacExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ArasaacErrorResponse> manejarArasaacException(ArasaacException ex) {
        ArasaacErrorResponse error = new ArasaacErrorResponse(
            ex.getStatus().value(),
            ex.getMessage()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ArasaacErrorResponse> manejarExcepcion(Exception exc) {
        ArasaacErrorResponse error = new ArasaacErrorResponse(500,"Error inesperado en el servidor.");
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
>>>>>>> 4818661 (Proyecto inicial conectado a repo existente)
