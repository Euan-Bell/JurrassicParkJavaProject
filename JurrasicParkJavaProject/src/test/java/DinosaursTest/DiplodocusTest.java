package DinosaursTest;

import Dinosaurs.DietType;
import Dinosaurs.Diplodocus;
import Dinosaurs.Food;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiplodocusTest {

    Diplodocus diplodocus;
    Food food;

    @Before
    public void before(){
        diplodocus = new Diplodocus("Allan", "Diplodocus",15.00, 70, DietType.HERBIVORE);
        food = new Food("PlantLife", DietType.HERBIVORE);
    }

   @Test
    public void canGetName(){
        assertEquals("Allan", diplodocus.getName());
   }

   @Test
    public void canGetSpecies(){
        assertEquals("Diplodocus", diplodocus.getSpecies());
   }

   @Test
    public void canGetWeight(){
        assertEquals(15.00,diplodocus.getWeight(),00.01);
   }

    @Test
    public void canCheckIfDinosaurIsFed(){
        assertEquals(0, diplodocus.canBeFed());
    }

    @Test
    public void canFeedDinosaur(){
        diplodocus.feedDinosaur(food);
        assertEquals(1, diplodocus.canBeFed());
    }

    @Test
    public void canHaveDiplodocusEatDiet(){
        diplodocus.feedDinosaur(food);
        assertEquals(1, diplodocus.canBeFed());
    }

//    check what dietType the dinosaur is,
//    check was dietType food is,
//    if they are equal == run .feedDinosaur,
//    if not just return.






   @Test
    public void canGetAttackPower(){
        assertEquals(70, diplodocus.getAttackPower());
   }

   @Test
    public void canGetDietType(){
        assertEquals(DietType.HERBIVORE, diplodocus.getDietType());
   }

}
