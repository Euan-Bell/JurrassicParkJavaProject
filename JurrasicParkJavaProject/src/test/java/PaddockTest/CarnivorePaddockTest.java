package PaddockTest;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;
import Paddocks.CarnivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarnivorePaddockTest {

    CarnivorePaddock carnivorePaddock;
    Dinosaur dinosaur;


    @Before
    public void before(){
        carnivorePaddock = new CarnivorePaddock("VelociraptorPaddock", DietType.CARNIVORE, 100);
    }

    @Test
    public void canGetPaddockName(){
        assertEquals("VelociraptorPaddock", carnivorePaddock.getName());
    }

    @Test
    public void canGetDietTYPE(){
        assertEquals(DietType.CARNIVORE, carnivorePaddock.getDietType());
    }

    @Test
    public void canGetFenceDurability(){
        assertEquals(100, carnivorePaddock.getFenceDurability());
    }

    @Test
    public void canCountDinosaurInCarnivorePaddock(){
        assertEquals(0,carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canCountDinosaursInCarnivorePaddock(){
        carnivorePaddock.addDinosaur(dinosaur);
        assertEquals(1,carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canRemoveDinosaurFromCarnivorePaddock(){
        carnivorePaddock.addDinosaur(dinosaur);
        carnivorePaddock.removeDinosaur(dinosaur);
        assertEquals(0,carnivorePaddock.countDinosaurs());


    }
}
