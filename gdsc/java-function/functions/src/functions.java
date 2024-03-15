import java.util.*;

public class functions {

    static int globalvar;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // method is a block of code that is executed whenever it is called upon    // function declaration:return-type  function-name  (parameter-list {lines of code to be executed);
        // invoking function:  (must be in the main)
        // function name(actual parameter-list)
        // There are some built-in functions in the language like math functions:
        // pow , abs , floor , sqrt


        int a=10;
        int b=20;

        char x='a';
        char y='b';

        System.out.println(larger(x,y));
        System.out.println( larger(a, b));




    }

    public static int larger(int n1, int n2){
        if(n1>n2){
            return n1;
        }else
            return n2;
    }

    public static char larger(char x, char y){
        if(x>y){
            return x;
        }else
            return y;
    }
}