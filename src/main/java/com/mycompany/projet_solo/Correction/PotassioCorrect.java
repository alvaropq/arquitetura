package com.mycompany.projet_solo.Correction;

public class PotassioCorrect {
    private double eficienciaPotassio;
    private double potassioAtualDoSolo;
    private double potassioDesejado;
    private double potassioAposCorrecao;
    private double potasioAUsar;
    private double participacaoDoPotassio;
    private double cloretoDePotassio;
    private double sulfatoPotassio;
    private double sulfatoPotassio_Magnesio;

    public PotassioCorrect(


    
        double eficienciaPotassio,
        double potassioAtualDoSolo,
        double potassioDesejado,
        double potassioAposCorrecao,
        double potasioAUsar,
        double participacaoDoPotassio,
        double cloretoDePotassio,
        double sulfatoPotassio,
        double sulfatoPotassio_Magnesio){
        }
    
    
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



        public double getEficiencia(){
            return eficienciaPotassio;
        }
        public double getPotassioAtual(){
            return potassioAtualDoSolo;
        }
        public double getPotassioDesejado(){
            return potassioDesejado;
        }
        public double getPotassioCorrecao(){
            return potassioAposCorrecao;
        }
        public double getPotassioUsar(){
            return potasioAUsar;
        }
        public double getParticipa(){
            return participacaoDoPotassio;
        }
        public double getCloreto(){
            return cloretoDePotassio;
        }
        public double getSulfatoPotassio(){
            return sulfatoPotassio;
        }
        public double getSulfPotassioMag(){
            return sulfatoPotassio_Magnesio;
        }
}
