package library;
import java.util.ArrayList;
import java.io.File;

public class Database {
    private ArrayList<user> users = new ArrayList<user>();
    private ArrayList<String> usernames = new ArrayList<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<String> bookNames = new ArrayList<String>();

    private File usersfile = new File(LibrarySys.class.getClassLoader().getResource("Users").getFile());
    private File booksfile = new File(LibrarySys.class.getClassLoader().getResource("Books").getFile());

    public Database(){
        if(!usersfile.exists()){
            usersfile.mkdirs();
        }
        if(!booksfile.exists()){
            booksfile.mkdirs();
        }
    }
    public void addUser(user s){  /*Function to add users and usernames to arrayLists*/
        users.add(s);
        usernames.add(s.getName());
    }

    public int login(String phone , String email){
        int n= -1;
        for(user s: users){ //for each loop to search in the users arraylist
            if(s.getPhone().matches(phone) && s.getEmail().matches(email)){
                n= users.indexOf(s); //n will have the index of the user that have the same phone and email to use it in the getUser function
                break;
            }
        }
        return n;
    }

    public user getUser(int n){
        return users.get(n);
    }

    public void AddBook(Book b){
        books.add(b);
        bookNames.add(b.getName());
    }
}
