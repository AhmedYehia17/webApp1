package pack2;
import java.util.Scanner;


public class clinic {
    Scanner input=new Scanner(System.in);
    doctor[] doctors=new doctor[3];

    public void insert_doctor(){


        System.out.println("Enter name: ");
        String name= input.next();

        System.out.println("Enter day: ");
        String day=input.next();

        doctors[doctor.counter] =new doctor(name , day);
        doctor.counter++;


    }

    public void display_doctor(String day){
        for(int i=0; i<3 ; i++){
            if(doctors[i].work_day.equals(day)){
                System.out.println("doctor: " + doctors[i].name);
            }
        }
    }

}
