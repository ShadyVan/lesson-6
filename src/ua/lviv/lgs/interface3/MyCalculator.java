package ua.lviv.lgs.interface3;

import ua.lviv.lgs.interface2.Numerable;

public class MyCalculator implements Numerable {
    private double number1;
    private double number2;

    MyCalculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public void doPlus(){
        double n = number1 + number2;
        System.out.println("Sum = " + n);
    }


    public void doDivide() {
        double n = number1/number2;
        System.out.println("Div =" + n);
    }

    public void doMinus() {
        double n = number1 - number2;
        System.out.println("Minus =" + n);

    }

    public void doMultiply() {
        double n = number1*number2;
        System.out.println("Multi =" + n);

    }
}
