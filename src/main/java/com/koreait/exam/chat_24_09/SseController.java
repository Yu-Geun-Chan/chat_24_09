package com.koreait.exam.chat_24_09;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/sse")
public class SseController {

    private final SseController sseController;


}
