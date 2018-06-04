package Dinosaurs;

import java.util.ArrayList;



public abstract class Dinosaur {

    private String name;
    private String species;
    private double weight;
    private ArrayList<Food> stomach;

    public Dinosaur(String name, String species, Double weight){

        this.name = name;
        this.species = species;
        this.weight = weight;
        this.stomach = new ArrayList();
    }


    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<Food> getStomach() {
        return this.stomach;
    }
}
