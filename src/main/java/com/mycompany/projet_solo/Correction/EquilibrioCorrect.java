package com.mycompany.projet_solo.Correction;

public class EquilibrioCorrect {
    private double materiaOrganica;
    private double carbono;
    private int texturaDoSolo;
    private int sistemaCultivo;
    private double dadoFosforo;
    private double dadoPotassio;
    private double dadoCalcio;
    private double dadoMagnesio;
    private double dadoEnxofre;
    private double dadoAluminio;
    private double dadoHal;

    private EquilibrioCorrect(EquilibrioCorrectBuilder builder){
        this.materiaOrganica = builder.materiaOrganica;
        this.carbono = builder.carbono;
        this.texturaDoSolo = builder.texturaDoSolo;
        this.sistemaCultivo = builder.sistemaCultivo;
        this.dadoFosforo = builder.dadoFosforo;
        this.dadoPotassio = builder.dadoPotassio;
        this.dadoCalcio = builder.dadoCalcio;
        this.dadoMagnesio = builder.dadoMagnesio;
        this.dadoEnxofre = builder.dadoEnxofre;
        this.dadoAluminio = builder.dadoAluminio;
        this.dadoHal = builder.dadoHal;
    }

    public static class EquilibrioCorrectBuilder {
        private double materiaOrganica;
        private double carbono;
        private int texturaDoSolo;
        private int sistemaCultivo;
        private double dadoFosforo;
        private double dadoPotassio;
        private double dadoCalcio;
        private double dadoMagnesio;
        private double dadoEnxofre;
        private double dadoAluminio;
        private double dadoHal;

        public EquilibrioCorrectBuilder setMateriaOrganica(double materiaOrganica){
            this.materiaOrganica = materiaOrganica;
            return this;
        }
        public EquilibrioCorrectBuilder setCarbono(double carbono){
            this.carbono = carbono;
            return this;
        }

        public EquilibrioCorrectBuilder setTesturaDoSolo(int texturaDoSolo){
            this.texturaDoSolo = texturaDoSolo;
            return this;
        }
        public EquilibrioCorrectBuilder setSistemaCultivi(int sistemaCultivo){
            this.sistemaCultivo = sistemaCultivo;
            return this;
        }
        public EquilibrioCorrectBuilder setDadoFosforo(double dadoFosforo){
            this.dadoFosforo = dadoFosforo;
            return this;
        }
        public EquilibrioCorrectBuilder setDadoPotassio(double dadoPotassio){
            this.dadoPotassio = dadoPotassio;
            return this;
        }
        public EquilibrioCorrectBuilder setDadoCalcio(double dadoCalcio){
            this.dadoCalcio = dadoCalcio;
            return this;        
        }
        public EquilibrioCorrectBuilder setDadoMagnesio(double dadoMagnesio){
            this.dadoMagnesio = dadoMagnesio;
            return this;
        }
        public EquilibrioCorrectBuilder setDadoEnxofre(double dadoEnxofre){
            this.dadoEnxofre = dadoEnxofre;
            return this;
        }
        public EquilibrioCorrectBuilder setDadoAluminio(double dadoAluminio){
            this.dadoAluminio = dadoAluminio;
            return this;
        }
        public EquilibrioCorrectBuilder setDadoHal(double dadoHal){
            this.dadoHal = dadoHal;
            return this;
            }
        }
            public double getMateriOrganica(){
                return materiaOrganica;
            }
            public double getCarbono(){
                return carbono;
            }
            public int getTexturaDoSolo(){
                return texturaDoSolo;
            }
            public int getSistemaCultivo(){
                return sistemaCultivo;
            }
            public double getDadoFosforo(){
                return dadoFosforo;
            }
            public double getDadoPotassio(){
                return dadoPotassio;
            }
            public double getDadoCalcio(){
                return dadoCalcio;
            }
            public double getDadoMagnesio(){
                return dadoMagnesio;
            }
            public double getDadoEnxofre(){
                return dadoEnxofre;
            }
            public double getDadoAluminio(){
                return dadoAluminio;
            }
            public double getDadoHal(){
                return dadoHal;
        }
}
