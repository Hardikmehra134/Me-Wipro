package assignment;
import java.util.Scanner;

class Worker {
    String name;
    double rate;
    Worker(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
    public double pay(int hours) { return 0; }
}
class DailyWorker extends Worker {
    DailyWorker(String name, double rate) {
        super(name, rate);
    }
    public double pay(int days) {
        return rate * days;
    }
}
class SalariedWorker extends Worker {
    SalariedWorker(String name, double rate) {
        super(name, rate);
    }
    public double pay(int hours) {
        return 40 * rate;
    }
}
class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Daily Worker name: ");
        String dName = sc.next();
        System.out.print("Rate: ");
        double dRate = sc.nextDouble();
        System.out.print("Days worked: ");
        int dDays = sc.nextInt();
        DailyWorker d = new DailyWorker(dName, dRate);
        System.out.println("Daily Worker pay: " + d.pay(dDays));

        System.out.print("Salaried Worker name: ");
        String sName = sc.next();
        System.out.print("Rate: ");
        double sRate = sc.nextDouble();
        SalariedWorker s = new SalariedWorker(sName, sRate);
        System.out.println("Salaried Worker pay: " + s.pay(0));
    } 
}
/*
 * Daily Worker name: Hardik
Rate: 1400
Days worked: 15
Daily Worker pay: 21000.0
Salaried Worker name: Abhay
Rate: 850
Salaried Worker pay: 34000.0
*/
