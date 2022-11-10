public class Person implements MyMovable{
    private String vehicle;
    public Person(String vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public int compareTo(Object other) {
        Person otherPerson = (Person) other ;
        int returnValue = vehicle.compareTo(otherPerson.vehicle);
        return returnValue ;
    }
    @Override
    public boolean equal(Object other) { return vehicle==((Person) other).vehicle; }

    @Override
    public String moveBy() {
        return String.format("나는 %s로 출근한다.",vehicle);
    }


}
