package Paddocks;

import Dinosaurs.DietType;
import Dinosaurs.Dinosaur;
import Dinosaurs.Trex;

import java.util.ArrayList;

public abstract class Paddock {

    private String name;
    private DietType dietType;
    private ArrayList<Dinosaur> paddock;
    public int fenceDurability;

    public Paddock(String name, DietType dietType, int fenceDurability) {
        this.name = name;
        this.dietType = dietType;
        this.paddock = new ArrayList();
        this.fenceDurability = fenceDurability;

    }

    public String getName() {
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

    public void addDinosaur(Dinosaur dinosaur) {
        if (this.getDietType() == dinosaur.getDietType()) {
            this.paddock.add(dinosaur);
        }
    }

    public int removeDinosaur(Dinosaur dinosaur) {
        paddock.remove(dinosaur);
        return paddock.size();
    }

    public void setFenceDurability(int newFenceDurabilty) {
        this.fenceDurability = newFenceDurabilty;

    }

    public boolean fenceBroken() {
        if (this.fenceDurability <= 0) {
            return true;
        }
        return false;
    }
}
