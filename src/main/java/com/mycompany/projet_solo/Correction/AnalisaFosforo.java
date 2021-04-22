package com.mycompany.projet_solo.Correction;

public class AnalisaFosforo {

        double ValorPorTonelada(FosforoCorrect fosforo){
            return (fosforo.getSuperfosfato()
                        + fosforo.getDap()
                        + fosforo.getFosfatoGafsa()
                        + fosforo.getEscoria()
                        + fosforo.getSuperTriplo()
                        + fosforo.getYoorin()
                        + fosforo.getFosfatoDaoui()
                        + fosforo.getAcidoFosforico()
                        + fosforo.getMap()
                        + fosforo.getFosfatoArad()
                        + fosforo.getFosPatosMina()
                        + fosforo.getMultiMagnesiano());
        }

    double AdicionarFosforo(FosforoCorrect fosforo) {
        if (fosforo.getTeorFosforo() > 0 && fosforo.getFonteFosforo() > 0) {
            return (fosforo.getTeorFosforo() - fosforo.getFonteFosforo());
        } else {
            return 0.0;
        }
    }

    double FosforoAproveitado(double dado_fosforo, FosforoCorrect fosforo) {
        return (dado_fosforo * 100 / fosforo.getEficienciaFosforo());
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

    double CustoTotalHectare(double CustoPorHectare, FosforoCorrect fosforo) {
        return CustoPorHectare * fosforo.getTalhao();
    }

    

    
}
