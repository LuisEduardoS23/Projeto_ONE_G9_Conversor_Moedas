package com.luisEduardo.ConversorDeMoedas.service;


public interface IConverteDados {

    public <T> T converter (String json, Class<T> classe);
}
