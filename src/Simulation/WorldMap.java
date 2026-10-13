package Simulation;

import Simulation.entity.Coordinates;
import Simulation.entity.Entity;
import Simulation.entity.Grass;

import java.util.*;

public class WorldMap {
    private Map<Coordinates, Entity> entities = new HashMap<>();
    public static Random random = new Random();
    private final int height;
    private final int width;

    public WorldMap(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    // Добавить сущность в мапу.
    public void addEntity(Coordinates coordinates, Entity entity) {
        if (isInBounds(coordinates) && !isCellOccupied(coordinates)) {
            entities.put(coordinates, entity);
            return;
        }
        throw new RuntimeException("Не получилось поставить на клетку");
    }

    // Удалить сущность
    public void removeEntity(Coordinates coordinates) {
        entities.remove(coordinates);
    }
    // Получить сущность
    public Entity getEntity(Coordinates coordinates) {
        return entities.get(coordinates);

    }
    // Проверяем занята ли ячейка по координатам
    public boolean isCellOccupied(Coordinates coordinates) {
        if (entities.containsKey(coordinates)) {
            return true;
        }
        return false;
    }
    // Находится ли кордината в границах
    public boolean isInBounds(Coordinates coordinates) {
        if (coordinates.getRow() >= 0 && coordinates.getRow() < height) {
            if (coordinates.getColumn() >= 0 && coordinates.getColumn() < width) {
                return true;
            }

        }
        return false;
    }
    // получить полный список всех сущностей
    public Collection<Entity> getAllEntities() {
        return entities.values();
    }




    // Получить список всех координат по сущности Трава.. Буду запрашивать данный список травоядным.
//    public List<Coordinates> getAllGrassCoordinates () {
//        List<Coordinates> coordinatesOfAllGrass = new ArrayList<>();
//        Collection<Entity> allEntities = getAllEntities();
//        for (Entity entity : allEntities) {
//            if (entity instanceof Grass) {
//                Coordinates coordinates = entities.g();
//                coordinatesOfAllGrass.add(coordinates);
//                // Нужно реализовать логику поиска по значению Entity ключа Coordinates
//            }
//
//        }
//        return coordinatesOfAllGrass;
//
//    }
}
