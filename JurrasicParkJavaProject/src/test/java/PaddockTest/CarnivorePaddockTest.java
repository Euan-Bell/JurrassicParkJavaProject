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
        carnivorePaddock = new CarnivorePaddock("VelociraptorPaddock", DietType.CARNIVORE);
    }

    @Test
    public void canCountDinosaurInCarnivorePaddock(){
        assertEquals(0,carnivorePaddock.countDinosaurs());

    }
}
