package DinosaursTest;

import Dinosaurs.DietType;
import Dinosaurs.Eoraptor;
import Dinosaurs.Food;
import Paddocks.HerbivorePaddock;
import Paddocks.OmnivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EoraptorTest {

    Eoraptor eoraptor;
    Food food;
    Food food1;
    Food food2;
    OmnivorePaddock omnivorePaddock;

    @Before
    public void before(){
        eoraptor = new Eoraptor("Owen", "Eoraptor",10.00, 10, DietType.OMNIVORE);
        food = new Food("PlantLife", DietType.HERBIVORE);
        food1 = new Food("CowChunks",DietType.CARNIVORE);
        food2 = new Food("Chicken Stirfry", DietType.OMNIVORE);
        omnivorePaddock = new OmnivorePaddock("Eoraptor Paddock", DietType.OMNIVORE, 100);
    }


    @Test
    public void canGetName(){
        assertEquals("Owen", eoraptor.getName());
    }

    @Test
    public void canGetSpecies(){
        assertEquals("Eoraptor", eoraptor.getSpecies());
    }

    @Test
    public void canGetWeight(){
        assertEquals(10.00,eoraptor.getWeight(),00.01);
    }

    @Test
    public void canCheckIfDinosaurIsFed(){
        assertEquals(0, eoraptor.canBeFed());
    }

    @Test
    public void canHaveEoraptorStickToDietTYPE(){
        eoraptor.feedDinosaur(food2);
        assertEquals(1, eoraptor.canBeFed());
    }

    @Test
    public void canGetAttackPower(){
        assertEquals(10, eoraptor.getAttackPower());
    }

    @Test
    public void canGetDietType(){
        assertEquals(DietType.OMNIVORE, eoraptor.getDietType());
    }

    @Test
    public void canGetDinosaurToAttackFence(){
        eoraptor.attackFence(omnivorePaddock);
        assertEquals(90, omnivorePaddock.getFenceDurability());
    }

    @Test
    public void canDinosaurEscape(){
        omnivorePaddock.setFenceDurability(10);
        omnivorePaddock.addDinosaur(eoraptor);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.escape(omnivorePaddock);
        assertEquals(0,omnivorePaddock.countDinosaurs());
    }

    @Test
    public void canDinosaurEscapeFails(){
        omnivorePaddock.setFenceDurability(100);
        omnivorePaddock.addDinosaur(eoraptor);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.escape(omnivorePaddock);
        assertEquals(1,omnivorePaddock.countDinosaurs());
    }
//
    @Test
    public void canDinosaurEscapeAfterSeveralAttacks(){
        omnivorePaddock.setFenceDurability(20);
        omnivorePaddock.addDinosaur(eoraptor);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.attackFence(omnivorePaddock);
        eoraptor.escape(omnivorePaddock);
        assertEquals(0,omnivorePaddock.countDinosaurs());
    }
}




