/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author nguyennhatminh
 */
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so giay de chuyen: ");
        int tongGiay = scanner.nextInt();
        
        int gio = tongGiay / 3600;
        int phut = (tongGiay % 3600) / 60;
        int giay = tongGiay % 60;
        
        System.out.printf("%d giay = %02d:%02d:%02d\n", tongGiay, gio, phut, giay);
        scanner.close();
    }
}
