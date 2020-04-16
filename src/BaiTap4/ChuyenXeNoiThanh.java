/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author HP
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
        
    int km,soTuyen;

    public ChuyenXeNoiThanh(int km, int soTuyen, String maSoChuyen, String tenTaiXe, String soXe, int doanhThu) {
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        this.km = km;
        this.soTuyen = soTuyen;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    
}
