package com.january.event_ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ConnectionService service;


    @GetMapping("/connect/{id}")
    public void connect(@PathVariable String id) {
        System.out.println("연결 시도");
        service.connect(id);

    }

    @GetMapping("/disconnect/{id}")
    public void disConnect(@PathVariable String id) {
        System.out.println("연결 끊기 시도");
        service.disconnect(id);

    }
}