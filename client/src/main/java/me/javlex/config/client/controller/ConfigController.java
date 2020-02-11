package me.javlex.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("config")
public class ConfigController {

    @Value("${prop1}")
    private String prop1;

    @GetMapping("get")
    public ResponseEntity<String> getProp() {
        return new ResponseEntity<>(prop1, HttpStatus.ACCEPTED);
    }

}
