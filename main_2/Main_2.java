/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main_2 {
    
    public int tinhDeQuy(int n){
        if(n<2){
            return n ;
        }
        else{
            return tinhDeQuy(n-1) + tinhDeQuy(n-2);
        }
    }
    
    public void fibonaciDeQuy(int vitri){
        if(vitri <= 0){
            return ;
        }
        else{
            System.out.print(tinhDeQuy(vitri)+" ");
            fibonaciDeQuy(vitri-1);
        }        
    }

    public int fibonaciLoop(int n){
        if(n<2){
            System.out.println("1");
            return n;
        }
        else{
            int sothu1 = 1;
            int sothu2 = 1;
            int ketqua = 0;
            System.out.print(sothu1+ " ");
            System.out.print(sothu2+ " ");

            for(int i=3; i<=n; i++){
                ketqua = sothu1 + sothu2;
                System.out.print(ketqua+ " ");
                sothu1 = sothu2;
                sothu2 = ketqua;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Main_2 fi = new Main_2();
        int choose = 0;
        int n = 0;
        do{
            System.out.println("1: Nhập số nguyên dương n");
            System.out.println("2: In ra n phần tử đầu tiên của dãy fibonaci theo vòng lặp");
            System.out.println("3: In ra n phần tử đầu tiên của dãy fibonaci theo đệ quy");
            System.out.println("4: Kết thúc");
            System.out.print("===> Mời bạn chọn : ");
            choose = new Scanner(System.in).nextInt();
            switch(choose){
                case 1:{
                    System.out.print("Nhập n: ");
                    n = new Scanner(System.in).nextInt();
                    System.out.println("================================================================================================");
                    break;
                }
                case 2:{
                    System.out.print("Dãy fibonaci: ");
                    fi.fibonaciLoop(n);
                    System.out.println("");
                    System.out.println("================================================================================================");

                    break;
                }
                case 3:{
                    System.out.print("Dãy fibonaci: ");
                    fi.fibonaciDeQuy(n);
                    System.out.println("");
                    System.out.println("================================================================================================");

                    break;
                }
                case 4:{
                    System.out.println("Tạm biệt");
                    break;
                }
            }
      
        }while(choose !=4);
    }
    
}
