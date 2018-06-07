package DinosaursTest;

import Dinosaurs.DietType;
import Dinosaurs.Food;
import Dinosaurs.Velociraptor;
import Paddocks.CarnivorePaddock;
import Paddocks.Paddock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VelociraptorTest {

    Velociraptor velociraptor;
    Food food;
    Food veg;
    Food mixed;
    CarnivorePaddock carnivorePaddock;

    @Before
    public void before() {
        velociraptor = new Velociraptor("Iain", "Velociraptor", 00.15, 30, DietType.CARNIVORE);
        food = new Food("CowChunks", DietType.CARNIVORE);
        veg = new Food("PlantLife", DietType.HERBIVORE);
        mixed = new Food("Chicken StirFry", DietType.OMNIVORE);
        carnivorePaddock = new CarnivorePaddock("Velociraptor Paddock", DietType.CARNIVORE, 100);
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
    public void canHaveVelociraptorUnableToEatHerbivoreDietType(){
        velociraptor.feedDinosaur(veg);
        assertEquals(0, velociraptor.canBeFed());
    }

    @Test
    public void canHaveVelociraptorUnableToEatOmnivoreDietType(){
        velociraptor.feedDinosaur(mixed);
        assertEquals(0, velociraptor.canBeFed());
    }

    @Test
    public void canGetAttackPower(){
        assertEquals(30, velociraptor.getAttackPower());
    }

    @Test
    public void canGetDinosaurToAttackFence(){
        velociraptor.attackFence(carnivorePaddock);
        assertEquals(70, carnivorePaddock.getFenceDurability());
    }

    @Test
    public void canDinosaurEscape(){
        carnivorePaddock.setFenceDurability(30);
        carnivorePaddock.addDinosaur(velociraptor);
        velociraptor.attackFence(carnivorePaddock);
        velociraptor.escape(carnivorePaddock);
        assertEquals(0,carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canDinosaurEscapeFails(){
        carnivorePaddock.setFenceDurability(100);
        carnivorePaddock.addDinosaur(velociraptor);
        velociraptor.attackFence(carnivorePaddock);
        velociraptor.escape(carnivorePaddock);
        assertEquals(1,carnivorePaddock.countDinosaurs());
    }

    @Test
    public void canDinosaurEscapeAfterSeveralAttacks(){
        carnivorePaddock.setFenceDurability(60);
        carnivorePaddock.addDinosaur(velociraptor);
        velociraptor.attackFence(carnivorePaddock);
        velociraptor.attackFence(carnivorePaddock);
        velociraptor.escape(carnivorePaddock);
        assertEquals(0,carnivorePaddock.countDinosaurs());
    }

}





