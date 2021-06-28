package composants;

public class ComposantImpl2 implements ComposantAbstrait {
    @Override
    public String getDescription() {
        return ", getDescription() is called from ComposantImpl2 ";
    }

    @Override
    public double getCost() {
       return 10.50;
    }
}
