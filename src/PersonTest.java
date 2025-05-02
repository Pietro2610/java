public class PersonTest {
    public static void main(String[] args) {

        MathTeacher teacher = new MathTeacher();
        teacher.school = "AGH";
        System.out.println(teacher.school);
        teacher.name = "David";
        teacher.age = 35;
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer();
        footballer.footballClub = "Narnia United";
        System.out.println(footballer.footballClub);
        footballer.name = "Tim";
        footballer.age = 23;
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
        footballer.sayHello();

    }
}
