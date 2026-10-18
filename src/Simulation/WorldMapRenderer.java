package Simulation;

import Simulation.entity.Coordinates;
import Simulation.entity.Entity;

import java.util.Map;
import java.util.Scanner;

public class WorldMapRenderer {

    public void render(WorldMap worldMap) {
        int height = worldMap.getHeight();
        int width = worldMap.getWidth();

        // Рендер карты
        for (int row = 0; row < height; row++) { // строка
            for (int column = 0; column < width; column++) { // столбец
                Coordinates coordinates = new Coordinates(column, row);

                Entity entity = worldMap.getEntity(coordinates);
                if (entity != null) {
                    System.out.print(entity.getSymbol());
                } else {
                    System.out.print("\uD83D\uDFEB");
                    
                }

            }
            System.out.println();
        }
    }
}                                                                                                                                                                                                                                                                                                                                       