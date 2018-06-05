package PaddockTest;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;
import Dinosaurs.Diplodocus;
import Paddocks.HerbivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbivorePaddockTest {

    HerbivorePaddock herbivorePaddock;
    Dinosaur dinosaur;
    Diplodocus diplodocus;



    @Before
    public void before(){
        herbivorePaddock = new HerbivorePaddock("DiplodocusPaddock", DietType.HERBIVORE, 100);
        diplodocus = new Diplodocus("Allan", "Diplodocus", 15.00, 70, DietType.HERBIVORE);
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
    public void canGetFenceDurability(){
        assertEquals(100, herbivorePaddock.getFenceDurability());
    }

    @Test
    public void canCountDinosaurInHerbivorePaddock(){
        assertEquals(0,herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canCountDinosaursInHerbivorePaddock(){
        herbivorePaddock.addDinosaur(diplodocus);
        assertEquals(1,herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canRemoveDinosaurFromHerbivorePaddock(){
        herbivorePaddock.addDinosaur(diplodocus);
        herbivorePaddock.removeDinosaur(diplodocus);
        assertEquals(0,herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canGetDinosaurToAttackFence(){
        assertEquals(30,  herbivorePaddock.getFenceDurability() - diplodocus.getAttackPower());
    }



    }


