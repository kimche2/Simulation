package Simulation.entity;

import java.util.Map;

public class Predator extends Creature {
    private int attackPower;

    public Predator(Coordinates coordinates, int speed, int hp, int maxhp, int attackPower) {
        super(coordinates, speed, hp, maxhp);
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }


    @Override
    public void makeMove(Map map) {
        // TODO: Реализовать логику передвижения.
    }

    @Override
    public String getSymbol() {
        return "\uD83D\uDC06";
    }
}
