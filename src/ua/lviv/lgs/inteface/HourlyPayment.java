package ua.lviv.lgs.inteface;

public class HourlyPayment implements Salary {
    private int hour;
    private int payForHour;

    HourlyPayment(int hour, int payForHour){
        this.hour = hour;
        this.payForHour = payForHour;
    }

    public void salary() {
        System.out.println("Зарплата працівника = " + hour*payForHour);
    }
}
