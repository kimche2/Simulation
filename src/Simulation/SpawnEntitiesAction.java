package Simulation;

import Simulation.entity.Coordinates;
import Simulation.entity.Grass;
import Simulation.entity.Herbivore;
import Simulation.entity.Predator;
import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Random;

public class SpawnEntitiesAction implements Action {
    Random random = new Random();
    Grass grass = new Grass();
    Herbivore herbivore = new Herbivore();
    Predator predator = new Predator();

    @Override
    public void execute(WorldMap worldMap) {

        // TODO: Расставить существ


    }
}
