package main.java;

public class Main {


    public static void main(String[] args) {
        UserBasket userBasket=new UserBasket();
        userBasket.initialize();
        TaxCalculator t=new TaxCalculator();
        t.calculate(UserBasket.items);
    }
}
