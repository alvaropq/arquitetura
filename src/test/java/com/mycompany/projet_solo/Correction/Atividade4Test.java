package com.mycompany.projet_solo.Correction;

import com.mycompany.projet_solo.Correction.EquilibrioCorrect.EquilibrioCorrectBuilder;
import com.mycompany.projet_solo.Correction.PotassioCorrect.PotassioCorrectBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Álvaro
 */
public class Atividade4Test {
    
    @Test
    public void testTeoresDoSolo() {
        EquilibrioCorrectBuilder builder = new EquilibrioCorrectBuilder();
        builder.setTesturaDoSolo(1);
        builder.setDadoFosforo(8.59);
        builder.setDadoPotassio(0.15);
        builder.setDadoCalcio(5.76);
        builder.setDadoMagnesio(1.63);
        builder.setDadoEnxofre(3.67);
        builder.setDadoHal(5.35);
        builder.setCarbono(17.84);
        builder.setMateriaOrganica(30.7);
            assertEquals(7.54, new Correct().Scmol(new EquilibrioCorrect(builder)), 0.0);
            assertEquals(12.89, new Correct().CTC_Cmol(new EquilibrioCorrect(builder),new Correct().Scmol(new EquilibrioCorrect(builder))), 0.0);
            assertEquals(58.49, new Correct().ValorPorcentagemAtual(new Correct().Scmol(new EquilibrioCorrect(builder)),
                     new Correct().CTC_Cmol(new EquilibrioCorrect(builder),new Correct().Scmol(new EquilibrioCorrect(builder)))
            ), 0.1);
            assertEquals(3.07, new Correct().PorcentagemDeMateriaOrganica(new EquilibrioCorrect(builder)), 0.1);     
    }
    
     @Test
    public void testCorrecaoFosforo() {
        // Métodos incompletos
    }
    
    @Test
    public void testCorrecaoPotassio() {
        assertEquals("Participação do Potássio no CTC: 3,0%", new AnalisaPotassio().RecuperaPotassio());
    }
}
