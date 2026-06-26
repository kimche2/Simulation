package Simulation;

import Simulation.entity.Coordinates;
import Simulation.entity.Entity;

import java.util.HashMap;

public class Map {
    // TODO: Нужно добавить хэшмап, пока хз как.
    private Map<Coordinates, Entity> entities = new HashMap<>();

    private final int height;
    private final int width;

    public Map(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void addEntity(Coordinates coordinates, Entity entity) {
        if (isInBounds(coordinates) && !isСellOccupied(coordinates)) {
            entities.put(coordinates, entity);
        }
    }


    public void removeEntity(Coordinates coordinates) {
        entities.remove(coordinates);
    }

    public Entity getEntity(Coordinates coordinates) {
        return entities.get(coordinates);

    }

    public boolean isСellOccupied(Coordinates coordinates) {
        if (entities.containsKey(coordinates)) {
            return true;
        }
        return false;
    }

    public boolean isInBounds(Coordinates coordinates) {
        if (coordinates.getRow() >= 0 && coordinates.getRow() < height) {
            if (coordinates.getColumn() >= 0 && coordinates.getColumn() < width) {
                return true;
            }

        }
        return false;
    }

}
