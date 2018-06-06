package DinosaursTest;

import Dinosaurs.DietType;
import Dinosaurs.Eoraptor;
import Dinosaurs.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EoraptorTest {

    Eoraptor eoraptor;
    Food food;
    Food food1;
    Food food2;

    @Before
    public void before(){
        eoraptor = new Eoraptor("Owen", "Eoraptor",10.00, 10, DietType.OMNIVORE);
        food = new Food("PlantLife", DietType.HERBIVORE);
        food1 = new Food("CowChunks",DietType.CARNIVORE);
        food2 = new Food("Chicken Stirfry", DietType.OMNIVORE);
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

}


