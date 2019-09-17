package main.java;

public class Food extends Product {


    public Food(String name, double price) {
        super(name, price);
    }


    public enum Foods {
        RICE("Rice"), SUGAR("Sugar"), BISCUITS("Bisciut"), WHEAT("Wheat"), JUICE("Juice"), DAAL("Daal");

        private String label;

        Foods(String foods) {
            this.label = foods;
        }

        public String getname() {

            return label;
        }





    }
}



