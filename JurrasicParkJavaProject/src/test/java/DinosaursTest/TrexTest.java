package DinosaursTest;

import Dinosaurs.DietType;
import Dinosaurs.Food;
import Dinosaurs.Trex;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class TrexTest {

    Trex trex;
    Food food;
    Food food1;
    Food food2;

    @Before
    public void before() {
        trex = new Trex("Hammond", "Trex", 09.00, 100, DietType.CARNIVORE);
        food = new Food("CowChunks", DietType.CARNIVORE);
        food1 = new Food("PlantLife", DietType.HERBIVORE);
        food2 = new Food("Chicken StirFry", DietType.OMNIVORE);
    }

    @Test
    public void canGetName(){
        assertEquals("Hammond", trex.getName());
    }

    @Test
    public void canGetSpecies(){
        assertEquals("Trex", trex.getSpecies());
    }

    @Test
    public void canGetWeight(){
        assertEquals(09.00, trex.getWeight(),00.01);
    }

    @Test
    public void canGetDietType(){
        assertEquals(DietType.CARNIVORE, trex.getDietType());
    }

    @Test
    public void canCheckIfDinosaurIsFed(){
        assertEquals(0, trex.canBeFed());
    }

    @Test
    public void canHaveTrexStickToDietTYPE(){
        trex.feedDinosaur(food);
        assertEquals(1, trex.canBeFed());
    }

    @Test
    public void canHaveTrexUnableToEatHerbivoreDietType(){
        trex.feedDinosaur(food1);
        assertEquals(0, trex.canBeFed());
    }

    @Test
    public void canHaveTrexUnableToEatOmnivoreDietType(){
        trex.feedDinosaur(food2);
        assertEquals(0, trex.canBeFed());
    }

    @Test
    public void canGetAttackPower(){
        assertEquals(100, trex.getAttackPower());
    }
}
