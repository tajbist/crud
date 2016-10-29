package com.dev;

/**
 * Created by Oops on 7/24/2016.
 */
public class Add {
    int AddTwo(int x, int y) {
        // Iterate till there is no carry
        while (y != 0) {
            // carry now contains common set bits of x and y
            int carry = x & y;
          //  System.out.println("CarrY " +carry);
            // Sum of bits of x and y where at least one of the bits is not set
            x = x ^ y;
            //System.out.println("DD " +x);
            // Carry is shifted by one so that adding it to x gives the required sum
            y = carry << 1;
            //System.out.println("YY " +y);
        }
        return x;
    }

    public static void main(String arg[]) {
        System.out.println(new Add().AddTwo(10, 10));

        int x = 10;
        int result = x >> 1;

        System.out.println("Before left shift: " + x);
        System.out.println("After left shift: " + result);
    }
}
