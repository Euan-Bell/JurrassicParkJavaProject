package PaddockTest;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;
import Paddocks.HerbivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbivorePaddockTest {

    HerbivorePaddock herbivorePaddock;
    Dinosaur dinosaur;


    @Before
    public void before(){
        herbivorePaddock = new HerbivorePaddock("DiplodocusPaddock", DietType.HERBIVORE);
    }

    @Test
    public void canGetPaddockName(){
        assertEquals("DiplodocusPaddock", herbivorePaddock.getName());
    }

    @Test
    public void canGetDietTYPE(){
        assertEquals(DietType.HERBIVORE, herbivorePaddock.getDietType());
    }

    @Test
    public void canCountDinosaurInHerbivorePaddock(){
        assertEquals(0,herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canCountDinosaursInHerbivorePaddock(){
        herbivorePaddock.addDinosaur(dinosaur);
        assertEquals(1,herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canRemoveDinosaurFromHerbivorePaddock(){
        herbivorePaddock.addDinosaur(dinosaur);
        herbivorePaddock.removeDinosaur(dinosaur);
        assertEquals(0,herbivorePaddock.countDinosaurs());


    }
}

