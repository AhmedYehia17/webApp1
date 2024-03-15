package pack1;
import java.util.*;
import pack2.*;

public class problem2 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        clinic c1=new clinic();

        for(int i=0 ; i<3 ; i++){
            c1.insert_doctor();
        }

        c1.display_doctor("saturday");
    }
}
