package DinosaursTest;

import Dinosaurs.DietType;
import Dinosaurs.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class foodTest {

   Food food;

   @Before
    public void before(){
       food = new Food("Plantlife", DietType.HERBIVORE);
   }

   @Test
    public void getFoodName(){
       assertEquals("Plantlife",food.getFoodName());
   }

   @Test
    public void getFoodType(){
       assertEquals(DietType.HERBIVORE, food.getFoodType());
   }
}
