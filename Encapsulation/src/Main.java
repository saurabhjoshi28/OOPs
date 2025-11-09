//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Person person = new Person("Saurabh", 25, 89);
            System.out.println("My name is: " + person.getName());
            person.setName("Aman");
            System.out.println("My name is: " + person.getName());
        }
}