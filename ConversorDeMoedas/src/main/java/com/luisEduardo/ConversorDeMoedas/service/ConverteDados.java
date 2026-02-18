package com.luisEduardo.ConversorDeMoedas.service;

import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T converter (String json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }
}
