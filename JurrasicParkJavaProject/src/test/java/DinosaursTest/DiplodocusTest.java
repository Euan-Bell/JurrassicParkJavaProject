package DinosaursTest;

import Dinosaurs.Diplodocus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiplodocusTest {

    Diplodocus diplodocus;

    @Before
    public void before(){
        diplodocus = new Diplodocus("Allan", "Diplodocus",15.00);
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
   
}
