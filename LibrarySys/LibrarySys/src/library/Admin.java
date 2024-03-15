package library;

import java.util.Scanner;

public class Admin extends user{



    public Admin(String name){
        super(name);
        this.operations = new IOOperation[]{
                new AddBook(),
                new ViewBooks(),
                new DeleteBooks(),
                new SearchBooks(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    public Admin(String name, String email, String phone){
        super(name, email, phone);
        this.operations = new IOOperation[]{
                new AddBook(),
                new ViewBooks(),
                new DeleteBooks(),
                new SearchBooks(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    @Override
    public void menu(Database database, user user) {
        System.out.println("1. Add Book");
        System.out.println("2. view Books");
        System.out.println("3. Delete Books");
        System.out.println("4. Search");
        System.out.println("5. Delete all data");
        System.out.println("6. view orders");
        System.out.println("7. Exit");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        this.operations[n-1].oper(database, user);
        input.close();
    }
}
