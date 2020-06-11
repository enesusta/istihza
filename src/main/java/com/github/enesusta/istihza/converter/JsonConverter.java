package com.github.enesusta.istihza.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public final class JsonConverter<T> implements Converter<T> {

    @Autowired
    ObjectMapper mapper;

    @Override
    public List<T> convert(final String jsonString, final Class<T> tClass) throws JsonProcessingException {
        final CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, tClass);
        final List<T> list = mapper.readValue(jsonString, listType);
        return list;
    }
}
