package DinosaursTest;

import Dinosaurs.DietType;
import Dinosaurs.Food;
import Dinosaurs.Stegosaurus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StegosaurusTest {

    Stegosaurus stegosaurus;
    Food food;
    Food food1;
    Food food2;

    @Before
    public void before(){
        stegosaurus = new Stegosaurus("Henry", "Stegosaurus",07.00, 50, DietType.HERBIVORE);
        food = new Food("PlantLife", DietType.HERBIVORE);
        food1 = new Food("CowChunks",DietType.CARNIVORE);
        food2 = new Food("Chicken Stirfry", DietType.OMNIVORE);
    }

    @Test
    public void canGetName(){
        assertEquals("Henry", stegosaurus.getName());
    }

    @Test
    public void canGetSpecies(){
        assertEquals("Stegosaurus", stegosaurus.getSpecies());
    }

    @Test
    public void canGetWeight(){
        assertEquals(07.00,stegosaurus.getWeight(),00.01);
    }

    @Test
    public void canCheckIfDinosaurIsFed(){
        assertEquals(0, stegosaurus.canBeFed());
    }

    @Test
    public void canHaveStegosaurusStickToDietTYPE(){
        stegosaurus.feedDinosaur(food);
        assertEquals(1, stegosaurus.canBeFed());
    }

    @Test
    public void canHaveStegosaurusUnableToEatCarnivoreDietType(){
        stegosaurus.feedDinosaur(food1);
        assertEquals(0, stegosaurus.canBeFed());
    }

    @Test
    public void canHaveStegosaurusUnableToEatOmnivoreDietType(){
        stegosaurus.feedDinosaur(food2);
        assertEquals(0, stegosaurus.canBeFed());
    }

    @Test
    public void canGetAttackPower(){
        assertEquals(50, stegosaurus.getAttackPower());
    }

    @Test
    public void canGetDietType(){
        assertEquals(DietType.HERBIVORE, stegosaurus.getDietType());
    }
}
