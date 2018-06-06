package Dinosaurs;

import Paddocks.CarnivorePaddock;
import Paddocks.Paddock;

import java.util.ArrayList;



public abstract class Dinosaur {

    private String name;
    private String species;
    private double weight;
    private ArrayList<Dinosaurs.Food> stomach;
    public int attackPower;
    private Dinosaurs.DietType dietType;

    public Dinosaur(String name, String species, Double weight, int attackPower, Dinosaurs.DietType DietType){

        this.name = name;
        this.species = species;
        this.weight = weight;
        this.stomach = new ArrayList();
        this.attackPower = attackPower;
        this.dietType = DietType;
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

    public ArrayList<Dinosaurs.Food> getStomach() {
        return this.stomach;
    }


    public int canBeFed() {
        return this.getStomach().size();
    }

    public void feedDinosaur(Dinosaurs.Food food) {
        if (this.getDietType() == food.getFoodType()){
            this.stomach.add(food);
        }
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public Dinosaurs.DietType getDietType() {
        return dietType;
    }

    public void attackFence(Paddock paddock) {
        paddock.setFenceDurability(paddock.getFenceDurability() - this.getAttackPower());

    }


//    public void canRampage(Paddock paddock) {
//        while (paddock.getFenceDurability() >= 0 - this.getAttackPower()){
//            paddock.removeDinosaur(this);
//        }
//    }

//    public void canRampage(Paddock paddock){
//        paddock.setFenceDurability(paddock.getFenceDurability() - this.getAttackPower())
//     if (paddock.getFenceDurability() <= 0)
//            paddock.removeDinosaur(this);
//        }
//    }
}
