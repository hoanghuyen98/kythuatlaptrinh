/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NhaVaDat {
    private String diachi;
    private String ngaygiaodich;
    private float dientich;
    private float dongia;
    Scanner sc = new Scanner(System.in);
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(String ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    
    public float thanhTien(){
        return dongia*dientich;
    }
    
    public void nhapThongTin(){
        System.out.print("Nhập địa chỉ: ");
        diachi = sc.nextLine();
        System.out.print("Nhập ngày giao dịch: ");
        ngaygiaodich = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        dongia = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập diện tích: ");
        dientich = Float.parseFloat(sc.nextLine());
    }
    
}
