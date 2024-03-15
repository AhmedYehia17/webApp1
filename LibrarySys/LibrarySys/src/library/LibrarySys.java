package library;
import java.util.Scanner;
public class LibrarySys {
    static Scanner input;
    static Database database;
    public static void main(String [] args){
        input = new Scanner(System.in);
        database = new Database();
        System.out.println("welcome to library Management System \n");

        int num;
//        do{
            System.out.println(
                    "0.Exit \n1. Login \n2.NewUser"
            );
            num = input.nextInt();

            switch (num){
                case 1:
                    login();
                    break;
                case 2:
                    NewUser();
                    break;
//                default:
//                    System.out.println("Nope");
            }
//        }while(num != 0);

    }
    private static void login(){
        System.out.println("Enter phone number: ");
        String phone = input.next();
        System.out.println("Enter your Email: ");
        String email = input.next();
        int n = database.login( phone,  email);
        if(n != -1){
            user user= database.getUser(n);
            user.menu(database , user);
        }else{
            System.out.println("user does not exist");;
        }
    }

    private static void NewUser(){
        System.out.println("Enter name: ");
        String name= input.next();

        System.out.println("Enter Email: ");
        String email = input.next();

        System.out.println("Enter phone: ");
        String phone = input.next();

        System.out.println("1. Admin \n2. Normal User");
        int n2 = input.nextInt();
        user user;
        if(n2 == 1){
            user = new Admin(name , email , phone);
        }else{
            user = new NormalUser(name , email , phone);
        }
        database.addUser(user);
        user.menu(database, user);
    }
}
