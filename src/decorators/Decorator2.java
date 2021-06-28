package decorators;

import composants.ComposantAbstrait;

public class Decorator2 extends DecoratorAbstrait{
    public Decorator2(ComposantAbstrait composantAbstrait){
        super(composantAbstrait);
    }
    @Override
    public String getDescription() {
        return composantAbstrait.getDescription() + ", getDesc() of Decorator2 is called";
    }

    @Override
    public double getCost() {
        return this.composantAbstrait.getCost() + 0.7;
    }
}
