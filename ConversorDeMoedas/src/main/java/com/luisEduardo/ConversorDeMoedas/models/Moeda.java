package com.luisEduardo.ConversorDeMoedas.models;

import com.luisEduardo.ConversorDeMoedas.dtos.MoedaResponseDto;

public class Moeda {
    private double valorDolares;
    private double valorColombiano;
    private double valorArgentino;
    private double valorReal;

    public Moeda() {}

    public Moeda(MoedaResponseDto dadosMoeda) {

        this.valorDolares = dadosMoeda.valores().get("USD");
        this.valorColombiano = dadosMoeda.valores().get("COP");
        this.valorArgentino = dadosMoeda.valores().get("ARS");
        this.valorReal = dadosMoeda.valores().get("BRL");
    }

    public double getValorDolares() {
        return valorDolares;
    }

    public void setValorDolares(double valorDolares) {
        this.valorDolares = valorDolares;
    }

    public double getValorColombiano() {
        return valorColombiano;
    }

    public void setValorColombiano(double valorColombiano) {
        this.valorColombiano = valorColombiano;
    }

    public double getValorArgentino() {
        return valorArgentino;
    }

    public void setValorArgentino(double valorArgentino) {
        this.valorArgentino = valorArgentino;
    }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "valorDolares=" + valorDolares +
                ", valorColombiano=" + valorColombiano +
                ", valorArgentino=" + valorArgentino +
                ", valorReal=" + valorReal +
                '}';
    }
}