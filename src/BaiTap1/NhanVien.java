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
public class NhanVien {
    String Ten,Tuoi,diaChi;
    double Luong;
    int tongGio;
    
   public NhanVien(){
   }

    public NhanVien(String Ten, String Tuoi, String diaChi, double Luong, int tongGio) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.diaChi = diaChi;
        this.Luong = Luong;
        this.tongGio = tongGio;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public int getTongGio() {
        return tongGio;
    }

    public void setTongGio(int tongGio) {
        this.tongGio = tongGio;
    }
   public  String getThongTin()
   {
       return "Ten:"+ Ten+"\t-" +
               "Tuoi:" + Tuoi + "\t-" +
                "Dia Chi:"+ diaChi + "\t-" +
                 "Luong:"+Luong+"\t-" +
                   "Tong so gio lam:"+tongGio+"\t-"+
                     "Thuong:"+tinhThuong()+"\t.";
    }
   public double tinhThuong()
   {
       int thuong;
        if(tongGio < 100){
            thuong = 0;
        }
        else 
            if( tongGio >=100 &&  tongGio < 200 ){
            thuong = (int) (Luong * 0.1);
           
        }
        else
                thuong = (int) (0.2 * Luong);
          return thuong;
   }
}
