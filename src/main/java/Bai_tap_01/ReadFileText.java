/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai_tap_01;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class ReadFileText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        try{
              FileReader fr= new FileReader("sanpham.txt");
            BufferedReader br =new BufferedReader(fr);
            String line;
             while ((line = br.readLine()) != null){
                 String[] arr = line.split(";");
                 SanPham p=new SanPham(arr[0], arr[1], Float.parseFloat(arr[2]));
                 ds.add(p);
             }
        } catch(Exception ex){
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Ghi file that bai");
        }
        for (SanPham x:ds){
            System.out.println("x");
        }
        
    }
    
}