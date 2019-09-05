package com.innovect.application;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.*;

public class TaxCalculator<Public> {

    int gst;
    int rate;
    int totalAmount;
    int totalFoodAmount;
    int totalFurnitureAmout;
    int totalElectronixAmount;
    boolean productDuplicate = false;
    Map<String, Integer> products = new HashMap<>();

    double calculate(List<Product> list) {
        ListIterator<Product> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Product object =  iterator.next();
            productDuplicate = false;


            if (products.containsKey(object.name)) {

                products.put(object.name,products.get(object.name)+1);

                productDuplicate = true;
            }


            if (object instanceof Food) {
                TaxSlab taxSlab = TaxSlab.FOOD;
                int gst = taxSlab.getGstSlabs();
                totalFoodAmount += object.getPrice();

            } else if (object instanceof Furniture) {
                TaxSlab taxSlab = TaxSlab.FURNITURE;
                int gst = taxSlab.getGstSlabs();
                totalFurnitureAmout +=  object.getPrice();

            } else if (object instanceof Electronics) {
                TaxSlab taxSlab = TaxSlab.ELECTRONIX;
                int gst = taxSlab.getGstSlabs();
                totalElectronixAmount += object.getPrice();

            }
            if (!productDuplicate) {
                products.put("" + object.name, 1);
            }


        }

        System.out.println("Products       Quantity");
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(" "+key);
            System.out.printf("      %2d\n",value);
        }
        System.out.println("-----------------------------------------------------");

        this.applyDiscount();
        this.applyGst();
        System.out.println("-----------------------------------------------------");

        System.out.println("Food Bill [GST="+TaxSlab.FOOD.getGstSlabs()+"%]= "+totalFoodAmount+" Rs.");
        System.out.println("Furniture Bill [GST="+TaxSlab.FURNITURE.getGstSlabs()+"%]= "+totalFurnitureAmout+" Rs.");
        System.out.println("Electronix Bill [GST="+TaxSlab.ELECTRONIX.getGstSlabs()+"%]= "+totalElectronixAmount+" Rs.");


        totalAmount=totalFoodAmount+totalElectronixAmount+totalFurnitureAmout;
        System.out.println("-----------------------------------------------------");
        System.out.println(" Total amount to be paid= "+totalAmount+" Rs.");
        return totalElectronixAmount+totalFurnitureAmout+totalFoodAmount;

    }

   public  void applyDiscount(){
        double discountRate=0.10;
       System.out.println("\nDiscount of 10% apply on indivisual category which exceeds 1000 Rs\n");
       if(totalFoodAmount>1000){
           totalFoodAmount-=totalFoodAmount*discountRate;
       }

       if(totalFurnitureAmout>1000){
           totalFurnitureAmout-=totalFurnitureAmout*discountRate;
       }
       if(totalElectronixAmount>1000){
           totalElectronixAmount-=totalElectronixAmount*discountRate;
       }
   }

   void applyGst(){
        totalFoodAmount += totalFoodAmount*TaxSlab.FOOD.getGstSlabs()/100;
        totalFurnitureAmout+=totalFurnitureAmout*TaxSlab.FURNITURE.getGstSlabs()/100;
        totalElectronixAmount+=totalFurnitureAmout*TaxSlab.ELECTRONIX.getGstSlabs()/100;
   }
}
