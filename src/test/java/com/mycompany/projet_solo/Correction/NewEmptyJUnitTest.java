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
        FosforoCorrect fosforo = new FosforoCorrect.FosforoCorrectBuilder()
                                                .setSuperFosfato(1.0)
                                                .setDap(1.0)
                                                .setFosfatoGafsa(1.0)
                                                .setEscoriaThoma(1.0)
                                                .setSuperFosfatoTriplo(1.0)
                                                .setYoorin(1.0)
                                                .setFosfatoDaoui(1.0)
                                                .setAcidoFosforico(1.0)
                                                .setMap(1.0)
                                                .setFosfatoArad(1.0)
                                                .setFosfatoPatosMinas(1.0)
                                                .setMultiMagnesio(1.0)
                                                .builder();
       
        
       assertEquals(12.0, 
           new AnalisaFosforo().ValorPorTonelada(fosforo));          
    }
   
    @Test
    public void testAdicionaFosforo(){
        FosforoCorrect fosforo = new FosforoCorrect.FosforoCorrectBuilder()
                                        .setTeorFosforo(1.0)
                                        .setFonteFosforo(4.0)
                                        .builder();
    assertEquals(3.0,
        new AnalisaFosforo().AdicionarFosforo(fosforo));
    }
    @Test
    public void testFosforoAproveitado(){
        FosforoCorrect fosforo = new FosforoCorrect.FosforoCorrectBuilder()
                                        .setEficienciaFosforo(3.0)
                                        .builder();
        assertEquals(133,333333,
            new AnalisaFosforo().FosforoAproveitado(4.0,fosforo));
    }
    @Test
    public void testFosforoHectare(){
        FosforoCorrect fosforo = new FosforoCorrect.FosforoCorrectBuilder()
                                                    .setFonteFosforo(4.0)
                                                    .builder();
        assertEquals(833,333325,
            new AnalisaFosforo().FosforoPorHectare(133.333333,fosforo));
    }
    @Test
    public void testFosforoAl(){
        assertEquals(344.352614,
            new AnalisaFosforo().FosforoPorAlquere(833.333325));
    }
    @Test
    public void testCustoAl(){
        assertEquals(4.13223132,
            new AnalisaFosforo().CustoPorAlquere(344.352614,12.0));
    }
    @Test
    public void testCustoHectare(){
        assertEquals(22.7272723,
            new AnalisaFosforo().CustoPorHectare(4.13223132));
    }
    @Test
    public void testCustoTotalHectare(){
        assertEquals(124.999998,
        new AnalisaFosforo().CustoTotalHectare(22.7272723));
    }

    //              TESTA POTASSIO
    @Test
    public void testValorPotassio(){
        PotassioCorrect potassio = new PotassioCorrect.PotassioCorrectBuilder()
                                                        .setCloretoDePotassio(2.0)
                                                        .setSulfatoPotassio(2.0)
                                                        .setSulfatoPotassio_Magnesio(2.0)
                                                        .builder();
        assertEquals(6.0,
            new AnalisaPotassio().ValorPorToneladaPotassio(potassio));
    }
    @Test
    public void testCtctotal(){
        PotassioCorrect potassio = new PotassioCorrect.PotassioCorrectBuilder()
                                                        .setScmol(2.0)
                                                        .setDadoHal(6.0)
                                                        .builder();
        assertEquals(3.0,
            new AnalisaPotassio().Ctctotal(potassio));
    }
    @Test
    public void testTeorAtingir(){
        PotassioCorrect potassio = new PotassioCorrect.PotassioCorrectBuilder()
                                                        .setPotassioDesejado(6.0)
                                                        .builder();
        assertEquals(0.18,
            new AnalisaPotassio().TeorAtingir(potassio,3.0));
    }
    @Test
    public void testNecessidadePotassio(){
        PotassioCorrect potassio = new PotassioCorrect.PotassioCorrectBuilder()
                                                        .setPotassioAtualDoSolo(8.0)
                                                        .setPotassioDesejado(6.0)
                                                        .builder();
    assertEquals(2.0,
            new AnalisaPotassio().NecessitaPotassio(potassio));
    }
    @Test
    public void testAproita(){
        PotassioCorrect potassio = new PotassioCorrect.PotassioCorrectBuilder()
                                                    .setDadoPotassio(0.15)
                                                    .setEficienciaPotassio(3.0)
                                                    .builder();
        assertEquals(46.92,
            new AnalisaPotassio().Aproveita(potassio));
    }
    @Test
    public void testPotasioHectare(){
        PotassioCorrect potassio = new PotassioCorrect.PotassioCorrectBuilder()
                                                    .setPotassioAUsar(4.0)
                                                    .builder();
        assertEquals(1.173,
            new AnalisaPotassio().QntPotassioHectare(46.92, potassio));
    }
    @Test
    public void testPotassioAl(){
        assertEquals(2.920,
            new AnalisaPotassio().QntPotassioAlquere(1.173));
     }
     @Test
     public void testCustoAlPotassio(){
        assertEquals(0.1752,
            new AnalisaPotassio().CustoAlquere(6.0, 2.920));
     }
     @Test
     public void testCustoHectarePotassio(){
         assertEquals(0.07239669,
            new AnalisaPotassio().CustoHectare(0.1752));
     }
     @Test
     public void testCustoTotal(){
         assertEquals(0.3981818,
            new AnalisaPotassio().CustoTotal(0.07239669));
     }
}
