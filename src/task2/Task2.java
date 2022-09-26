/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну: ");
        int number = scanner.nextInt();
        int sum = (number/100);
        int sum1 = (number%100/10);
        int sum2 = (number%100%10);
        System.out.println(sum + sum1 + sum2);
    }
    
}
