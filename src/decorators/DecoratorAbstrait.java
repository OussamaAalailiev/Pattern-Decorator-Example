package decorators;

import composants.ComposantAbstrait;

public abstract class DecoratorAbstrait implements ComposantAbstrait {
    /**This Abstract Class "behave as an implementation" of the Component Interface AND
     * "have a Composition relationship with" the Component Class THROUGH the Component Interface*/
    //Down below we demonstrate a "Composition Relationship" by declaring a
    // reference of the Component Interface :
       protected ComposantAbstrait composantAbstrait;

       DecoratorAbstrait(ComposantAbstrait composantAbstrait){
           this.composantAbstrait = composantAbstrait;
       }
}
