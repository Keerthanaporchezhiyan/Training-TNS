import tns.Country1.Country;
import tns.State.State;

public class MainClass {

    public static void main(String[] args) {

        Country c1 = new Country("India");
        State s2 = new State("Gujarat");
        Person p = new Person("Keerthana", c1, s2, 450000, 18);
        System.out.println(p);
        Taxclass t = new Taxclass(p);
    }
}
