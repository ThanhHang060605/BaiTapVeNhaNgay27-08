
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Exercise_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep tang dan la: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
