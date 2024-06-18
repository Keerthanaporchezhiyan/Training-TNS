package demoperson;

import tns.newpack.country.Country;
import tns.newpack.person.Person;
import tns.newpack.state.State;

public class DemoPerson {

    public static void main(String[] args) {
        Country country = new Country("India");
        State state = new State("Gujarat");
        Person person = new Person("Rohan", country, state);
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Country: " + person.getCountry().getName());
        System.out.println("State: " + person.getState().getName());
    }
}
