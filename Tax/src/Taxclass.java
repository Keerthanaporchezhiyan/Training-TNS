public class Taxclass {
    private Person person;

    public Taxclass(Person person) {
        this.person = person;
        calculateTax();
    }

    public void calculateTax() {
        double tax;
        if (person.getSalary() > 400000) {
            tax = person.getSalary() * 0.2;
        } else {
            tax = person.getSalary() * 0.1;
        }
        System.out.println("Tax for " + person.getName() + " is: " + tax);
    }
}
