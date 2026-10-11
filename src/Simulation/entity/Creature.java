package Simulation.entity;

import java.util.Map;

abstract public class Creature extends Entity {
    private int speed;
    private int hp;
    private int maxhp;

    public Creature( int speed, int hp, int maxhp) {
        this.speed = speed;
        this.hp = hp;
        this.maxhp = maxhp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public boolean takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
            return false;
        }
        return true;
    }

    public void heal(int amount) {
        hp += amount;
        if (hp > maxhp) {
            hp = maxhp;
        }
    }

    public abstract void makeMove(Map map);


    /*
    1. Понять на какую клетку идти
    2.

     */
}