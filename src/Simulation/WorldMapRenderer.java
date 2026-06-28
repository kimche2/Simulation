package Simulation;

import Simulation.entity.Coordinates;
import Simulation.entity.Entity;

import java.util.Map;

public class WorldMapRenderer {

    public void render(WorldMap worldMap) {
        int height = worldMap.getHeight();
        int width = worldMap.getWidth();

        for (int row = 0; row < height; row++) {
            for (int colum = 0; colum < width; colum++) {
                Coordinates coordinates = new Coordinates(colum, row);

                Entity entity = worldMap.getEntity(coordinates);
                if (entity != null) {
                    System.out.print(entity.getSymbol());
                } else {
                    System.out.print(".");

                }


            }
            System.out.println();
        }
    }
}