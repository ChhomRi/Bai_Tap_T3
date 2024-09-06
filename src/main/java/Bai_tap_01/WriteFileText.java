/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai_tap_01;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class WriteFileText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Thong tin san pham thu nhat"+ (i + 1));
            System.out.print("Nhap ma so san pham:");
            String maso = sc.nextLine();
            System.out.print("Nhap ma ten san pham:");
            String ten = sc.nextLine();
            System.out.print("Nhap gia san pham:");
            float gia = Float.parseFloat(sc.nextLine());
            ds.add(new SanPham(maso,ten, gia));
        }
        try{
            FileWriter fw = new FileWriter("sanpham.txt");

            
            for (SanPham x : ds){
                fw.write(x.getMaso()+ ";" + x.getTen() + ";" + x.getGia() + "\n");
                
            }
            fw.close();
            System.out.println("DA GHI XONG DANH SACH SAN PHAM VAO FILE sanpham.txt");
            
        } catch (Exception ex) {
            System.out.println("Loi xay ra ra: " + ex.toString());
            System.out.println("Ghi File that bai");
        } 
        
    }
    
}
