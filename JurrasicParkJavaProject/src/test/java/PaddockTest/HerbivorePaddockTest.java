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
    public void canCountDinosaurInCarnivorePaddock(){
        assertEquals(0,herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canCountDinosaursInCarnivorePaddock(){
        herbivorePaddock.addDinosaur(dinosaur);
        assertEquals(1,herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canRemoveDinosaurFromCarnivorePaddock(){
        herbivorePaddock.addDinosaur(dinosaur);
        herbivorePaddock.removeDinosaur(dinosaur);
        assertEquals(0,herbivorePaddock.countDinosaurs());


    }
}

