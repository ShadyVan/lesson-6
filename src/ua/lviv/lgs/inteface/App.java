package ua.lviv.lgs.inteface;

public class App {
    public static void main(String[] args) {
        HourlyPayment Ivan = new HourlyPayment(83, 110);
        FixedPayment Olga = new FixedPayment(21, 450);

        Ivan.salary();
        Olga.salary();
    }
}
