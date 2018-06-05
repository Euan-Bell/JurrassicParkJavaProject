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
    Food food1;
    Food food2;

    @Before
    public void before(){
        diplodocus = new Diplodocus("Allan", "Diplodocus",15.00, 70, DietType.HERBIVORE);
        food = new Food("PlantLife", DietType.HERBIVORE);
        food1 = new Food("CowChunks",DietType.CARNIVORE);
        food2 = new Food("Chicken Stirfry", DietType.OMNIVORE);
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
    public void canHaveDiplodocusStickToDietTYPE(){
        diplodocus.feedDinosaur(food);
        assertEquals(1, diplodocus.canBeFed());
    }

    @Test
    public void canHaveDiplodocusUnableToEatAnythingOtherThanDietType(){
        diplodocus.feedDinosaur(food1);
        assertEquals(0, diplodocus.canBeFed());
    }

    @Test
    public void canHaveDiplodocusUnableToEatAnythingOtherThanDietType2(){
        diplodocus.feedDinosaur(food2);
        assertEquals(0, diplodocus.canBeFed());
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
