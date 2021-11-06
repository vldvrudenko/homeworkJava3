package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                String command;

                do {

                    System.out.println("Please, input the day of the week:");

                    String[][] planner = new String[7][2];

                    planner[0][0] = "Sunday";
                    planner[0][1] = "Go to courses; watch a film";

                    planner[1][0] = "Monday";
                    planner[1][1] = "Find amazing game";

                    planner[2][0] = "Tuesday";
                    planner[2][1] = "Do homework";

                    planner[3][0] = "Wednesday";
                    planner[3][1] = "Earn money";

                    planner[4][0] = "Thursday";
                    planner[4][1] = "Repair computer";

                    planner[5][0] = "Friday";
                    planner[5][1] = "Go a walk";

                    planner[6][0] = "Saturday";
                    planner[6][1] = "Find interesting book";

                    command  = scanner.nextLine();

                    switch (command.trim().toLowerCase(Locale.ROOT)) {
                        case "sunday" :
                            Sunday(planner);
                            break;
                        case "monday" :
                            Monday(planner);
                            break;
                        case "tuesday" :
                            Tuesday(planner);
                            break;

                        case "wednesday" :
                            Wednesday(planner);
                            break;

                        case "thursday" :
                            Thursday(planner);
                            break;

                        case "friday" :
                            Friday(planner);
                            break;
                        case "saturday" :
                            Saturday(planner);
                            break;
                        case "exit":
                            return;
                        default:
                            System.out.println("Sorry, I don't understand you, please try again.");
                            break;
                    }
                }while(true);
            }
            private static void Sunday(String[][] planner) {
                System.out.println(planner[0][1]);
            }

            private static void Monday(String[][] planner) {
                System.out.println(planner[1][1]);
            }

            private static void Tuesday(String[][] planner) {
                System.out.println(planner[2][1]);
            }

            private static void Wednesday(String[][] planner) {
                System.out.println(planner[3][1]);
            }

            private static void Thursday(String[][] planner) {
                System.out.println(planner[4][1]);
            }

            private static void Friday(String[][] planner) {
                System.out.println(planner[5][1] );
            }

            private static void Saturday(String[][] planner) {
                System.out.println(planner[6][1]);
            }
        }


