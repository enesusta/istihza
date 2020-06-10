package com.github.enesusta.mockrest.human.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.enesusta.mockrest.converter.Converter;
import com.github.enesusta.mockrest.human.Human;
import com.github.enesusta.mockrest.resource.JsonResource;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

@Repository
public class DefaultHumanRepository implements HumanRepository {

    private final static Logger logger = Logger.getLogger(DefaultHumanRepository.class);

    @Autowired
    Converter<Human> humanConverter;

    @Autowired
    JsonResource resource;

    @Override
    public Optional<List<Human>> getAll() {

        List<Human> humans = null;

        try {
            final String humanJsonString = resource.getJsonResource("human.json");
            humans = humanConverter.convert(humanJsonString, Human.class);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        }

        return Optional.ofNullable(humans);
    }

    @Override
    public List<Human> findByName(final String name) {

        final List<Human> listOfMatchedNameOfParameter = new ArrayList<>(50);
        final Predicate<Human> humanPredicate = human -> human.getFirstName().contains(name);
        final Consumer<Human> humanConsumer = listOfMatchedNameOfParameter::add;

        getAll().ifPresent(opt -> {
            opt.stream().filter(humanPredicate).forEach(humanConsumer);
        });

        return listOfMatchedNameOfParameter;
    }
}
