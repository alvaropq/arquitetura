package com.mycompany.projet_solo.Correction;

public class PotassioCorrect {
    private double scmol;
    private double dadoHal;
    private double dado_Potassio;
    private double eficienciaPotassio;
    private double potassioAtualDoSolo;
    private double potassioDesejado;
    private double potassioAposCorrecao;
    private double potassioAUsar;
    private double participacaoDoPotassio;
    private double cloretoDePotassio;
    private double sulfatoPotassio;
    private double sulfatoPotassio_Magnesio;

    private PotassioCorrect(PotassioCorrectBuilder builder) {
        this.scmol = builder.scmol;
        this.dadoHal = builder.dadoHal;
        this.dado_Potassio = builder.dado_Potassio;
        this.eficienciaPotassio = builder.eficienciaPotassio;
        this.potassioAtualDoSolo = builder.potassioAtualDoSolo;
        this.potassioDesejado = builder.potassioDesejado;
        this.potassioAposCorrecao = builder.potassioAposCorrecao;
        this.potassioAUsar = builder.potassioAUsar;
        this.participacaoDoPotassio = builder.participacaoDoPotassio;
        this.cloretoDePotassio = builder.cloretoDePotassio;
        this.sulfatoPotassio = builder.sulfatoPotassio;
        this.sulfatoPotassio_Magnesio = builder.sulfatoPotassio_Magnesio;
    }

    public static class PotassioCorrectBuilder {
        private double scmol;
        private double dadoHal;
        private double dado_Potassio;
        private double eficienciaPotassio;
        private double potassioAtualDoSolo;
        private double potassioDesejado;
        private double potassioAposCorrecao;
        private double potassioAUsar;
        private double participacaoDoPotassio;
        private double cloretoDePotassio;
        private double sulfatoPotassio;
        private double sulfatoPotassio_Magnesio;

        public PotassioCorrectBuilder setScmol(double scmol){
            this.scmol = scmol;
            return this;
        }

        public PotassioCorrectBuilder setDadoHal(double dadoHal){
            this.dadoHal = dadoHal;
            return this;
        }

        public PotassioCorrectBuilder setDadoPotassio(double dado_Potassio){
            this.dado_Potassio = dado_Potassio;
            return this;
        }

        public PotassioCorrectBuilder setEficienciaPotassio(double eficienciaPotassio) {
            this.eficienciaPotassio = eficienciaPotassio;
            return this;
        }

        public PotassioCorrectBuilder setPotassioAtualDoSolo(double potassioAtualDoSolo) {
            this.potassioAtualDoSolo = potassioAtualDoSolo;
            return this;
        }

        public PotassioCorrectBuilder setPotassioDesejado(double potassioDesejado) {
            this.potassioDesejado = potassioDesejado;
            return this;
        }

        public PotassioCorrectBuilder setPotassioAposCorrecao(double potassioAposCorrecao) {
            this.potassioAposCorrecao = potassioAposCorrecao;
            return this;
        }

        public PotassioCorrectBuilder setPotassioAUsar(double potassioAUsar) {
            this.potassioAUsar = potassioAUsar;
            return this;
        }

        public PotassioCorrectBuilder setParticipacaoDoPotassio(double participacaoDoPotassio) {
            this.participacaoDoPotassio = participacaoDoPotassio;
            return this;
        }

        public PotassioCorrectBuilder setCloretoDePotassio(double cloretoDePotassio) {
            this.cloretoDePotassio = cloretoDePotassio;
            return this;
        }

        public PotassioCorrectBuilder setSulfatoPotassio(double sulfatoPotassio) {
            this.sulfatoPotassio = sulfatoPotassio;
            return this;
        }

        public PotassioCorrectBuilder setSulfatoPotassio_Magnesio(double sulfatoPotassio_Magnesio) {
            this.sulfatoPotassio_Magnesio = sulfatoPotassio_Magnesio;
            return this;
        }

        public PotassioCorrect builder() {
            return new PotassioCorrect(this);
        }
    }
    public double getScmol(){
        return scmol;
    }
    public double getDadoHal(){
        return dadoHal;
    }
    public double getDadoPotassio(){
        return dado_Potassio;
    }

    public double getEficienciaPotassio() {
        return eficienciaPotassio;
    }

    public double getPotassioAtualDoSolo() {
        return potassioAtualDoSolo;
    }

    public double getPotassioDesejado() {
        return potassioDesejado;
    }

    public double getPotassioCorrecao() {
        return potassioAposCorrecao;
    }

    public double getPotassioUsar() {
        return potassioAUsar;
    }

    public double getParticipa() {
        return participacaoDoPotassio;
    }

    public double getCloretoDePotassio() {
        return cloretoDePotassio;
    }

    public double getSulfatoPotassio() {
        return sulfatoPotassio;
    }

    public double getSulfPotassioMag() {
        return sulfatoPotassio_Magnesio;
    }
}
