
package linearsearch;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements: "); // Nhập số lượng phần tử của dãy.
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) { // sử dụng vòng lặp để nhập từng phần tử trong dãy.
            System.out.print("");
            array[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number need find: "); // Nhap so can tim.
        int x = sc.nextInt();
        
        int i = 1;
        while(i <= 1 && x != array[i]){ // thuật toán tìm kiếm linear search.
            i = i + 1;
            if (i <= n && array[x] == i) {
                System.out.println("Have an element in array.");
            } else if (array[x] != 0) {
                System.out.println("Dont have an element in array.");
            }
        }
    }
    
}
