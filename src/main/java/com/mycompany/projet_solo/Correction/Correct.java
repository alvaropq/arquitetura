
package com.mycompany.projet_solo.Correction;
import java.util.Scanner;

public class Correct {
    //public static int main(String[] args) {
        public Correct(){
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
        //return sist;  
    }



    //===============CORREÇÃO E RECUPERAÇÃO DO FOSFORO=========================================================
    double RecuperaPotassio(){
        System.out.println("Participação do Potássio no CTC: 3,0%");
        return 0;
 }
    double ValorPorTonelada( 
            double superfosfato,
            double dap,
            double fosfato_gafsa,
            double escoria_thoma,
            double superfosfato_triplo,
            double yoorin,
            double fosfato_daoui,
            double acido_fosforico,
            double map,
            double fosfato_arad,
            double fos_Patos_minas,
            double multif_magnesiano){
                
                return (superfosfato + dap + fosfato_gafsa + escoria_thoma + 
                superfosfato_triplo + yoorin + fosfato_daoui + acido_fosforico + map + fosfato_arad + fos_Patos_minas + multif_magnesiano);
            }
            

    double AdicionarFosforo (double teor_fosforo, double fonte_fosforo){
        if(teor_fosforo > 0 && fonte_fosforo > 0){
            return (teor_fosforo - fonte_fosforo);
        }else {
            return 0.0;
        }
   }

   double FosforoAproveitado(double dado_fosforo,double eficiencia_fosforo){
        return (dado_fosforo*100/eficiencia_fosforo);
       }

   double FosforoPorHectare (double FosforoAproveitado,double fonte_fosforo){
        return (FosforoAproveitado*100/fonte_fosforo);
   }
   double FosforoPorAlquere(double FosforoPorHectare){
       return (FosforoPorHectare * 2.42);

   }
   double CustoPorAlquere(double FosforoPorAlquere, double ValorPorTonelada){
       return ((FosforoPorAlquere/1000) * ValorPorTonelada);
   }
   double CustoPorHectare(double CustoPorAlquere){
       return CustoPorAlquere /2.42;
   }
   double CustoTotalHectare(double CustoPorHectare, double area_talhao){
       return CustoPorHectare * area_talhao;
    }

    

// ==============================CORREÇÃO E RECUPERAÇÃO DO POTASSIO ===============
    double ctctotal(double Scmol,double dado_hal){
        return (Scmol/dado_hal);
    }
    double ValorPorToneladaPotassio(
        double cloretoDePotassio,
        double sulfatoPotassio,
        double sulfatoPotassio_Magnesio){

            return (cloretoDePotassio + sulfatoPotassio + sulfatoPotassio_Magnesio);
        }
    double TeorAtingir(double potassioDesejado,double ctctotal){
        return((potassioDesejado * ctctotal)/100) ;
    }

    double NecessitaPotassio( double potassioAtualDoSolo,double potassioDesejado){
        return (potassioAtualDoSolo - potassioDesejado);
    }
    double Aproveita(double dado_potassio,double eficienciaPotassio){
        return ((dado_potassio * 391 * 2 * 1.2)/eficienciaPotassio);
    }
    double QntPotassioHectare(double Aproveita,double potasioAUsar){
        return ((Aproveita * 100)/potasioAUsar);
    }
    double QntPotassioAlquere(double QntPotassioHectare){
        return (QntPotassioHectare * 2.49);
    }
    double CustoAlquere(double ValorPorToneladaPotassio,double QntPotassioAlquere){
        return ((QntPotassioAlquere/100) * ValorPorToneladaPotassio);
    }
    double CustoHectare(double CustoAlquere){
        return (CustoAlquere/2.42);
    }
    double CustoTotal(double CustoHectare,double area_talhao){
        return (CustoHectare * area_talhao);
    }
          
    
} 
    
    
    
   