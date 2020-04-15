/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author HP
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyNhanVien ql= new QuanLyNhanVien();
        ql.them(new NhanVien("An", "23", "Phu Yen", 300, 30));
        ql.them(new NhanVien("Khang", "22", "Nha Trang", 300, 250));
        ql.them(new NhanVien("Minh", "22", "Quang Nam", 400, 100));
        ql.them(new NhanVien("Huy", "22", "Phu Yen", 600, 150));
        ql.them(new NhanVien("Anh", "22", "Nha Trang", 300, 500));
        System.out.println("\n");
        ql.inDS();
    }
    
}
