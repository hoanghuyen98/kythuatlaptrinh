/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_1;

/**
 *
 * @author Dell
 */
public class Nha extends NhaVaDat{
    private String loainha;

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }
    
   
    @Override
    public float thanhTien(){
        if(loainha.equalsIgnoreCase("Biet thu")){
            return getDientich() * getDongia() ;
        }
        if(loainha.equalsIgnoreCase("Chung cu")){
            return getDientich() * getDongia() * 0.9f;
        }
        else{
            System.out.println("Chúng tôi chỉ còn loại nhà Chung cư và Biệt thự");
        }
        return 0;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhập loại nhà");
        loainha = sc.nextLine();
    }
}
