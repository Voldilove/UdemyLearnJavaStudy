package lessons5hw;

public class BankAccount {
    String user = "";
    int paymentScore = 100;

    int aссountRefile(int add) {
        paymentScore += add;
        return paymentScore;
    }
    int withdrawal(int rem) {
        paymentScore -= rem;
        return paymentScore;
    }

    }


class DoIt {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        p1.user = "ivan";

        System.out.println(p1.user + ", you must pay: " + p1.withdrawal(10));
    }


    }
