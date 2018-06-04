package DinosaursTest;

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

    @Before
    public void before() {
        velociraptor = new Velociraptor("Iain", "Velociraptor", 00.15);
        food = new Food();
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
    public void canCheckIfDinosaurIsFed(){
        assertEquals(0, velociraptor.canBeFed());
    }

    @Test
    public void canFeedDinosaur(){
        velociraptor.feedDinosaur(food);
        assertEquals(1, velociraptor.canBeFed());
    }




}
