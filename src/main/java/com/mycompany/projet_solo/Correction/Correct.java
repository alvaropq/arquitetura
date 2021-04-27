 
package com.mycompany.projet_solo.Correction;

public class Correct {
      

        int Textura(EquilibrioCorrect equilibrio){
            if(equilibrio.getTexturaDoSolo() == 1){
                System.out.println("+ de 40% de argila");
                return 0;
                    }else if(equilibrio.getTexturaDoSolo() == 2){
                    System.out.println("25 a 40% de argila");  
                    return 0;     
                 }else{
                     return 0;
                 }
        }
        int TipoDePlantio(EquilibrioCorrect equilibrio){
            if(equilibrio.getSistemaCultivo() == 1){
                System.out.println("Plantio direto");
                return 0;
                 }else if(equilibrio.getSistemaCultivo() == 2){
                    System.out.println("Convencional");
                    return 0;
                    }else{
                        return 0;
                    }
        }
        double Scmol(EquilibrioCorrect equilibrio){
            return (equilibrio.getDadoPotassio() + equilibrio.getDadoCalcio() + equilibrio.getDadoMagnesio());
        }
        double CTC_Cmol(EquilibrioCorrect equilibrio, double Scmol){
            return (Scmol + equilibrio.getDadoHal());
        }
        double ValorPorcentagemAtual(double Scmol,double CTC_Cmol){
            return ((Scmol / CTC_Cmol) * 100);
        }
        double PorcentagemDeMateriaOrganica(EquilibrioCorrect equilibrio){
            return (equilibrio.getMateriOrganica() / 10);
        }
        double TeorIdealDeM_O(EquilibrioCorrect equilibrio){
            return ((equilibrio.getCarbono()/ 1.72)* 10);
        }
} 
    
    
    
   