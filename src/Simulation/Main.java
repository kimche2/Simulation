package Simulation;

import Simulation.entity.*;

public class Main {
    public static void main (String[] args) {

        WorldMap worldMap = new WorldMap(11, 50);
        WorldMapRenderer worldMapRenderer = new WorldMapRenderer();


        Coordinates coord1 = new Coordinates(3, 3);
        Grass grass = new Grass(coord1);
        worldMap.addEntity(coord1, grass);

        Coordinates coord2 = new Coordinates(5, 5);
        Herbivore herbivore = new Herbivore(coord2, 2, 5, 5);
        worldMap.addEntity(coord2, herbivore);

        Coordinates coord3 = new Coordinates(7, 2);
        Predator predator = new Predator(coord3, 2, 10, 10, 3);
        worldMap.addEntity(coord3, predator);

        Coordinates coord4 = new Coordinates(8, 9);
        Tree tree = new Tree(coord4);
        worldMap.addEntity(coord4, tree);

        Coordinates coord5 = new Coordinates(8, 6);
        Rock rock = new Rock(coord5);
        worldMap.addEntity(coord5, rock);

        worldMapRenderer.render(worldMap);

    }

}
