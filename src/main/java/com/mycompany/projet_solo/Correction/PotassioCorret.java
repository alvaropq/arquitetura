package com.mycompany.projet_solo.Correction;

/**
 *
 * @author meu pc
 */
public class PotassioCorret {
        private double participacaoPotassio_ctc;
        private double participacao_desejada;
        private double participacao_aposCorrecao;
        private double fontePotassio;
        private double qnt_aplicar;
        private double custo_hectares;
        private double cloreto_potassio;
        private double sulfato_potassio;
        private double sulfato_potassioMagnesio;


       public PotassioCorret(
                double participacaoPotassio_ctc,
                double participacao_desejada,
                double participacao_aposCorrecao,
                double fontePotassio,
                double qnt_aplicar,
                double custo_hectares,
                double cloreto_potassio,
                double sulfato_potassio,
                double sulfato_potassioMagnesio) {

          this.participacaoPotassio_ctc = participacaoPotassio_ctc;
           this.participacao_desejada = participacao_desejada;
           this.participacao_aposCorrecao = participacao_aposCorrecao;
            this.fontePotassio = fontePotassio;
            this.qnt_aplicar = qnt_aplicar;
            this.custo_hectares = custo_hectares;
           this.cloreto_potassio = cloreto_potassio;
            this.sulfato_potassio = sulfato_potassio;
            this.sulfato_potassioMagnesio = sulfato_potassioMagnesio;

            }public double getParticipaCTC(){
                return participacaoPotassio_ctc;
            }
            public double getParticipaDesejada(){
                return participacao_desejada;
            }
            public double getPartticipaAposCorrecao(){
                return participacao_aposCorrecao;
            }
            public double getFontePotassio(){
                return fontePotassio;
            }
            public double getQntAplicar(){
                return qnt_aplicar;
            }
            public double getCustoHetctare(){
                return custo_hectares;
            }
            public double getCloretoPotassio(){
                return cloreto_potassio;
            }
            public double getSulfatoPotassio(){
                return sulfato_potassio;
            }
            public double getSulfatoMagnesio() {
                return sulfato_potassioMagnesio;
            }

    }
