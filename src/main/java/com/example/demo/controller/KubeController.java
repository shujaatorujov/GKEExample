package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeController {

        @GetMapping(path = "/")
        public String name(){
            return "My Kube Test App";
        }
}
