package composants;

public class ComposantImpl1 implements ComposantAbstrait {
    @Override
    public String getDescription() {
      return "getDescription() is called from ComposantImpl1";
    }

    @Override
    public double getCost() {
        return 2.5;
    }
}
