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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    
    int soNgayDi;
    String noiDen;

    public ChuyenXeNgoaiThanh(int soNgayDi, String noiDen, String maSoChuyen, String tenTaiXe, String soXe, int doanhThu) {
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        this.soNgayDi = soNgayDi;
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    
}
