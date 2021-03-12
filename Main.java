package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Please Enter Your Name???");
        User_information information = new User_information();
        Scanner input = new Scanner(System.in);

        String user_name = input.next();
        System.out.println("Thank You Sir => " + user_name + "\n Please Enter Your Pin Number ???");

        int input_pin = input.nextInt();
        if (input_pin == information.getPin()) {
            System.out.println("Hello " + user_name + " Sir.");
            System.out.println("Select Which Service You Need??? \n  1. See Balance   2. Cash Out  3.Change Pin (Select Only Number)");
            int user_option_select_number = input.nextInt();
            String user_selected_option;
            switch (user_option_select_number) {

                case 1:
                    user_selected_option = "You Clicked on (See Balance)";
                    int user_balance = information.getAmount();
                    System.out.println("You Running Balance is =>" + user_balance + " USD");
                    break;

                case 2:
                    user_selected_option = "You Clicked on (Cash Out)";
                    System.out.println("Please Enter Your Amount?");
                    int amount_input = input.nextInt();
                    int user_amount = information.getAmount();
                    int user_current_amount = user_amount - amount_input;
                    System.out.println("Cash Out Completed  : " + amount_input + " $");
                    System.out.println("Now Your Balance Available :" + user_current_amount + " $");

                    break;

                case 3:
                    user_selected_option = "You Clicked on (Change Pin)";
                    System.out.println("Please Enter Your Old Pin??? ");
                    int user_runing_pin = input.nextInt();
                    int user_pin = information.getPin();
                    if (user_runing_pin == user_pin) {
                        // true
                        System.out.println("Enter Your New Pin  ??");
                        int user_new_pin = input.nextInt();
                        information.setPin(user_new_pin);
                        System.out.println("This is Your New Pin" + information.getPin());

                    } else {
                        //false
                        System.out.println(" You Loser Please Enter Correct pin Number ? ");
                    }

                    break;
                default:
                    user_selected_option = "Please Select Right Option";
            }
            System.out.println("Thanks :" + user_selected_option);
            System.out.println("Thanks To Use us. See You Soon BYE");


        }//1st if condition finish here.
        else {

            System.out.println("Fuck You Loser this is not your Account Pin Number *_* ");

        }


    }
}
