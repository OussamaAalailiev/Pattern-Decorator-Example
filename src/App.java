import composants.ComposantAbstrait;
import composants.ComposantImpl1;
import composants.ComposantImpl2;
import decorators.Decorator1;
import decorators.Decorator2;
import decorators.Decorator3;

public class App {
    public static void main(String[] args) {
        /**Design Pattern --> Decorator*/
        //We are decorating the component "ComposantImpl1()" object with 2 object Decorators "Decorator1" AND "Decorator3":
        ComposantAbstrait composantAbstrait = new Decorator1(new Decorator3(new ComposantImpl1()));
        //Then we have called the two methods implemented in both ComposantImpl1 AND
        // Decorators by adding some responsibilities AT RUNTIME in the "App" Class:
        System.out.println(composantAbstrait.getCost());
        System.out.println(composantAbstrait.getDescription());

        System.out.println("--------------------------");
        //We are decorating the component "ComposantImpl2()" with 3 Decorators two of "Decorator2" AND one of "Decorator3":
        ComposantAbstrait composantAbstrait2 = new Decorator2(new Decorator3(new Decorator2(new ComposantImpl2())));
        //Then we have called the two methods implemented in both ComposantImpl2 AND
        // Decorators by adding some responsibilities AT RUNTIME in the "App" Class:
        System.out.println(composantAbstrait2.getCost());
        System.out.println(composantAbstrait2.getDescription());

    }
}
