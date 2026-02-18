package com.luisEduardo.ConversorDeMoedas.service;

import com.luisEduardo.ConversorDeMoedas.dtos.MoedaResponseDto;
import com.luisEduardo.ConversorDeMoedas.models.Moeda;
import com.luisEduardo.ConversorDeMoedas.service.api.ApiKey;
import com.luisEduardo.ConversorDeMoedas.service.api.ConsumoApi;

public class BuscarValoresMoedas {

    private String apiKey = ApiKey.getApiKey();

    private ConsumoApi api = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private Moeda buscar(String moeda){
        String urlBusca = "https://v6.exchangerate-api.com/v6/"+ apiKey+ "/latest/";
        urlBusca = urlBusca+ moeda;
        String json = api.consumir(urlBusca);
        MoedaResponseDto valores = conversor.converter(json, MoedaResponseDto.class);
        return new Moeda(valores);
    }

    public Moeda buscarReal(){
        var moeda = "BRL";
        return buscar("BRL");
    }

    public Moeda buscarDolar(){
        var moeda = "USD";
        return buscar(moeda);
    }

    public Moeda buscarPesoArgentino(){
        var moeda = "ARS";
        return buscar(moeda);
    }

    public Moeda buscarPesoColombiano(){
        var moeda = "COP";
        return buscar(moeda);
    }




}
