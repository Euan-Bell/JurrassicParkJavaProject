package Paddocks;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;

import java.util.ArrayList;

public abstract class Paddock {

    private String name;
    private  DietType dietType;
    private ArrayList<Dinosaur> Paddock;

    public Paddock( String name, DietType dietType){
        this.name = name;
        this.dietType = dietType;
        this.Paddock = new ArrayList();
    }

}
