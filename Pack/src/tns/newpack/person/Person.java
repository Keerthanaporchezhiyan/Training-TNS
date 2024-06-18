package tns.newpack.person;

import tns.newpack.country.Country;
import tns.newpack.state.State;

public class Person {
    private String name;
    private Country country;
    private State state;

    public Person(String name, Country country, State state) {
        this.name = name;
        this.country = country;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public String toString() {
        return "Person [name=" + name + ", country=" + country + ", state=" + state + "]";
    }
}
