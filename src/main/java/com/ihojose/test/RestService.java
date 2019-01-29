package com.ihojose.test;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

/**
 * test was developed by Gammapeit SAS
 * <p>
 * Copyright (C) 2019 Gammapeit, SAS - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Jose Buelvas <jbuelvas@gammapeit.com>.
 *
 * @version 1.0.1
 * @name test
 * @date 29/01/2019
 * @copyright Gammapeit SAS (c) 2019
 * @companyURL https://www.gammapeit.com
 */
@RestController
@RequestMapping("/test")
public class RestService {

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, path = "/get")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Object> test() {
        return null;
    }
}
