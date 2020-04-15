/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author HP
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv= new NhanVien("An", "21","nha trang",2000,200);
        NhanVien nv1= new NhanVien("Son", "20", "nha trang", 3000, 10);
        System.out.println(nv.getThongTin());
        System.err.println("\n");
        System.out.println(nv1.getThongTin());
        
        
    }
    
}
