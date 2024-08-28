
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Exercise_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu mang thu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Gia tri lon nhat cua mang la: " + max);
        System.out.println("Gia tri nho nhat cua mang la: " + min);
    }
}
