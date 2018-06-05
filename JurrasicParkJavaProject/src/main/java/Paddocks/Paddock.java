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
}
