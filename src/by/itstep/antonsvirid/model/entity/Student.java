package by.itstep.antonsvirid.model.entity;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    public void setAge(int age) throws Exception{   // void но может вернуть excrption
        if (age > 0) {
            this.age = age;
        } else {
            throw new Exception();
        }
    }
}