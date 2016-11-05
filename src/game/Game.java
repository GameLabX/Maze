package game;

import engine.Program;
import game.objects.Hero;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by zdravko on 4.11.16..
 */
public class Game {

    private LinkedList<GameObject> objects = new LinkedList<>();

    private Color backgroundColor;

    private Hero hero;

    public Game(Color backgroundColor)
    {
        this.backgroundColor = backgroundColor;

        hero = new Hero(10, 10, 64, 64);
        objects.add(hero);
    }

    public void tick()
    {
    }


    public void render(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Program.WIDTH, Program.HEIGHT);

        for (GameObject object : objects)
        {
            object.render(g);
        }
    }


    public void addGameObject(GameObject gameObject)
    {
        objects.add(gameObject);
    }


    public void removeGameObject(GameObject gameObject)
    {
        objects.remove(gameObject);
    }
}
