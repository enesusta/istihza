package com.github.enesusta.istihza.human.repository;

import com.github.enesusta.istihza.human.Human;

import java.util.List;
import java.util.Optional;

public interface HumanRepository {
    Optional<List<Human>> getAll();
    List<Human> findByName(String name);
}
