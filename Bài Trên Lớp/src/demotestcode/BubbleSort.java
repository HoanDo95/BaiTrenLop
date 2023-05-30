
package demotestcode;
import java.util.Scanner;

public class BubbleSort {
    
public static void bubbleSort(int[] arr){
    
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if(arr[j] > arr[j+1]){
                int temp;
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Array after sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

