
package slot8;
import java.util.Scanner;
/**
 *
 * @author HOAN DO
 */
public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter interger a: ");
            int a = sc.nextInt();
            System.out.print("Enter interger b: ");
            int b = sc.nextInt();
            System.out.print("Enter interger c: ");
            int c = sc.nextInt();
            try{
                
                RightTriangle rt = new RightTriangle(a,b,c);
                System.out.println("This is a right triangle!");
            }
           catch (IllegalTriangleException e) {
            System.out.println("This is not a triangle");
        } catch (IllegalRightTriangleException e) {
            System.out.println("This is not a right triangle");
        }
            System.out.println("Continue?(Y/N):");
            char n = sc.next().charAt(0);
            if(n != 'Y')
                break;
        }
    }
}
