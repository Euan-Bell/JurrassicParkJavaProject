package DinosaursTest;

import Dinosaurs.DietType;
import Dinosaurs.Food;
import Dinosaurs.Velociraptor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VelociraptorTest {

    Velociraptor velociraptor;
    ArrayList<Food> stomach;
    Food food;
    Food food1;
    Food food2;

    @Before
    public void before() {
        velociraptor = new Velociraptor("Iain", "Velociraptor", 00.15, 30, DietType.CARNIVORE);
        food = new Food("CowChunks", DietType.CARNIVORE);
        food1 = new Food("PlantLife", DietType.HERBIVORE);
        food2 = new Food("Chicken StirFry", DietType.OMNIVORE);
    }

    @Test
    public void canGetName(){
        assertEquals("Iain", velociraptor.getName());
    }

    @Test
    public void canGetSpecies(){
        assertEquals("Velociraptor", velociraptor.getSpecies());
    }

    @Test
    public void canGetWeight(){
        assertEquals(00.15, velociraptor.getWeight(),00.01);
    }

    @Test
    public void canGetDietType(){
        assertEquals(DietType.CARNIVORE, velociraptor.getDietType());
    }

    @Test
    public void canCheckIfDinosaurIsFed(){
        assertEquals(0, velociraptor.canBeFed());
    }

    @Test
    public void canHaveVelociraptorStickToDietTYPE(){
        velociraptor.feedDinosaur(food);
        assertEquals(1, velociraptor.canBeFed());
    }

    @Test
    public void canHaveVelociraptorUnableToEatAnythingOtherThanDietType(){
        velociraptor.feedDinosaur(food1);
        assertEquals(0, velociraptor.canBeFed());
    }

    @Test
    public void canHaveVelociraptorUnableToEatAnythingOtherThanDietType2(){
        velociraptor.feedDinosaur(food2);
        assertEquals(0, velociraptor.canBeFed());
    }



    @Test
    public void canGetAttackPower(){
        assertEquals(30, velociraptor.getAttackPower());
    }




}
