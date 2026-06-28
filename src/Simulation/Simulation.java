package Simulation;

import Simulation.entity.Coordinates;

import java.util.List;
import java.util.Map;

public class Simulation {
    private int turnCounter = 0;
    List<Action> initActions;
    List<Action> turnActions;
    private WorldMap worldMap;
    private WorldMapRenderer renderer;
    private Boolean isRunning;


    public Simulation(List<Action> initActions, List<Action> turnActions, WorldMap worldMap, WorldMapRenderer renderer) {
        this.initActions = initActions;
        this.turnActions = turnActions;
        this.worldMap = worldMap;
        this.renderer = renderer;
    }

    public void startSimulation() throws InterruptedException {
        isRunning = true;

        for (Action action : initActions) { // Расставляем сущности initActions
            action.execute(worldMap);
        }
        renderer.render(worldMap); // После расстановки показываем начальное состояние

        while (isRunning) { // бесконечный цикл - каждый ход

            for (Action action : turnActions) { // turnActions - выполняется каждый ход (движение, атака, поедание)
                action.execute(worldMap);
            }
            renderer.render(worldMap); // показываем изменение после хода
            turnCounter++; // считаем ходы
            Thread.sleep(2000); // пауза для того что бы видеть изменения на карте.
        }

    }

    public void nextTurn() {

    }

    public void pauseSimulation() {

    }
}
