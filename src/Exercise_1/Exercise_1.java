/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercise_1;

import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String check;
        do {
            System.out.print("Tiep tuc chuong trinh (yes/no): ");
            check = sc.next();
            int n = rand.nextInt(100) + 1;
            if (n % 2 == 0) {
                System.out.println(n + " la so chan");
            } else {
                System.out.println(n + " la so le");
            }
        } while (check.equals("yes"));
    }

}