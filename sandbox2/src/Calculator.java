public class Car {

    private double first_value;
    private double second_value;
    private double addition;
    private double subtraction;
    private double multiplication;
    private double division;


    public void setFirst_value(double first_value){
        this.first_value = first_value;
    }

    public void setSecond_value(double second_value){
        this.second_value = second_value;
    }

    public void setAddition(double first_value, double second_value){
        this.addition = first_value + second_value;
    }

    public void setSubtraction(double first_value, double second_value){
        this.subtraction = first_value - second_value;
    }

    public void setMultiplication(double first_value, double second_value){
        this.subtraction = first_value * second_value;
    }

    public void setDivision(double first_value, double second_value){
        if (second_value == 0){
            this.subtraction = 0;
        }
        else{
            this.subtraction = first_value * second_value;
        }

    }


    public double getFirst_value(){
        return this.first_value;
    }

    public double getSecond_value(){
        return this.second_value;
    }



}