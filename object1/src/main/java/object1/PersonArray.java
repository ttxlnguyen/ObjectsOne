package object1;

public class PersonArray {
    private String name;
    private int age;

    public PersonArray(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }
// getters and setters (wait, what's a setter? a getter?)
}