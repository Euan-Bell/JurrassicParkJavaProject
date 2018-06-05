package Dinosaurs;

import java.util.ArrayList;



public abstract class Dinosaur {

    private String name;
    private String species;
    private double weight;
    private ArrayList<Food> stomach;
    private int attackPower;

    public Dinosaur(String name, String species, Double weight, int attackPower){

        this.name = name;
        this.species = species;
        this.weight = weight;
        this.stomach = new ArrayList();
        this.attackPower = attackPower;
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


    public int canBeFed() {
        return this.getStomach().size();
    }

    public void feedDinosaur(Food food) {
        this.stomach.add(food);
    }
}
