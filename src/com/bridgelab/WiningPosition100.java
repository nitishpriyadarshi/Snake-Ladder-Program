package com.bridgelab;

public class WiningPosition100 {
    public static void main(String[] args) {
        System.out.println("Player Winning Position is: ");


        // Initialize Variable

        int position = 0;

        while (position < 100) {

            // to roll a dice
            int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("diceNumber is : " + diceNumber);

            // check option after getting a diceNumber
            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("selected player option : " + option);

            switch (option) {
                case 1:
                    position = diceNumber + position;
                    System.out.println("Ladder");
                    System.out.println("position for the player after the ladder is : " + position);
                    break;

                case 2:
                    position = position - diceNumber;
                    System.out.println("Snack");
                    if (position < 0) {
                        position = 0;
                        System.out.println("Player restart from zero: ");
                    }
                    System.out.println("position for the player after the Snake is : " + position);
                    break;

                default:
                    System.out.println("No play");
            }
        }
    }
}

