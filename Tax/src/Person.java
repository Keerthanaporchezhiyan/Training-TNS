public class Person {
    private String name;
    private tns.Country1.Country country;
    private tns.State.State state;
    private double salary;
    private int age;

    public Person(String name, tns.Country1.Country country, tns.State.State state, double salary, int age) {
        this.name = name;
        this.country = country;
        this.state = state;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public tns.Country1.Country getCountry() {
        return country;
    }

    public void setCountry(tns.Country1.Country country) {
        this.country = country;
    }

    public tns.State.State getState() {
        return state;
    }

    public void setState(tns.State.State state) {
        this.state = state;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", " + country + ", " + state + ", Salary: " + salary + ", Age: " + age;
    }
}
