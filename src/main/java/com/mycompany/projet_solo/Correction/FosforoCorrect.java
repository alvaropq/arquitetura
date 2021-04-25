package com.mycompany.projet_solo.Correction;

public class FosforoCorrect {

   
    private double teor_fosforo;
    private double fonte_fosforo;
    private double eficiencia_fosforo;
    private double custo_hectare;
    private double superfosfato;
    private double dap;
    private double fosfato_gafsa;
    private double escoria_thoma;
    private double superfosfato_triplo;
    private double yoorin;
    private double fosfato_daoui;
    private double acido_fosforico;
    private double map;
    private double fosfato_arad;
    private double fos_Patos_minas;
    private double multif_magnesiano;

    private FosforoCorrect(FosforoCorrectBuilder builder) {
      
        this.teor_fosforo = builder.teor_fosforo;
        this.fonte_fosforo = builder.fonte_fosforo;
        this.eficiencia_fosforo = builder.eficiencia_fosforo;
        this.custo_hectare = builder.custo_hectare;
        this.superfosfato = builder.superfosfato;
        this.dap = builder.dap;
        this.fosfato_gafsa = builder.fosfato_gafsa;
        this.escoria_thoma = builder.escoria_thoma;
        this.superfosfato_triplo = builder.superfosfato_triplo;
        this.yoorin = builder.yoorin;
        this.fosfato_daoui = builder.fosfato_daoui;
        this.acido_fosforico = builder.acido_fosforico;
        this.map = builder.map;
        this.fosfato_arad = builder.fosfato_arad;
        this.fos_Patos_minas = builder.fos_Patos_minas;
        this.multif_magnesiano = builder.multif_magnesiano;
    }

    public static class FosforoCorrectBuilder {
       
        private double teor_fosforo;
        private double fonte_fosforo;
        private double eficiencia_fosforo;
        private double custo_hectare;
        private double superfosfato;
        private double dap;
        private double fosfato_gafsa;
        private double escoria_thoma;
        private double superfosfato_triplo;
        private double yoorin;
        private double fosfato_daoui;
        private double acido_fosforico;
        private double map;
        private double fosfato_arad;
        private double fos_Patos_minas;
        private double multif_magnesiano;

        public FosforoCorrectBuilder setTeorFosforo(double teor_fosforo) {
            this.teor_fosforo = teor_fosforo;
            return this;
        }

        public FosforoCorrectBuilder setFonteFosforo(double fonte_fosforo) {
            this.fonte_fosforo = fonte_fosforo;
            return this;
        }

        public FosforoCorrectBuilder setEficienciaFosforo(double eficiencia_fosforo) {
            this.eficiencia_fosforo = eficiencia_fosforo;
            return this;
        }

        public FosforoCorrectBuilder setCustoHectare(double custo_hectare) {
            this.custo_hectare = custo_hectare;
            return this;
        }

        public FosforoCorrectBuilder setSuperFosfato(double superfosfato) {
            this.superfosfato = superfosfato;
            return this;
        }

        public FosforoCorrectBuilder setDap(double dap) {
            this.dap = dap;
            return this;
        }

        public FosforoCorrectBuilder setFosfatoGafsa(double fosfato_gafsa) {
            this.fosfato_gafsa = fosfato_gafsa;
            return this;
        }

        public FosforoCorrectBuilder setEscoriaThoma(double escoria_thoma) {
            this.escoria_thoma = escoria_thoma;
            return this;
        }

        public FosforoCorrectBuilder setSuperFosfatoTriplo(double superfosfato_triplo) {
            this.superfosfato_triplo = superfosfato_triplo;
            return this;
        }

        public FosforoCorrectBuilder setYoorin(double yoorin) {
            this.yoorin = yoorin;
            return this;
        }

        public FosforoCorrectBuilder setFosfatoDaoui(double fosfato_daoui) {
            this.fosfato_daoui = fosfato_daoui;
            return this;
        }

        public FosforoCorrectBuilder setAcidoFosforico(double acido_fosforico) {
            this.acido_fosforico = acido_fosforico;
            return this;
        }

        public FosforoCorrectBuilder setMap(double map) {
            this.map = map;
            return this;
        }

        public FosforoCorrectBuilder setFosfatoArad(double fosfato_arad) {
            this.fosfato_arad = fosfato_arad;
            return this;
        }

        public FosforoCorrectBuilder setFosfatoPatosMinas(double fos_Patos_minas) {
            this.fos_Patos_minas = fos_Patos_minas;
            return this;
        }

        public FosforoCorrectBuilder setMultiMagnesio(double multif_magnesiano) {
            this.multif_magnesiano = multif_magnesiano;
            return this;
        }

        public FosforoCorrect builder() {
            return new FosforoCorrect(this);
        }
    }
    public double getTeorFosforo() {
        return teor_fosforo;
    }

    public double getFonteFosforo() {
        return fonte_fosforo;
    }

    public double getEficienciaFosforo() {
        return eficiencia_fosforo;
    }

    public double getCusto() {
        return custo_hectare;
    }

    public double getSuperfosfato() {
        return superfosfato;
    }

    public double getDap() {
        return dap;
    }

    public double getFosfatoGafsa() {
        return fosfato_gafsa;
    }

    public double getEscoria() {
        return escoria_thoma;
    }

    public double getSuperTriplo() {
        return superfosfato_triplo;
    }

    public double getYoorin() {
        return yoorin;
    }

    public double getFosfatoDaoui() {
        return fosfato_daoui;
    }

    public double getAcidoFosforico() {
        return acido_fosforico;
    }

    public double getMap() {
        return map;
    }

    public double getFosfatoArad() {
        return fosfato_arad;
    }

    public double getFosPatosMina() {
        return fos_Patos_minas;
    }

    public double getMultiMagnesiano() {
        return multif_magnesiano;
    }

}
