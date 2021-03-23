package com.january.event_ex;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


//EventListener들의 집합
@Component
public class SmsEventHandler {


    @EventListener
    public void idconnected(connected event) {
        System.out.println("접속 완료 콜백");
        System.out.println(event.getID() + "님이 접속 하였습니다");
    }

    @EventListener
    public void iddisconnected(disconnected event) {
        System.out.println("접속종료 완료 콜백");
        System.out.println(event.getID() + "님이 접속을 종료하였습니다");
    }
}