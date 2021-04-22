package com.mycompany.projet_solo.Correction;

public class AnalisaPotassio {
    double RecuperaPotassio() {
        System.out.println("Participação do Potássio no CTC: 3,0%");
        return 0;
    }

    double Ctctotal(PotassioCorrect potassio) {
        return (potassio.getScmol() / potassio.getDadoHal());
    }

    double ValorPorToneladaPotassio(PotassioCorrect potassio) {

        return (potassio.getCloretoDePotassio() + potassio.getSulfatoPotassio() + potassio.getSulfPotassioMag());
    }

    double TeorAtingir(PotassioCorrect potassio, double Ctctotal) {
        return (((potassio.getPotassioDesejado() * Ctctotal)) / 100);
    }

    double NecessitaPotassio(PotassioCorrect potassio) {
        return (potassio.getPotassioAtualDoSolo() - potassio.getPotassioDesejado());
    }

    double Aproveita(PotassioCorrect potassio) {
        return ((potassio.getDadoPotassio() * 391 * 2 * 1.2) / potassio.getEficienciaPotassio());
    }

    double QntPotassioHectare(double Aproveita, PotassioCorrect potassio) {
        return ((Aproveita * 100) / potassio.getPotassioUsar());
    }

    double QntPotassioAlquere(double QntPotassioHectare) {
        return (QntPotassioHectare * 2.49);
    }

    double CustoAlquere(double ValorPorToneladaPotassio, double QntPotassioAlquere) {
        return ((QntPotassioAlquere / 100) * ValorPorToneladaPotassio);
    }

    double CustoHectare(double CustoAlquere) {
        return (CustoAlquere / 2.42);
    }

    double CustoTotal(double CustoHectare, PotassioCorrect potassio) {
        return (CustoHectare * potassio.getAreaTalhao());
    }

}
