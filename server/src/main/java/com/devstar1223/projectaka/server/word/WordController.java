package com.devstar1223.projectaka.server.word;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/words")
public class WordController {

    @GetMapping("/today")
    public WordResponse getTodayWord() {
        return new WordResponse("고요");
    }
}
