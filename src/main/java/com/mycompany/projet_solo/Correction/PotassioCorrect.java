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

            this.eficienciaPotassio = eficienciaPotassio;
            this.potassioAtualDoSolo = potassioAtualDoSolo;
            this.potassioDesejado = potassioDesejado;
            this.potassioAposCorrecao = potassioAposCorrecao;
            this.potasioAUsar = potasioAUsar;
            this.participacaoDoPotassio = participacaoDoPotassio;
            this.cloretoDePotassio = cloretoDePotassio;
            this.sulfatoPotassio = sulfatoPotassio;
            this.sulfatoPotassio_Magnesio = sulfatoPotassio_Magnesio;
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
