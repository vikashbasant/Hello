package in.co.decimal.service;

import java.util.Random;

public class RandomNumberGenrator {
    public static void main(String[] agrs){
        Random random = new Random ();
        long i = random.nextLong();
        System.out.println (i);

    }
}
