package com.luisEduardo.ConversorDeMoedas.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Map;

public record MoedaResponseDto(@JsonAlias("conversion_rates")Map <String, Double> valores){
}
