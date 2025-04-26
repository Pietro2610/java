public class UserTest {
    public static void main(String[] args) {
        User user = new User("Harmit", "Moret");
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();

    }
}
