package level1.exercises234;

enum Level {
    LOW("Verd"),
    MEDIUM("Groc"),
    HIGH("Vermell");

    private String color;
    private Level(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }
}
