/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotestcode;

import java.util.Scanner;

/**
 *
 * @author HOAN DO
 */
public class DemoTest2 {
    static void displayScreen(int[] arr){ //chuc nang cho phep in ra day vua nhap
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    static void sort(int [] arr){ //chuc nang sap xep theo thu tu tu be den lon
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if(arr[i]>arr[j]){
                    arr[i]= temp;
                    temp = arr[j];
                    arr[j]=arr[i];                 
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    static void max(int [] arr){ // tim gia tri lon nhat trong day
        int giatriMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > giatriMax){
                giatriMax = arr[i];
            }
            
        }
        System.out.println(" " + giatriMax);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of arrays: "); //nhap so luong phan tu trong day
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter array interger: "); //nhap cac phan tu trong day
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập vào chức năng bạn muốn: "); //menu
        System.out.println("1. Hiển thị các số vừa nhập vào.");
        System.out.println("2. Sắp xếp các số trong dãy.");
        System.out.println("3. Tìm giá trị lớn nhất trong dãy.");
        System.out.println("Số bạn chọn là: "); // bien chua cac lua chon
        int c = sc.nextInt();
        switch(c){
            case 1: 
                displayScreen(arr);
                break;
            case 2:
                sort(arr);
                break;
            case 3:
                max(arr);
                break;
            default:
                System.out.println("Không có số hợp lệ.");
                break;
        }
            }
}
