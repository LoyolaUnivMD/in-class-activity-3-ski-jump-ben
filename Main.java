//Programmers: Ben
//Course: CS252
//Due Date: Jan 27 2024
//Lab Assignment: In class activity 3 - ski jump
//Problem Statement: calculate the points earned based on how far you jump off ski ramp
//Data In: type of hill and speed going
//Data Out: points
//Credits: none

import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        //Given the type of ski jump (normal vs. large) and the jumper’s speed at the end of the ramp, predict how far they will jump using the simplification in the table below. Then output their number of points earned.
        Scanner scanner = new Scanner(System.in);

        String hillType = "normal";
        int height = 46;
        double pointsPerMeter = 2;
        int par = 90;

        System.out.println("Are you jumping off a normal hill (y for normal n for large)");
        if(scanner.nextLine().equalsIgnoreCase("n"))
        {
            hillType = "large";
            height = 70;
            pointsPerMeter = 1.8;
            par = 120;
        }
        //directions does not give us a speed unit
        System.out.println("What is your speed coming off the top of the ramp? ");
        double jumpersSpeed = scanner.nextDouble();

        //the time in the air is calculated as sqrt((2*height)/9.8)
        double timeInAir =  Math.sqrt((2*height)/9.8);
        double distanceTraveled = jumpersSpeed * timeInAir;

        //After determining their distance, calculate how many points they would get on the chosen hill.
        //Calculate the points earned as 60 + (distance - par)*points_per_meter.
        double pointsEarned = 60 + (distanceTraveled - par)*pointsPerMeter;

        System.out.println("You earned " + pointsEarned + " on the " + hillType + " hill!\n");
        //logic
        if(pointsEarned > 60)
        {
            System.out.println("Great job for doing better than par!");
        }
        else if(pointsEarned < 10)
        {
            System.out.println("What happened??");
        }
        else
        {
            System.out.println("Sorry you didn't go very far");
        }
    }
}
