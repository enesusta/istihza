package com.github.enesusta.mockrest.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JsonConverter<T> implements Converter<T> {

    @Autowired
    ObjectMapper mapper;

    @Override
    public List<T> convert(String jsonString, Class<T> tClass) throws JsonProcessingException {

        CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, tClass);
        List<T> list = mapper.readValue(jsonString, listType);
        return list;
    }
}
