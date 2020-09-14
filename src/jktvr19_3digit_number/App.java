/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19_3digit_number;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.print("Введите трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        number = scanner.nextInt();
        
        int units = number % 10;                // единицы
        int dozens = (number % 100 - units)/10; // десятки
        int hundreds = number / 100;            // сотни
        
        System.out.print("Units: ");
        System.out.println(units);
        System.out.print("Dozens: ");
        System.out.println(dozens);
        System.out.print("Hundreds: ");
        System.out.println(hundreds);
        
        System.out.print("Sum of Hundreds + Dozens + Units = ");
        System.out.println(hundreds+dozens+units);
        
    }    
}
