package tojoniaina.hei.td3.entity;

import java.util.Objects;

public class StudentEntity {
    private String reference;
    private String firstname;
    private String lastname;
    private Integer age;

    public StudentEntity(String reference, String firstname, String lastname, Integer age) {
        this.reference = reference;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(reference, that.reference) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, firstname, lastname, age);
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "reference='" + reference + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
