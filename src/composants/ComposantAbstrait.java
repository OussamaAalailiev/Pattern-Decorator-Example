package composants;
public interface ComposantAbstrait {
    /**Has an aggregation relationship with the Decorator Classes, in order to
     * add new functionality to each Component Object AT RUNTIME */
    String getDescription();
    double getCost();
}
