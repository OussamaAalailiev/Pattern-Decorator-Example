package decorators;

import composants.ComposantAbstrait;

public class Decorator3 extends DecoratorAbstrait{

    public Decorator3(ComposantAbstrait composantAbstrait) {
        super(composantAbstrait);
    }

    @Override
    public String getDescription() {
        return this.composantAbstrait.getDescription()+ ", getDesc() of Decorator3 is called";
    }

    @Override
    public double getCost() {
        return this.composantAbstrait.getCost() + 0.9;
    }
}
