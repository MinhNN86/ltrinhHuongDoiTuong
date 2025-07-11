/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author MinhNN
 */
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so gio: ");
        int gio = scanner.nextInt();
        System.out.print("Nhap so phut: ");
        int phut = scanner.nextInt();
        System.out.print("Nhap so giay: ");
        int giay = scanner.nextInt();
        
        int tongGiay = (gio * 60 * 60) + (phut * 60) + giay;
        System.out.printf("%d : %d : %d = %d giay\n", gio, phut, giay, tongGiay);
        scanner.close();
    }
}
