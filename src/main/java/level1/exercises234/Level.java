package level1.exercises234;

import javax.swing.*;

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

    public Level nextLevel()
    {
        if(name().equals("LOW"))
        {
            return Level.MEDIUM;
        }
        else if(name().equals("MEDIUM"))
        {
            return Level.HIGH;
        }
        else{
            return Level.HIGH;
         }
    }
}
