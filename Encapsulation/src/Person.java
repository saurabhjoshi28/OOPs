public class Person {
    /*We keep these fields private to follow the principle of Encapsulation.
     Encapsulation means hiding the internal state of an object and only exposing
     controlled access to it. If these variables were public, any part of the code
     could modify them directly, which can lead to invalid or inconsistent data.

     By using private variables along with getters and setters, we ensure:
     1) Data Validation – we can check or restrict values before assigning.
     2) Flexibility – internal implementation can change without affecting other code.
     3) Safety – prevents accidental or harmful modifications from outside the class.

     In short: private fields protect the object's data, and getters/setters allow safe access.*/
    private String name;
    private int age;
    private int weight;

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 200)
            this.weight = weight;
    }
}
