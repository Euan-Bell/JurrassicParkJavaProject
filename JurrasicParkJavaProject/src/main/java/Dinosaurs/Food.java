package Dinosaurs;

public class Food{

    private String foodname;
    protected DietType dietType;

    public Food (String foodname, DietType dietType){

        this.foodname = foodname;
        this.dietType = dietType;
    }

    public String getFoodName() {
        return this.foodname;
    }

    public DietType getFoodType() {
        return this.dietType;
    }
}



