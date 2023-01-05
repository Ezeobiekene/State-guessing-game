/**

 * Create a list of states and their capitals.
 * Write a loop to play the game or exit
 * Game will loop through a set number of times (You choose how times to ask)
 * Computer will pick a new random state each time through the loop and ask user for capital
 * Note: If user has typos in capital name, and it does not match what you have in your list, it will mark it incorrect.  So, it has to be exact match.
 * You will keep count of how many the user gets correct and then display after the loop completes to show the user their results.
 * Then, ask user to play again or exit (use a sentinel value)
 **/

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;


public class StateGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();


        int correctCount = 0;
        String[][] array = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };

        System.out.println("Welcome to the State and Capital Game!!!");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Press 1 for new game");
        System.out.println("Press 2 to quit");
        int menu = scanner.nextInt();

        game(menu, array, correctCount, rand);
    }


    public static void game(int menu, String[][] array, int correctCount, Random rand) {
        Scanner scanner = new Scanner(System.in);


        switch (menu) {
            case 2 ->
                System.out.println("Existing....");


            case 1 -> {
                for (int i = 0; i < 5; i++) {
                    int num;
                    System.out.println("What is the capital city of " + array[num = (rand.nextInt(50) + 1)][0] + "?");

                    if (Objects.equals(scanner.next(), array[num][1])) {
                        System.out.println("Your answer is correct!!");
                        System.out.println(" ");
                        correctCount++;
                    } else {
                        System.out.println("The correct answer is " + array[num][1]);
                        System.out.println(" ");
                    }
                }
                System.out.println("You got " + correctCount + " out of 5 right");
                playOrQuit(menu, array, rand);
            }
        }
    }


                public static void playOrQuit (int menu, String[][] array, Random rand) {
                    Scanner scanner = new Scanner(System.in);

                    System.out.println(" ");
                    System.out.println("Press 1 for new game");
                    System.out.println("Press 2 to quit");
                    int number = scanner.nextInt();


                    while (number < 3) {
                        if (number != 2) {
                            int correctCount = 0;
                            game(menu,array, correctCount, rand);
                        }else {
                            System.out.println("Existing....");
                            number = number + 2;
                        }

                    }
                    System.out.println(" ");
                }
            }