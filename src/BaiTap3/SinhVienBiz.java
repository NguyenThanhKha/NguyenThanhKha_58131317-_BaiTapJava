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
public class SinhVienBiz extends SinhVienPoly{
    double diemMaketing,diemSlales;

    public SinhVienBiz(double diemMaketing, double diemSlales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMaketing = diemMaketing;
        this.diemSlales = diemSlales;
    }
    public double getDiemMaketing() {
        return diemMaketing;
    }

    public void setDiemMaketing(double diemMaketing) {
        this.diemMaketing = diemMaketing;
    }

    public double getDiemSlales() {
        return diemSlales;
    }

    public void setDiemSlales(double diemSlales) {
        this.diemSlales = diemSlales;
    }
    
    
    @Override
    public double getDiem() {
        return  (diemMaketing*2 + diemSlales)/3;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates. 
        System.out.println("ho ten:"+getHoTen()+ ",diem:"+getDiem()+ ",hoc luc:"+getHocLuc());
    }
    
    
}
