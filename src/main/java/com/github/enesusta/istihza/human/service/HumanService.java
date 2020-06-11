package com.github.enesusta.istihza.human.service;

import com.github.enesusta.istihza.human.Human;
import com.github.enesusta.istihza.human.exception.HumanNotFoundException;

import java.util.List;

public interface HumanService {
    List<Human> getAll() throws HumanNotFoundException;
    List<Human> findByName(String name);
}
