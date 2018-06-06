package PaddockTest;

import Dinosaurs.*;
import Dinosaurs.DietType;
import Paddocks.CarnivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarnivorePaddockTest {

    CarnivorePaddock carnivorePaddock;
    Velociraptor velociraptor;
    Diplodocus diplodocus;
    Eoraptor eoraptor;
    Trex trex;
    Stegosaurus stegosaurus;



    @Before
    public void before(){
        carnivorePaddock = new CarnivorePaddock("VelociraptorPaddock", DietType.CARNIVORE, 100);
        velociraptor = new Velociraptor("Iain", "Velociraptor", 00.15, 30, DietType.CARNIVORE);
        trex = new Trex("Hammond", "Trex", 09.00, 100, DietType.CARNIVORE);
        diplodocus = new Diplodocus("Allan", "DiploDocus", 15.00, 70, DietType.HERBIVORE);
        stegosaurus = new Stegosaurus("Henry", "Stegosaurus", 07.00, 50, DietType.HERBIVORE);
        eoraptor = new Eoraptor("Owen", "Eoraptor", 10.00, 10, DietType.OMNIVORE);
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
    public void canCarnivorePaddockTakeInAllCarnivoreDietTYPE(){
        carnivorePaddock.addDinosaur(trex);
        assertEquals(1, carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canCarnivorePaddockNotTakeInHerbivoreDietTYPE(){
        carnivorePaddock.addDinosaur(diplodocus);
        assertEquals(0, carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canHerbivorePaddockRejectAllHerbivoreDietTYPE(){
        carnivorePaddock.addDinosaur(stegosaurus);
        assertEquals(0, carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canCarnivorePaddockNotTakeInOmnivores(){
        carnivorePaddock.addDinosaur(eoraptor);
        assertEquals(0, carnivorePaddock.countDinosaurs());
    }

}
