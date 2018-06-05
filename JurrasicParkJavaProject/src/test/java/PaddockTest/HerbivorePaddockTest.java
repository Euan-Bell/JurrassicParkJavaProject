package PaddockTest;

import Dinosaurs.*;
import Dinosaurs.DietType;
import Paddocks.HerbivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbivorePaddockTest {

    HerbivorePaddock herbivorePaddock;
    Diplodocus diplodocus;
    Velociraptor velociraptor;
    Eoraptor eoraptor;



    @Before
    public void before(){
        herbivorePaddock = new HerbivorePaddock("DiplodocusPaddock", DietType.HERBIVORE, 100);
        diplodocus = new Diplodocus("Allan", "Diplodocus", 15.00, 70, DietType.HERBIVORE);
        velociraptor = new Velociraptor("Iain", "Velociraptor", 00.15, 30, DietType.CARNIVORE);
        eoraptor = new Eoraptor("Owen", "Eoraptor", 00.10, 10, DietType.OMNIVORE);

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
    public void canAddDinosaursInHerbivorePaddock(){
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

    @Test
    public void canHerbivorePaddockStickToDietTYPE(){
        herbivorePaddock.addDinosaur(diplodocus);
        assertEquals(1, herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canHerbivorePaddockNotTakeInCarnivores(){
        herbivorePaddock.addDinosaur(velociraptor);
        assertEquals(0, herbivorePaddock.countDinosaurs());
    }

    @Test
    public void canHerbivorePaddockNotTakeInOmnivores(){
        herbivorePaddock.addDinosaur(eoraptor);
        assertEquals(0, herbivorePaddock.countDinosaurs());
    }
}


