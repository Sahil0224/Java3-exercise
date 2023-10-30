package Model;

public class Cat {

    private final Integer id;
    private final String name;
    private final String color;
    private final Integer age;

    public Cat(Integer id, String name, String color, Integer age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" + id + ": " + name + " " + color + " " + age + "}";
    }
}
