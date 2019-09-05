package main.java;

public class Furniture extends Product {


    public Furniture(String name, double price) {
        super(name, price);
    }


    public enum Furnitures{
        CHAIR,TABLE,BED;


        @Override
        public String toString() {
            switch (this){

                case CHAIR:return "Chair";
                case TABLE:return "Table";
                case BED:return "Bed";
            }

            return "";
        }
    }
}
