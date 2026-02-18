package com.luisEduardo.ConversorDeMoedas.service;

import com.luisEduardo.ConversorDeMoedas.models.Moeda;

public class ConversorMoedas {
    private BuscarValoresMoedas buscarValores = new BuscarValoresMoedas();


    public Double argentinoParaDolar (Double valor) {
        Moeda valoresPesoArgentino = buscarValores.buscarPesoArgentino();
        return valor * valoresPesoArgentino.getValorDolares();
    }

    public Double dolarParaArgentino (Double valor){
        Moeda valoresDolar = buscarValores.buscarDolar();
        return valor * valoresDolar.getValorArgentino();
    }

    public Double realParaDolar (Double valor){
        Moeda valoresReal = buscarValores.buscarReal();
        return valor * valoresReal.getValorDolares();
    }

    public Double dolarParaReal (Double valor){
        Moeda valoresDolar = buscarValores.buscarDolar();
        return valor * valoresDolar.getValorReal();
    }

    public Double dolarParaColombiano (Double valor){
        Moeda valoresDolar = buscarValores.buscarDolar();
        return valor * valoresDolar.getValorColombiano();
    }

    public Double colombianoParaDolar (Double valor){
        Moeda valoresPesoColombiano = buscarValores.buscarPesoColombiano();
        return valor * valoresPesoColombiano.getValorDolares();
    }

}
