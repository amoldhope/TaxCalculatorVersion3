package main.java;

public class Electronics extends Product {


    public Electronics(String name, double price) {
        super(name, price);
    }


    public enum ElectrnicsAppliences{



        TELEVISION,FREEZE,MOBILE,HEADPHONES,CHARGER;


        @Override
        public String toString() {

            switch(this){
                case FREEZE:return "Freeze";
                case MOBILE:return "Mobile";
                case CHARGER:return "Charger";
                case HEADPHONES:return "Headphones";
                case TELEVISION:return "Television";

            }

            return "";
        }
    }
}
