import java.util.Scanner;
public class FibonacciSeries {
    public static void fibonacciNum(int series_num){
        int a = 0;
        int b = 1;
        for(int i=0;i<=series_num;i++){
            if(i<=1){
                System.out.println(i);
            }
            else{
                int c = a+b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }

    public static int recursiveFibo(int n) {
        if(n<=1){
            return n;
        }
        else{
            return recursiveFibo(n-1)+recursiveFibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int series_num = scanner.nextInt();
        fibonacciNum(series_num);
       // System.out.println(recursiveFibo(series_num));
    }
}
