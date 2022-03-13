package ua.lviv.lgs.inteface;

public class FixedPayment implements Salary {
    private int days;
    private int payForDay;

    FixedPayment (int days, int payForDay){
        this.days = days;
        this.payForDay = payForDay;
    }

    public void salary() {
        System.out.println("Місячна зарплата працівника = " + days*payForDay);

    }
}
