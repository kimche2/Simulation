package Simulation.entity;

import java.util.Map;

public class Herbivore extends Creature {

    public Herbivore(Coordinates coordinates, int speed, int hp, int maxhp) {
        super(coordinates, speed, hp, maxhp);
    }

    @Override
    public String getSymbol() {
        return "\uD83D\uDC07";
    }

    @Override
    public void makeMove(Map map) {
        // TODO: Реализовать логику передвижения.

    }
}
