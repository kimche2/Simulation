package Simulation;

public enum EntityType {
    HERBIVORE("\uD83D\uDC07"),
    PREDATOR("\uD83D\uDC06"),
    GRASS("\uD83E\uDD55"),
    ROCK("\u26F0\uFE0F"),
    TREE("\uD83C\uDF33");

    String picture;

    EntityType(String picture) {
        this.picture = picture;
    }
}
