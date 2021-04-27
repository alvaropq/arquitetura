package com.mycompany.projet_solo.Correction;

public class AnalisaFosforo {

    double NecessidadeDeAdicionarFosforo(FosforoCorrect fosforo,EquilibrioCorrect equilibrio) {
        if (fosforo.getTeorFosforo() > 0 && equilibrio.getDadoFosforo() > 0) {
            return (fosforo.getTeorFosforo() - equilibrio.getDadoFosforo());
        } else {
            System.out.print("Não Necessita adicionar");
            return 0.0;
        }
    }

    double FosforoPorHectare(double FosforoAproveitado, FosforoCorrect fosforo) {
        return (FosforoAproveitado * 100 / fosforo.getFonteFosforo());
    }

    double FosforoPorAlquere(double FosforoPorHectare) {
        return (FosforoPorHectare * 2.42);

    }

    double CustoPorAlquere(double FosforoPorAlquere, double ValorPorTonelada) {
        return ((FosforoPorAlquere / 1000) * ValorPorTonelada);
    }

    double CustoPorHectare(double CustoPorAlquere) {
        return CustoPorAlquere / 2.42;
    }

    double CustoTotalHectare(double CustoPorHectare) {
        return ((CustoPorHectare * 100) / 4.84 );
    }   
}
