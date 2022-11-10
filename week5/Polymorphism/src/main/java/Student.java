import java.util.Objects;

public class Student extends Person {
    private String schoolName;
    private Grade grade;

    public Student(String name, int age, String address, String schoolName) {
        super(name, age, address);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void upGrade() {
        grade.upGrade();
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %s, %s",
                getName(), getAge(), getAddress(), schoolName, grade);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o==null||getClass() != o.getClass()) return false;
        Student s = (Student) o;
        return Objects.equals(this.schoolName,s.schoolName);
    }

// override hashCode() and equals()
}
