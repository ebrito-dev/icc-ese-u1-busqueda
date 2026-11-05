package models;
/** 
 * 
 * Persona class represents a person with basic attributes such as name, age, and gender. It provides methods to access and modify these attributes.
 * name,
 * age,
 * gender,
 * Privados
 * Constructor lleno
* toString
*/

public class Persona {
    private String name;
    private int age;
    private String gender;

    // Constructor lleno
    public Persona(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}