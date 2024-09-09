package com.koreait.exam.chat_24_09;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class SseEmitters {

    private final List<SseEmitter> emitters = new CopyOnWriteArrayList<SseEmitter>();

    public void add() {

    }

    public void noti(String eventName, Map<String, Object> data) {
        emitters.forEach(emitter -> {
            try {

            }
        })
    }
}
