public class Calcer {
    double weight;
    double height;
    double age;
    public void setData(double weight,double height,double age){
        this.weight = weight;
        this.height = height;
        this.age = age;
    }
    public void getData(){
        weight = Input.input("Testtömeg");
        height = Input.input("Magasság");
        age = Input.input("Életkor");
    }
    public double calcWomanBMR(){
        if(!valuesIsOk()){
            return -1;
        }
        double calorie = 9.247 * weight + 3.098 * height - 4.330 * age + 447.593;
        return calorie;
    }
    public double calcManBMR(){
        if(!valuesIsOk()){
            return -1;
        }
        double calorie = 13.397 * weight + 4.799 * height - 5.667 * age + 88.362;
        return calorie;
    }
    public boolean valuesIsOk(){
        if(this.weight <= 0 || this.height <= 0 || this.age <= 0){
            return false;
        }else{
            return true;
        }
    }
}
