package entity;

import java.util.Objects;

public class StudentEntity {
    private String reference;
    private String firstname;
    private String lastname;
    private Integer age;

    public StudentEntity() {
    }

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
        if (!(o instanceof StudentEntity that)) return false;
        return Objects.equals(getReference(), that.getReference()) && Objects.equals(getFirstname(), that.getFirstname()) && Objects.equals(getLastname(), that.getLastname()) && Objects.equals(getAge(), that.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReference(), getFirstname(), getLastname(), getAge());
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
