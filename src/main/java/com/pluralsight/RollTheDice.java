package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
//  Create instance
        Dice dice = new Dice();
//  Declare variables
        int roll1, roll2, twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;
//  For Loop (Roll 20x)
        for (int i = 0; i < 20; i++) {
            roll1 = dice.roll(); // Dice 1
            roll2 = dice.roll(); // Dice 2
//  Display outputs from each dice roll and sum
            System.out.println("Roll 1: " + roll1 + " - Roll 2: " + roll2 + " Sum: " + (roll1 + roll2));
//  Sum equation input
            int sum = roll1 + roll2;
//  If/else-if Statements (Four counters)
            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }
//  Display the Four Counter
        System.out.println("Number of times 2 occurs: " + twoCounter);
        System.out.println("Number of times 4 occurs: " + fourCounter);
        System.out.println("Number of times 6 occurs: " + sixCounter);
        System.out.println("Number of times 7 occurs: " + sevenCounter);
    }
}
