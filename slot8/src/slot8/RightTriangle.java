
package slot8;

/**
 *
 * @author HOAN DO
 */
class IllegalTriangleException extends Exception{
   public IllegalTriangleException(String message){
       super(message);
   }
}
class IllegalRightTriangleException extends Exception{
    public IllegalRightTriangleException(String message){
        super(message);
    }
}
public class RightTriangle {
private int a;
private int b;
private int c;

    

    
    
    public RightTriangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException {
        if (!isTriangle(a, b, c)) {
            throw new IllegalTriangleException("The given sides do not form a valid triangle.");
        }
        if (!isRightTriangle(a, b, c)) {
            throw new IllegalRightTriangleException("The given sides do not form a right triangle.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }
    private static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }
   private static boolean isRightTriangle(int a, int b, int c){
       return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a; 
   }
}
