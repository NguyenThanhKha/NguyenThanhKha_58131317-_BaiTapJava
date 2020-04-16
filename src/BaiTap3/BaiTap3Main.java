/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author HP
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienIT sv1= new SinhVienIT(5, 6, 7, "minh anh", "cnpm");
        SinhVienBiz sv2= new SinhVienBiz(7, 8, "minh khang", "mk1");
        SinhVienPoly sv3= new SinhVienIT(7, 4, 7,"khang ", "httt");
        sv1.xuat();
        sv2.xuat();
        sv3.xuat();
        
    }
    
}
