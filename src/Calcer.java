/*
* File: Calcer.java
* Author: Szivák Gergő
* Copyright: 2021, Szivák Gergő
* Group: Szoft II N
* Date: 2021-11-29.
* Github: https://github.com/Gergosz-2000/kalori
* Licenc: GNU GPL
*/

public class Calcer {
    double weight;
    double height;
    double age;
    public void setData(double weight,double height,double age){
        this.weight = weight;
        this.height = height;
        this.age = age;
        if(weight<1){
            throw new IllegalArgumentException("nem lehet 1-nél kissebb a testtömeg");
        }
        if(height<1){
            throw new IllegalArgumentException("nem lehet 1-nél kissebb a magasság");
        }
        if(age<1){
            throw new IllegalArgumentException("nem lehet 1-nél kissebb a kor");
        }
    }
    public void getData(){
        weight = Input.input("Testtömeg");
        height = Input.input("Magasság");
        age = Input.input("Életkor");
        if(weight<1){
            throw new IllegalArgumentException("nem lehet 1-nél kissebb a testtömeg");
        }
        if(height<1){
            throw new IllegalArgumentException("nem lehet 1-nél kissebb a magasság");
        }
        if(age<1){
            throw new IllegalArgumentException("nem lehet 1-nél kissebb a kor");
        }
    }
    public double calcWomanBMR(){
        double calorie = 9.247 * weight + 3.098 * height - 4.330 * age + 447.593;
        return calorie;
    }
    public double calcManBMR(){
        double calorie = 13.397 * weight + 4.799 * height - 5.667 * age + 88.362;
        return calorie;
    }
}
