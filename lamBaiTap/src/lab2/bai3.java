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

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        while (true){
            System.out.print("Nhap so nguyen duong 2 chu so: ");
            number = scanner.nextInt();
            if(number < 10 || number > 99){
                System.out.print("So nguyen khong hop le\n");
            } else {
                break;
            }
        }
        int hangChuc = number / 10;
        int hangDonVi = number % 10;
        int tong = hangChuc + hangDonVi;
        
        System.out.printf("%d + %d = %d\n", hangChuc, hangDonVi, tong);
    }
}
