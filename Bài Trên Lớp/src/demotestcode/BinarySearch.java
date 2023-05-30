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
public class BinarySearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: "); // Nhap so luong phan tu cua mang.
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) { // Nhap cac phan tu trong mang.
        System.out.print("");
            arr[i] = sc.nextInt();
        }
             
        System.out.print("Enter the number need find: "); // Nhap phan tu can tim.
        int x = sc.nextInt();
        
        int left = 0; // khai bao bien đe thuc hien thuat toan tim kiem nhi phan.
        int right = arr.length - 1;
        int result = -1;
        while(left < right){ // tim diem bat dau tim kiem, xac dinh khu vuc tim kiem.
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                result = mid;
                break;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        
    }
}
}
