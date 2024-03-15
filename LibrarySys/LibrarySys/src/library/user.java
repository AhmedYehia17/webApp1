package library;

public abstract class user {
    protected String name;
    protected String email;
    protected String phone;

    protected IOOperation[] operations;

    public user(){}

    public user(String name){
        this.name = name;
    }

    public user(String name, String email, String phone){
        this.name = name;
        this. email= email;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    abstract public void menu(Database database, user user);
}
