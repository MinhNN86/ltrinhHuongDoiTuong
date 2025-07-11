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
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        while(true){
            System.out.print("Nhap vao so nguyen co 3 chu so: ");
            number = scanner.nextInt();
            if(number < 100 || number > 999){
                System.out.print("So nguyen khong hop le\n");
            } else {
                break;
            }
        }
        
        int hangTram = number / 100;
        int hangChuc = (number / 10) % 10;
        int hangDonVi = number % 10;
        
        System.out.printf("So hang tram: %d\n", hangTram);
        System.out.printf("Hang chuc: %d\n", hangChuc);
        System.out.printf("Hang don vi: %d\n", hangDonVi);
        scanner.close();
    }
}
