package com.mycompany.projet_solo.Correction;

public class AnalisaFosforo {
    double RecuperaPotassio() {
        System.out.println("Participação do Potássio no CTC: 3,0%");
        return 0;
    }

    double ValorPorTonelada(double superfosfato, double dap, double fosfato_gafsa, double escoria_thoma,
            double superfosfato_triplo, double yoorin, double fosfato_daoui, double acido_fosforico, double map,
            double fosfato_arad, double fos_Patos_minas, double multif_magnesiano) {

        return (superfosfato + dap + fosfato_gafsa + escoria_thoma + superfosfato_triplo + yoorin + fosfato_daoui
                + acido_fosforico + map + fosfato_arad + fos_Patos_minas + multif_magnesiano);
    }

    double AdicionarFosforo(double teor_fosforo, double fonte_fosforo) {
        if (teor_fosforo > 0 && fonte_fosforo > 0) {
            return (teor_fosforo - fonte_fosforo);
        } else {
            return 0.0;
        }
    }

    double FosforoAproveitado(double dado_fosforo, double eficiencia_fosforo) {
        return (dado_fosforo * 100 / eficiencia_fosforo);
    }

    double FosforoPorHectare(double FosforoAproveitado, double fonte_fosforo) {
        return (FosforoAproveitado * 100 / fonte_fosforo);
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

    double CustoTotalHectare(double CustoPorHectare, double area_talhao) {
        return CustoPorHectare * area_talhao;
    }

    

    
}
