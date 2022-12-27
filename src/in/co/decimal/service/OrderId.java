package in.co.decimal.service;

import java.util.Date;

public class OrderId {
    public static void main(String[] args) {
        long time = new Date ().getTime ();
        int floor = (int) Math.floor (Math.random () * (-1000 + 1) + 1000);
        String str = time +""+floor;
        System.out.println (time +" === "+ floor);
        System.out.println (str);
    }
}
