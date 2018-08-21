/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class De7 {
    
    public int timMin(int n, int a[], int min){
        if(n<0){
            return min;
        }
        else{
            if(min>a[n]){
                min = a[n];
            }
            else{
                return timMin(n-1, a, min);
            }
        }
        return 0;
    }
    
    public int tinhTich(int n, int a[], int tich){
        if(n<0){
            return tich;
        }
        else{
            tich = tich*a[n];
            return tinhTich(n-1, a, tich);
        }
    }
   
    public static void main(String[] args) {
       De7 obj = new De7();
       int choose = 0;
       int tich = 1;
       int min = 0;
       int a[] = null;
       int n = 0;
       do{
           System.out.println("1: Nhập dãy số");
           System.out.println("2: Tìm phần tử nhỏ nhất");
           System.out.println("3: Tính tích các phần tử");
           System.out.println("4: Kết thúc");
           System.out.print("Chọn: ");
           choose = new Scanner(System.in).nextInt();
           switch(choose){
               case 1:{
                   System.out.print("Nhập vào số lượng dãy số: ");
                   n = new Scanner(System.in).nextInt();
                   a = new int[n];
                   for(int i = 0; i < a.length; i++){
                       System.out.printf("Nhập phần tử thứ [%d]: ",i);
                       a[i] = new Scanner(System.in).nextInt();
                   }
                   System.out.println("=====================================================================================");
                   break;
               }
               case 2:{
                   min = a[0];
                   System.out.println("Min: "+obj.timMin(n-1, a, min));
                   System.out.println("=====================================================================================");

                   break;
               }
               case 3: {
                   System.out.println("Tich: "+ obj.tinhTich(n-1, a, tich));
                   System.out.println("=====================================================================================");
                   break;
               }
               case 4:{
                   System.out.println("Kết thúc");
                   break;
               }
               default: 
                   System.out.println("Bạn chọn sai chức năng");
           }
       }while(choose != 4);
        
    }
    
}
