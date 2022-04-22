package in.co.decimal.service;


import in.co.decimal.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("keyboard");
        System.out.println ("product.getName () = " + product.getName ());

        printMessage ("Hello World!");
        printMessage ("I am fine");

    }

    public static void printMessage(String message) {
        System.out.println (message);
    }
}
