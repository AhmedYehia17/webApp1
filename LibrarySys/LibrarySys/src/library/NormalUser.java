package library;
import java.util.Scanner;
public class NormalUser extends user{

    public NormalUser(String name){
        super(name);
        this.operations = new IOOperation[]{
                new ViewBooks(),
                new SearchBooks(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalcFine(),
                new ReturnBooks(),
                new Exit()
        };
    }

    public NormalUser(String name, String email, String phone){
        super(name, email, phone);
        this.operations = new IOOperation[]{
                new ViewBooks(),
                new SearchBooks(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalcFine(),
                new ReturnBooks(),
                new Exit()
        };
    }

    @Override
    public void menu(Database database, user user) {
        System.out.println("1. view Books");
        System.out.println("2. Search");
        System.out.println("3. Place Order");
        System.out.println("4. Borrow Book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Books");
        System.out.println("7. Exit");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        this.operations[n-1].oper(database , user);
        input.close();
    }
}

