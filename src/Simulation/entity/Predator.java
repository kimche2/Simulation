package Simulation.entity;

import java.util.Map;

public class Predator extends Creature {
    private int attackPower = 1;

    public Predator(int speed, int hp, int maxhp, int attackPower) {
        super(speed, hp, maxhp);
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void causeDamage(Creature target) {
       target.takeDamage(getAttackPower());
    }


    @Override
    public void makeMove(Map map) {

        // TODO: Реализовать логику передвижения.
    }

    // TODO: 1 метод который возвращает координату, на которую нужно встать для того что бы найти траву. реализовать поиск в ширину.


    // TODO: 2 метод получает в параметры координаты и переставляет существо на эти координаты .


    @Override
    public String getSymbol() {
        return "\uD83D\uDC3A";
    }

}
