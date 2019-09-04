package com.innovect.application;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    UserBasket userBasket=new UserBasket();
    public  static List<Product> items=new ArrayList<>();
    TaxCalculator t=new TaxCalculator();
    @Test
    public void calculate(){
//        userBasket.initialize();
//    assertEquals(12145,t.calculate(UserBasket.items));

    assertEquals(0.0,t.calculate(UserBasket.items));
    }
}