package com.github.enesusta.mockrest.converter;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface Converter<T> {
    List<T> convert(String jsonString, Class<T> tClass) throws JsonProcessingException;
}
