package com.luisEduardo.ConversorDeMoedas.service.api;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ApiKey {


    public static String getApiKey() {
        String apiKey;
        try{
            apiKey = Files.readString(Paths.get("api-key.txt")).trim();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao ler o arquivo api-key.txt");
        }
        return apiKey;
    }
}

