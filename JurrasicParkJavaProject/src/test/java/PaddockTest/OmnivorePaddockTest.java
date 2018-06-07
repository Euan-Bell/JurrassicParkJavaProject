package PaddockTest;

import Dinosaurs.DietType;
import Dinosaurs.Diplodocus;
import Dinosaurs.Eoraptor;
import Dinosaurs.Velociraptor;
import Paddocks.OmnivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmnivorePaddockTest {

    OmnivorePaddock omnivorePaddock;
    Diplodocus diplodocus;
    Velociraptor velociraptor;
    Eoraptor eoraptor;



    @Before
    public void before(){
        omnivorePaddock = new OmnivorePaddock("EoraptorPaddock", DietType.OMNIVORE, 100);
        diplodocus = new Diplodocus("Allan", "Diplodocus", 15.00, 70, DietType.HERBIVORE);
        velociraptor = new Velociraptor("Iain", "Velociraptor", 00.15, 30, DietType.CARNIVORE);
        eoraptor = new Eoraptor("Owen", "Eoraptor", 00.10, 10, DietType.OMNIVORE);

    }

    @Test
    public void canGetPaddockName(){
        assertEquals("EoraptorPaddock", omnivorePaddock.getName());
    }

    @Test
    public void canGetDietTYPE(){
        assertEquals(DietType.OMNIVORE, omnivorePaddock.getDietType());
    }

    @Test
    public void canGetFenceDurability(){
        assertEquals(100, omnivorePaddock.getFenceDurability());
    }

    @Test
    public void canCountDinosaurInOmnivorePaddock(){
        assertEquals(0,omnivorePaddock.countDinosaurs());
    }

    @Test
    public void canAddDinosaursInOmnivorePaddock(){
        omnivorePaddock.addDinosaur(eoraptor);
        assertEquals(1,omnivorePaddock.countDinosaurs());
    }

    @Test
    public void canRemoveDinosaurFromOmnivorePaddock(){
        omnivorePaddock.addDinosaur(eoraptor);
        omnivorePaddock.removeDinosaur(eoraptor);
        assertEquals(0,omnivorePaddock.countDinosaurs());
    }

    @Test
    public void canGetDinosaurToAttackFence(){
        assertEquals(30,  omnivorePaddock.getFenceDurability() - diplodocus.getAttackPower());
    }

    @Test
    public void canOmnivorePaddockStickToDietTYPE(){
        omnivorePaddock.addDinosaur(eoraptor);
        assertEquals(1, omnivorePaddock.countDinosaurs());
    }

    @Test
    public void canOmnivorePaddockNotTakeInCarnivores(){
        omnivorePaddock.addDinosaur(velociraptor);
        assertEquals(0, omnivorePaddock.countDinosaurs());
    }

    @Test
    public void canOmnivorePaddockNotTakeInHerbivores(){
        omnivorePaddock.addDinosaur(diplodocus);
        assertEquals(0, omnivorePaddock.countDinosaurs());
    }


    @Test
    public void canSetFenceDurability(){
        omnivorePaddock.setFenceDurability(100);
        assertEquals(100, omnivorePaddock.getFenceDurability());
    }

    @Test
    public void canCheckIfFenceIsBrokenTrue(){
        omnivorePaddock.setFenceDurability(10);
        eoraptor.attackFence(omnivorePaddock);
        assertEquals(true, omnivorePaddock.fenceBroken());
    }

    @Test
    public void canCheckIfFenceIsBrokenFalse(){
        omnivorePaddock.setFenceDurability(100);
        eoraptor.attackFence(omnivorePaddock);
        assertEquals(false, omnivorePaddock.fenceBroken());
    }

    @Test
    public void canCheckIfFenceIsBrokenAfterSeveralAttacksTrue(){
        omnivorePaddock.setFenceDurability(40);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.attackFence(omnivorePaddock);
        assertEquals(true, omnivorePaddock.fenceBroken());
    }

    @Test
    public void canCheckIfFenceIsBrokenAfterSeveralAttacksFalse(){
        omnivorePaddock.setFenceDurability(100);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.attackFence(omnivorePaddock);
        assertEquals(false, omnivorePaddock.fenceBroken());
    }
}




