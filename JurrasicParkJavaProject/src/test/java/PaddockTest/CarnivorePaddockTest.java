package PaddockTest;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;
import Dinosaurs.Diplodocus;
import Dinosaurs.Velociraptor;
import Paddocks.CarnivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarnivorePaddockTest {

    CarnivorePaddock carnivorePaddock;
    Dinosaur dinosaur;
    Velociraptor velociraptor;
    Diplodocus diplodocus;



    @Before
    public void before(){
        carnivorePaddock = new CarnivorePaddock("VelociraptorPaddock", DietType.CARNIVORE, 100);
        velociraptor = new Velociraptor("Iain", "Velociraptor", 00.15, 30, DietType.CARNIVORE);
        diplodocus = new Diplodocus("Allan", "DiploDocus", 15.00, 70, DietType.HERBIVORE);
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
    public void canAddDinosaursToCarnivorePaddock(){
        carnivorePaddock.addDinosaur(velociraptor);
        assertEquals(1,carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canRemoveDinosaurFromCarnivorePaddock(){
        carnivorePaddock.addDinosaur(velociraptor);
        carnivorePaddock.removeDinosaur(velociraptor);
        assertEquals(0,carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canGetDinosaurToAttackFence(){
       assertEquals(70,  carnivorePaddock.getFenceDurability() - velociraptor.getAttackPower());
    }

    @Test
    public void canCarnivorePaddockStickToDietTYPE(){
        carnivorePaddock.addDinosaur(velociraptor);
        assertEquals(1, carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canCarnivorePaddockNotTakeInHerbivores(){
        carnivorePaddock.addDinosaur(diplodocus);
        assertEquals(0, carnivorePaddock.countDinosaurs());
    }

}
