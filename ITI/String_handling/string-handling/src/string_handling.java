import java.util.Scanner;
public class string_handling{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter=input.next().charAt(0);

        if((letter >= 'a' && letter<= 'z') || (letter >= 'A' && letter<='Z')){
            System.out.println("Alphabet");
        }else
            System.out.println("Not alphabet");
    }
}