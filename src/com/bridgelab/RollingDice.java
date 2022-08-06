package com.bridgelab;

public class RollingDice {
    public static void main(String[] args) {
    // generating random number from 1 to 6
    int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
    System.out.println("Dice Number is : " + diceNumber);
}
}

