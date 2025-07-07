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
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten sinh vien: ");
        String hoTen = scanner.nextLine();
        
        System.out.print("Nhap MSSV");
        String MSSV = scanner.nextLine();
        
        System.out.print("Nhap lop");
        String lop = scanner.nextLine();
        
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = scanner.nextLine();
        
        long sdt;
        while(true) {
            try{
                System.out.print("Nhap so dien thoai: ");
                sdt = Long.parseLong(scanner.nextLine().trim());
                if(String.valueOf(sdt).length() >= 9 && String.valueOf(sdt).length() <= 11){
                    break;
                } else {
                    System.out.println("So dien thoai khong hop le");
                }
            } catch (NumberFormatException e){
                System.out.println("So dien thoai khong hop le");
            }
        }
        
        System.out.printf("\n/***** THANH VIEN LOP %s *****/\n", lop);
        System.out.printf("Ho ten          : %s\n", hoTen);
        System.out.printf("Ma so sinh vien : %s\n", MSSV);
        System.out.printf("Lop             : %s\n", lop);
        System.out.printf("So dien thoai   : %d      Gioi tinh: %s\n", sdt, gioiTinh);
        System.out.print("/*********************************************/\n");

        scanner.close();
        
    }
}

