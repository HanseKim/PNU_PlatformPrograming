import java.util.Objects;

public class Professor extends Person{
    private String major;
    private String schoolName;
    public Professor(String name, int age, String address,String schoolname, String major) {
        super(name, age, address);
        this.major = major;
        this.schoolName = schoolname;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String schoolName(){return schoolName;}
    public String major(){return this.major;}
    @Override
    public String toString() {
        return String.format("%s, %d, %s, %s, %s",
                getName(), getAge(), getAddress(), schoolName, major);
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        Person pr = (Person) o;
        Professor p = (Professor) pr;
        return Objects.equals(this.major,p.major)&&Objects.equals(this.schoolName,p.schoolName);
    }

}

