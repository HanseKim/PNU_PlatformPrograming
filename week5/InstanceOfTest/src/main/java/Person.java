import java.util.Objects;

public class Person {
    private String name ;
    private int age ;
    private String address ;
    public Person(String name, int age, String address) {
        this.name = name ; this.age = age ; this.address = address ;
    }
    public String getName() { return name ; }
    public void rename(String name) { this.name = name ; }
    public int getAge() { return age ; }
    public void increaseAge() { age ++ ; }
    public String getAddress() { return address ; }
    public void moveTo(String address) { this.address = address ; }
    @Override
    public String toString() {
        return String.format("%s, %d, %s", name, age, address) ;
    }

    public boolean equals(Object o){
        if(this ==o) return true;
        if(o==null) return false;
        Person p = (Person) o;
        return Objects.equals(this.name,p.name)&&Objects.equals(this.age,p.age)&&Objects.equals(this.address,p.address);
    }
    // override hashCode() and equals()
}

