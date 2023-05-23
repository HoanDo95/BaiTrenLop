
package demotestcode;


public class DemoTestCode {
    static void evenNumber(int begin,int end){
        System.out.print("Các số chẵn là: ");
            for (int i = begin; i <=end ; i++) {
                if(i%2==0)
                    System.out.print(i + ",");
            }
}
    public static void main(String[] args) {
       evenNumber(2,10);
    }
    }

