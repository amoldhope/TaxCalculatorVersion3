package com.innovect.application;

public class Food extends Product{


    public Food(String name, double price) {
        super(name, price);
    }


    public enum Foods{
        RICE,SUGAR,BISCUITS,WHEAT,JUICE,DAAL;


        @Override
        public String toString() {
            switch (this){
                case SUGAR:return "Sugar";
                case RICE:return "Rice";
                case BISCUITS:return "Bisciut";
                case WHEAT:return "Wheat";
                case JUICE:return "Juice";
                case DAAL:return "Daal";


            }


            return super.toString();
        }
    }
}


