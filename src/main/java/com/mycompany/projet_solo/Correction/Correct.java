
package com.mycompany.projet_solo.Correction;

import java.util.Scanner;

public class Correct {
    public static int main(String[] args) {
        Scanner dad = new Scanner(System.in);

        Double Scmol, CTCcmol, V_atual;

        System.out.println("Testura do Solo : ");
        int texSolo = dad.nextInt();

        System.out.println("Sistema de cultivo: ");
        int sist = dad.nextInt();

        if (texSolo == 1) {
            System.out.println("Fósforo ideal 9,0 - atual: ");
            double dado_fosforo = dad.nextDouble();

            System.out.println("Potássio ideal 0,35 - atual: ");
            double dado_potassio = dad.nextDouble();

            System.out.println("Cálcio ideal 6,0- atual: ");
            double dado_calcio = dad.nextDouble();

            System.out.println("Magnésio ideal 1,5- atual: ");
            double dado_magnesio = dad.nextDouble();

            System.out.println("Enxofre ideal 9,0 - atual: ");
            double dado_enxofre = dad.nextDouble();

            System.out.println("Alumínio ideal 0,0 - atual: ");
            double dado_aluminio = dad.nextDouble();

            System.out.println("H + AL ideal 0,0 - atual: ");
            double dado_hal = dad.nextDouble();

            // =========================================================================================================================
            // Scomol
            Scmol = (dado_potassio + dado_calcio + dado_magnesio);
            System.out.println("Scmol : " + Scmol);
            // CTC cmaol
            CTCcmol = Scmol + dado_hal;
            System.out.println("CTC cmol: " + CTCcmol);
            // V% atual
            V_atual = 100 * (Scmol / CTCcmol);
            System.out.println("V% atual : " + V_atual);
        }

        else if (texSolo == 2) {
            System.out.println("Fósforo ideal 12,0 - atual: ");
            double dado_fosforo = dad.nextDouble();

            System.out.println("Potássio ideal 0,25 - atual: ");
            double dado_potassio = dad.nextDouble();

            System.out.println("Cálcio ideal 4,0 - atual: ");
            double dado_calcio = dad.nextDouble();

            System.out.println("Magnésio ideal 1,0 - atual: ");
            double dado_magnesio = dad.nextDouble();

            System.out.println("Enxofre ideal 6,0 - atual: ");
            double dado_enxofre = dad.nextDouble();

            System.out.println("Alumínio ideal 0,0 - atual: ");
            double dado_aluminio = dad.nextDouble();

            System.out.println("H + AL ideal 0 - atual: ");
            double dado_hal = dad.nextDouble();

            // =========================================================================================================================
            // Scmol
            Scmol = dado_potassio + dado_calcio + dado_magnesio;
            System.out.println("Scmol : " + Scmol);
            // CTC cmol
            CTCcmol = Scmol + dado_hal;
            System.out.println("CTC cmol: " + CTCcmol);
            // V% atual
            V_atual = 100 * (Scmol / CTCcmol);
            System.out.println("V% atual : " + V_atual);

        }
        // =========================================================================================================================
        // Calculo de Materia Organica
        System.out.println("quantidade de Máteria Organica encontrada :");
        double M_O = dad.nextDouble();
        // calculo da M.O. %
        double PorM_O = M_O / 10;
        System.out.println("Porcentagem M.O : " + PorM_O);

        double Carbono = PorM_O / 1.72 * 10;
        System.out.println("Carbono no solo: " + Carbono);
        System.out.println("TEOR IDEAL DE M.O.    3.0 a 40%");

        // =========================================================================================================================
        // Sistem de plantio
        if (sist == 1) {
            System.out.println("Sistema de Plantio Direto");
        } else if (sist == 2) {
            System.out.println("Sistema de Plantio Convencional");
        }
        // =========================================================================================================================
        // Comparação da argila
        if (texSolo == 1) {
            System.out.println("+ de 40% Argiloso");
        } else if (texSolo == 2) {
            System.out.println("De 25 a 40% de Argila");
        }
        // |||||||||||||||||||||||||||||||==EXERCICIO
        // 2==||||||||||||||||||||||||||||||||||||||||||
        /*int num = 0;
        System.out.println("IR para análise de fosforo ou voltar");
        System.out.println("1 para análise ou 2 para voltar");
        switch (num) {
        case 1:
            FosforoPotassio();
            break;
        default:
        }
        return num;*/
        return sist;
        
    }
 }
