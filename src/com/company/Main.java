package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] banknotes = {1, 3, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000};
        int[] quantities = {10, 5, 5, 3, 2, 1,2, 3, 3, 2, 0, 2};
        int totalAvailable = 0;

        System.out.println("Введите нужную сумму:");
        int withdraw = scan.nextInt();

        for (int i = banknotes.length - 1; i > 0; i--){
            totalAvailable += banknotes[i] * quantities[i];
        }



        if (withdraw > 0 && totalAvailable - withdraw >= 0){
            System.out.println("Вы получили ");
            for (int i = banknotes.length - 1; i > 0; i--){
                int result = 0;
                int amount = 0;



                while (withdraw - banknotes[i] >= 0 && quantities[i] > 0) {
                    withdraw-= banknotes[i];
                    quantities[i] -= 1;
                    amount += 1;
                    result = banknotes[i];
                }

                if (amount > 0) {
                    System.out.print(result + "x" + amount + " ");
                }


            }
        }
    }
}
