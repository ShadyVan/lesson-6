package ua.lviv.lgs.interface3;

public class Main {
    public static void main(String[] args) {
        MyCalculator c = new MyCalculator(23, 13);

        c.doDivide();
        c.doMinus();
        c.doMultiply();
        c.doPlus();
    }
}
