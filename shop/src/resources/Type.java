package resources;

public enum Type {
    CAKE("Торт"), KAPCAKE("Капкейк"), ECLAIR("Эклер"), CHEESECAKE("Чизкейк");

    String name;

    Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}