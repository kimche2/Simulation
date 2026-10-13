package Simulation.entity;

import java.util.Map;

public class Herbivore extends Creature {

    public Herbivore(int speed, int hp, int maxhp) {
        super(speed, hp, maxhp);
    }

    @Override
    public String getSymbol() {
        return "\uD83D\uDC07";
    }

    @Override
    public void makeMove(Map map) {

        // TODO: Реализовать логику передвижения.
        // перемещение по оси
        // алгоритм поиска в ширину.
    }

    // TODO: 1 метод который возвращает координату, на которую нужно встать для того что бы найти траву. реализовать поиск в ширину.


    // TODO: 2 метод получает в параметры координаты и переставляет существо на эти координаты . Вызвать сеттер


    //
}
