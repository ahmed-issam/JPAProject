package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fullName;
    private int grade;

    public StudentEntity() {
    }

    public StudentEntity(int id, String fullName, int grade) {
        this.id = id;
        this.fullName = fullName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
