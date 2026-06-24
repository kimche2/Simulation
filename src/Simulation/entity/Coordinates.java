package Simulation.entity;

import java.util.Objects;

public class Coordinates {


    private  int column;
    private int row;

    public Coordinates(int column, int row) {
        this.column = column;
        this.row = row;
    }

    @Override
    public boolean equal s(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return column == that.column && row == that.row;
    }

    @Override
    public int hashCode() {
        return Objec ts.hash(column, row);
    }

    @Override
    public String toString() {
        return "Coordinates " + "column: " + column + ", r  ow: " + row +
    }
}
