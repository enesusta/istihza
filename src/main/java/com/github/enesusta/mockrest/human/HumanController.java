package com.github.enesusta.mockrest.human;

import com.github.enesusta.mockrest.human.exception.HumanNotFoundException;
import com.github.enesusta.mockrest.human.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HumanController {

    @Autowired
    HumanService humanService;

    @GetMapping("/humans")
    public List<Human> getAll() throws HumanNotFoundException {
        return humanService.getAll();
    }

    @GetMapping("/human")
    public List<Human> findByName(@RequestParam String name) {
        return humanService.findByName(name);
    }

}
