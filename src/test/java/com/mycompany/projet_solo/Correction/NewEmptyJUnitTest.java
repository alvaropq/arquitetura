package com.mycompany.projet_solo.Correction;
//import com.mycompany.projet_solo.Correction.FosforoCorrect;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author meu pc
 */
public class NewEmptyJUnitTest {
    //          TESTA FOSFORO
    @Test
    public void testValoresFosforo() {
        
       assertEquals(12.0,
       new Correct().ValorPorTonelada(1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0));
               
    }
    @Test
    public void testAdicionaFosforo(){
    assertEquals(3.0,
        new Correct().AdicionarFosforo(1.0,4.0));
    }
    @Test
    public void testFosforoAproveitado(){
        assertEquals(133,333333,
            new Correct().FosforoAproveitado(4.0,3.0));
    }
    @Test
    public void testFosforoHectare(){
        assertEquals(833,333325,
            new Correct().FosforoPorHectare(133.333333,4.0));
    }
    @Test
    public void testFosforoAl(){
        assertEquals(344.352614,
            new Correct().FosforoPorAlquere(833.333325));
    }
    @Test
    public void testCustoAl(){
        assertEquals(4.13223132,
            new Correct().CustoPorAlquere(344.352614,12.0));
    }
    @Test
    public void testCustoHectare(){
        assertEquals(22.7272723,
            new Correct().CustoPorHectare(4.13223132));
    }

    //              TESTA POTASSIO
    @Test
    public void testValorPotassio(){
        assertEquals(6.0,
            new Correct().ValorPorToneladaPotassio(2.0, 2.0, 2.0));
    }
    @Test
    public void testCtctotal(){
        assertEquals(3.0,
            new Correct().ctctotal(2.0, 6.0));
    }
    @Test
    public void testTeorAtingir(){
        assertEquals(0.18,
            new Correct().TeorAtingir(6.0,30));
    }
    @Test
    public void testNecessidadePotassio(){
        assertEquals(2.0,
            new Correct().NecessitaPotassio(8.0, 6.0));
    }
    @Test
    public void testAproita(){
        assertEquals(46.92,
            new Correct().Aproveita(0.15, 3.0));
    }
    @Test
    public void testPotasioHectare(){
        assertEquals(1.173,
            new Correct().QntPotassioHectare(46.92, 4.0));
    }
    @Test
    public void testPotassioAl(){
        assertEquals(2.920,
            new Correct().QntPotassioAlquere(1.173));
     }
     @Test
     public void testCustoAlPotassio(){
        assertEquals(0.1752,
            new Correct().CustoAlquere(6.0, 2.920));
     }
     @Test
     public void testCustoHectarePotassio(){
         assertEquals(0.07239669,
            new Correct().CustoHectare(0.1752));
     }
     @Test
     public void testCustoTotal(){
         assertEquals(0.3981818,
            new Correct().CustoTotal(0.07239669,5.5));
     }
}
