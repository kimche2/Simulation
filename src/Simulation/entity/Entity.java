package Simulation.entity;

abstract public class Entity {
    private Coordinates coordinates;

    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public abstract String getSymbol();




}
