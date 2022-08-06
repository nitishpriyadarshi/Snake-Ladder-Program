package com.bridgelab;

public class TimeAndPositionofdice {

public static void main(String[] args) {
    int count = 0; // number of times die was rolled
    int count1s = 0; // number of times 1 was rolled
    int count2s = 0; // number of times 2 was rolled
    int count3s = 0;
    int count4s = 0;
    int count5s = 0;
    int count6s = 0;

    while (count < 100) {
        count1s = (int) (Math.random( )*6 + 1);
        count2s = (int) (Math.random( )*6 + 1);
        count3s = (int) (Math.random( )*6 + 1);
        count4s = (int) (Math.random( )*6 + 1);
        count5s = (int) (Math.random( )*6 + 1);
        count6s = (int) (Math.random( )*6 + 1);

        count++;

    }
    System.out.println("Number of times the Dice was rolled: "+ count);
    System.out.println("Number of times 1 was rolled: " + count1s);
    System.out.println("Number of times 2 was rolled: " + count2s);
    System.out.println("Number of times 3 was rolled: " + count3s);
    System.out.println("Number of times 4 was rolled: " + count4s);
    System.out.println("Number of times 5 was rolled: " + count5s);
    System.out.println("Number of times 6 was rolled: " + count6s);
}
}

