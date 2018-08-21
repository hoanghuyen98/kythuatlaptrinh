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
public class Main_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhaVaDat nhaVaDat = null;
        int choose=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1: Nhập và tính tiền đơn mua nhà");
            System.out.println("2: Nhập và tính tiền đơn mua đất");
            System.out.println("3: Kết thuc");
            System.out.print("==>> Mời bạn chọn : ");
            choose = Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1:{
                    nhaVaDat = new Nha();
                    break;
                }
                case 2:{
                    nhaVaDat =  new Dat();
                    break;
                }
                case 3:{
                    System.out.println("Tạm biệt");
                    break;
                }
                default:
                        choose = 4;
            }
            if (choose != 4){
                nhaVaDat.nhapThongTin();
                System.out.println("Thành Tiền: "+ nhaVaDat.thanhTien());
            }else {
                System.out.println("Bạn hãy chọn lại chức năng");
            }
        }while(choose!=3);
       
    }
    
}
