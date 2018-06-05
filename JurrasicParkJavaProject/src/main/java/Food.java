package Dinosaurs;

public class Food{

    private String foodname;
    protected Dinosaurs.DietType dietType;

    public Food (String foodname, Dinosaurs.DietType dietType){

        this.foodname = foodname;
        this.dietType = dietType;
    }

    public String getFoodName() {
        return this.foodname;
    }

    public Dinosaurs.DietType getFoodType() {
        return this.dietType;
    }
}



