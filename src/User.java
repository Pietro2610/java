public class User {
    public String username;
    public String password;

    public User() {
        System.out.println("Użytkownik z konstruktorem");
    }

    public User(String username, String password){
        System.out.println("Nazwa użytkownika to "+username);
        this.username = username;
        this.password = password;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + username);
    }
}