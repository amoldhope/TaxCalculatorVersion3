package main.java;

import java.util.ArrayList;
import java.util.List;

public class UserBasket {
   public  static List<Product> items=new ArrayList<>();

   public void initialize()
    {

       items.add(new Food(Food.Foods.SUGAR.toString(),45.0));
       items.add(new Food(Food.Foods.SUGAR.toString(),45.0));
       items.add(new Food(Food.Foods.BISCUITS.toString(),100.0));
       items.add(new Food(Food.Foods.BISCUITS.toString(),100.0));

       items.add(new Furniture(Furniture.Furnitures.CHAIR.toString(),1000.0));
       items.add(new Furniture(Furniture.Furnitures.TABLE.toString(),5000.0));
       items.add(new Electronics(Electronics.ElectrnicsAppliences.TELEVISION.toString(),10000.0));


    }



}


