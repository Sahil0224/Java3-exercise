package Model;

import java.util.ArrayList;

public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer carId;
    private ArrayList<Cat> catList;

    public Person(Integer id, String firstName, String lastName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(Integer id, Integer carId, String firstName, String lastName, Integer age) {
        this.id = id;
        this.carId = carId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setCatList(ArrayList<Cat> catList) {
        this.catList = catList;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCarId() {
        return carId;
    }

    public ArrayList<Cat> getCatList() {
        return catList;
    }

    @Override
    public String toString() {
        return "{" + id + ": " + firstName + " " + lastName + " " + age + "}";
    }
}
