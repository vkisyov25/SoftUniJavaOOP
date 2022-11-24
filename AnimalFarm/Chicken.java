package EncapsulationSoftUni.AnimalFarm;

public class Chicken {
    private  String name;
    private int age;

    public Chicken(String name,int age) {
        //this.name = name;
        //this.age = age;
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        this.name = name;
        if(name==null && name.isEmpty()){
        throw new IllegalArgumentException("Name cannot be empty.");
        }

    }

    private void setAge(int age) {
        this.age = age;
        if(age<=0 || age>15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private double productPerDay(){
        if(this.age<6){
            return 2;
        } else if (this.age>=6 && this.age<12) {
            return 1;
        } else if (this.age>=12 && this.age<=15) {
            return 0.75;
        }

        return 0;
    }

    @Override
    public String toString(){

        return String.valueOf((System.out.printf("Chicken %s (age %d) can produce %.2f eggs per day.",getName(),getAge(),productPerDay())));
    }

    private double calculateProductPerDay(){
        return 0.0;
    }
}
