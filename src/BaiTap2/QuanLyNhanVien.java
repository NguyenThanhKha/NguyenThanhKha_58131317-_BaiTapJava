/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> list= new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        list.add( nv);
        
    }

    @Override
    public void inDS() {
        for (int i = 0; i < list.size(); i ++)
       {
           System.out.println( list.get(i).getThongTin());
           System.out.println("\n");
       }
    }
   
       
      
    
}
