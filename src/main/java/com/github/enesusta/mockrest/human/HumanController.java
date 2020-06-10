package com.github.enesusta.mockrest.human;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.enesusta.mockrest.converter.Converter;
import com.github.enesusta.mockrest.human.Human;
import com.github.enesusta.mockrest.resource.JsonResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class HumanController {

    @Autowired
    Converter<Human> humanConverter;

    @Autowired
    JsonResource resource;

    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/human")
    public List<Human> humans() throws JsonProcessingException {
        return humanConverter.convert(resource.getJsonResource(), Human.class);
    }

}
