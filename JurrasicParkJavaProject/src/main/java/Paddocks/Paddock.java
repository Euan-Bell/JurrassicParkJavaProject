package Paddocks;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;

import java.util.ArrayList;

public abstract class Paddock {

    private String name;
    private  DietType dietType;
    private ArrayList<Dinosaur> paddock;
    private int fenceDurability;

    public Paddock( String name, DietType dietType, int fenceDurability){
        this.name = name;
        this.dietType = dietType;
        this.paddock = new ArrayList();
        this.fenceDurability = fenceDurability;

    }

    public  String getName() {
       return name;
    }

    public DietType getDietType() {
        return dietType;
    }

    public int getFenceDurability() {
        return fenceDurability;
    }

    public int countDinosaurs() {
        return this.paddock.size();
    }

    public int addDinosaur(Dinosaur dinosaur) {
        paddock.add(dinosaur);
        return paddock.size();
    }

    public int removeDinosaur(Dinosaur dinosaur) {
         paddock.remove(dinosaur);
        return paddock.size();
    }
}
