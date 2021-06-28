package decorators;

import composants.ComposantAbstrait;

public class Decorator1 extends DecoratorAbstrait{
    /**A Decorator Class can be either a Decorator or a Component Object, BECAUSE
     * of the nature of the double RELATIONSHIP (Inheritance + Composition) it has */

    public Decorator1(ComposantAbstrait composantAbstrait) {
        super(composantAbstrait);
    }

    @Override
    public String getDescription() {
        return this.composantAbstrait.getDescription()+ ", getDesc() of Decorator1 is called";
    }

    @Override
    public double getCost() {
        return this.composantAbstrait.getCost() + 0.5;
    }
}
