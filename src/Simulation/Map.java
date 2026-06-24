package Simulation;

import Simulation.entity.Coordinates;
import Simulation.entity.Entity;

import java.util.HashMap;

public class Map {
    private final Map<Coordinates, Entity> entities = new HashMap<>();

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
}
