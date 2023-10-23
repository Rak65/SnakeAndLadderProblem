package com.bridgelabz;

public class SnakeLadder {
    public static void main(String[] args) {

        // variables
        final int NoPlay = 0;
        final int Ladder = 1;
        final int Snake = 2;
        int PlayerPosition = 0; // initial position of player
        int count = 0;

        // loop till player reach the winning spot which is 100
        while (PlayerPosition < 100)
        {

            // dice number generator
            int die = (int) (Math.random() * 6) + 1;

            count++;// counting the number of times dice was played
            System.out.println("The Dice Number is :" + die);

            // option Number generator
            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("Generate Random Position :" + option);

            if (option == 1)
            {

                if (PlayerPosition <= 100 && (PlayerPosition + die <= 100))
                    PlayerPosition = PlayerPosition + die;
                System.out.println("Your status is Ladder");
                // printing position of player
                System.out.println("Your Postion is :" + PlayerPosition);
            }

            else if (option == 2)
            {

                // In case the player position moves below 0, then the player restarts from 0
                if (PlayerPosition > 0 && (PlayerPosition - die) >= 0)
                {
                    PlayerPosition = PlayerPosition - die;
                    System.out.println(" Your status is Snake");
                    System.out.println("Your Postion is :" + PlayerPosition);
                }
            }

            else
            {
                System.out.println("Your Status is No Play ");
                System.out.println("Your Position is :" + PlayerPosition);
            }
        }
        // count how many times dice will Rotate starting to end
        System.out.println("Total number of times dice is played :" + count);
    }
}
