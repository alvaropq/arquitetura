package com.mycompany.projet_solo.Correction;

public class FosforoCorrect {
   
        private double area_talhao;
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


        public FosforoCorrect(
            double area_talhao,
            double teor_fosforo,
            double fonte_fosforo,
            double eficiencia_fosforo,
            double custo_hectare,
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
            double multif_magnesiano) {

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
            public double getTalhao(){
                return area_talhao;
            }

            public double getTeor(){
                return teor_fosforo;
            }
            public double getFonte(){
                return fonte_fosforo;
            }
            public double getEficienciaFosforo(){
                return eficiencia_fosforo;
            }
            public double getCusto(){
                return custo_hectare;
            }
            public double getSuperfosfato(){
                return superfosfato;
            }
            public double getDap(){
                return dap;
            }
            public double getFosfatoGafsa(){
                return fosfato_gafsa;
            }
            public double getEscoria(){
                return escoria_thoma;
            }
            public double getSuperTriplo() {
                return superfosfato_triplo;
            }
            public double getYoorin(){
                return yoorin;
            }public double getFosfatoDaoui(){
                return fosfato_daoui;
            }public double getAcidoFosforico(){
                return acido_fosforico;
            }public double getMap(){
                return map;
            }public double getFosfatoArad(){
                return fosfato_arad;
            }public double getFosPatosMina(){
                return fos_Patos_minas;
            }public double getMultiMagnesiano(){
                return multif_magnesiano;
            }
    
}
