package Simulation;

import Simulation.entity.*;

public class Main {

    public static void main (String[] args) {

        WorldMap worldMap = new WorldMap(10, 10);

        Rock rock = new Rock();

        worldMap.addEntity(new Coordinates(3 , 5), rock);

        WorldMapRenderer worldMapRenderer = new WorldMapRenderer();

        worldMapRenderer.render(worldMap);
    }
}
