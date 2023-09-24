import java.util.Scanner;

public class Main {

    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    // fibonacci : 0,1,1,2,3,5,8,13,21......


  public static void main(String[] args) {

        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));


    }
}

