package Simulation;

public enum EntityType {
    HERBIVORE(""),
    PREDATOR(""),
    GRASS(""),
    ROCK("\u26F0\uFE0F"),
    TREE("\uD83C\uDF33");

    String picture;

    EntityType(String picture) {
        this.picture = picture;
    }
}
