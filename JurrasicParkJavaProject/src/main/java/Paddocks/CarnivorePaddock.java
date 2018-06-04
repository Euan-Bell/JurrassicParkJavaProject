package Paddocks;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;

import java.util.ArrayList;

import static Dinosaurs.DietType.CARNIVORE;

public class CarnivorePaddock extends Paddock{

    private ArrayList<Dinosaur> carnivorePaddock;

    public CarnivorePaddock(String name, DietType dietType){
        super(name, dietType);
        this.carnivorePaddock = new ArrayList<>();
    }

    public int countDinosaurs() {
        return this.carnivorePaddock.size();
    }
}


