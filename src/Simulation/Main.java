package Simulation;

import Simulation.entity.*;

public class Main {

    public static void main(String[] args) {

        WorldMap worldMap = new WorldMap(10, 10);

        Rock rock = new Rock();

        worldMap.addEntity(new Coordinates(3, 5), rock);

        WorldMapRenderer worldMapRenderer = new WorldMapRenderer();


        Herbivore herbivore = new Herbivore(3, 4, 5);

        worldMap.addEntity(new Coordinates(4, 9), herbivore);


        Predator predator = new Predator(3, 4, 5, 1);

        worldMap.addEntity(new Coordinates(7, 6), predator);

        


        Grass grass = new Grass();

        worldMap.addEntity(new Coordinates(6, 9), grass);



        Tree tree = new Tree();

        worldMap.addEntity(new Coordinates(3, 2), tree);

        worldMapRenderer.render(worldMap);

    }
}
