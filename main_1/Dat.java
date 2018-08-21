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
public class Dat extends NhaVaDat{
    private String loaidat;

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }
    @Override
    public float thanhTien(){
        if(loaidat.equalsIgnoreCase("A")){
            return getDientich()*getDongia()*1.5f;
        }
        if(loaidat.equalsIgnoreCase("B")){
            return getDientich()*getDongia();
        }
        if(loaidat.equalsIgnoreCase("C")){
            return getDientich()*getDongia();
        }
        else{
            System.out.println("Vui lòng chọn loại đất : A , B hoặc C");
        }
        return 0;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.print("Nhập loại nhà: ");
        loaidat = sc.nextLine();
    }
}
