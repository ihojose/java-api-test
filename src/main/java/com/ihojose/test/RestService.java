package com.ihojose.test;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/test")
public class RestService {
    private static final Logger LOG = Logger.getLogger(RestService.class.getSimpleName());

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, path = "/demo")
    public ResponseEntity test(@RequestBody MyModel data) {
        try {
            if (!data.getNombre().isEmpty() && data.getNombre() != null && !data.getNumeroDocumento().isEmpty() && data.getNumeroDocumento() != null) {
                return new ResponseEntity<>(new HashMap<String, Object>(){{
                    put("message", "¡DATOS RECIBIDOS!");
                }}, HttpStatus.OK);
            } else {
                LOG.log(Level.SEVERE, "RequestError({0})", new Gson().toJson(data));
                throw new ResponseStatusException(HttpStatus.PRECONDITION_FAILED, "¡DATOS INCORRECTOS!");
            }
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "RequestError({0})", new Gson().toJson(data));
            throw new ResponseStatusException(HttpStatus.PRECONDITION_FAILED, "¡DATOS INCORRECTOS!");
        }
    }
}
