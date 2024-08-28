
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Exercise_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu mang thu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);

        double average = (double) sum / n;
        System.out.println("Trung binh cac phan tu trong mang la: " + average);

    }

}
