package DinosaursTest;

import Dinosaurs.Velociraptor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VelociraptorTest {

    Velociraptor velociraptor;

    @Before
    public void before() {
        velociraptor = new Velociraptor("Iain", "Velociraptor", 00.15);
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


}
