package Paddocks;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;

import java.util.ArrayList;

public class HerbivorePaddock extends Paddock {

    private ArrayList<Dinosaur> herbivorePaddock;

    public HerbivorePaddock(String name, DietType dietType, int fenceDurability){
        super(name, dietType, fenceDurability);
        this.herbivorePaddock = new ArrayList<>();
    }

    public int countDinosaurs() {
        return this.herbivorePaddock.size();
    }

    public int addDinosaur(Dinosaur dinosaur) {
        herbivorePaddock.add(dinosaur);
        return herbivorePaddock.size();
    }

    public int removeDinosaur(Dinosaur dinosaur) {
        herbivorePaddock.remove(dinosaur);
        return herbivorePaddock.size();
    }
}


