package com.january.event_ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ConnectionService {

    @Autowired
    ApplicationEventPublisher publisher;

    public void connect(String id) {
        //connect 처리
        publisher.publishEvent(new connected(id));
    }

    public void disconnect(String id) {
        //disconnect 처리
            publisher.publishEvent(new disconnected(id));
    }
}