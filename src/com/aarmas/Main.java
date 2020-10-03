package com.aarmas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Burger burger = new Burger("Basic", "White", "Sausage", 3.56);
        double price = burger.totalPrice();
        burger.addAddition1("Tomato", 0.27);
        burger.addAddition2("Lettuce", 0.75);
        burger.addAddition3("Cheese", 1.13);
        System.out.println("Total burger price is " + burger.totalPrice());

        Healthy healthy = new Healthy("Bacon", 5.67);
        healthy.addExtra1("Egg", 5.43);
        healthy.addExtra2("Lentils", 3.41);
        System.out.println("Total burger price is " + healthy.totalPrice());
    }
}
