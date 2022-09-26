/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task4tatjanasubbotina;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV21Task4TatjanaSubbotina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random random = new Random();
        float sum = 0;
        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(50)*2 + 1;
        }
        System.out.println("Array: ");
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
            if ((i+1)%10 == 0) System.out.println();
        }
        Arrays.sort(mas);
        for (int i = 1; i < mas.length - 1; i++){
            sum += mas[i];
        }
        System.out.print("Cреднее арифметическое элементов массива = ");
        System.out.printf("%.2f%n", (float) sum/(mas.length - 2));

    }
    
}
