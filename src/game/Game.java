package game;

import engine.CollisionHandler;
import engine.Program;
import game.objects.Hero;
import game.objects.Wall;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by zdravko on 4.11.16..
 */
public class Game {

    private LinkedList<GameObject> objects = new LinkedList<>();

    private GameObject[][] map;

    private Color backgroundColor;

    private Hero hero;

    private CollisionHandler collisionHandler;

    public Game(Color backgroundColor)
    {
        this.backgroundColor = backgroundColor;

        hero = new Hero(100, 100);
        objects.add(hero);

        collisionHandler = new CollisionHandler();

        initMap(10, 1);
    }

    private void initMap(int verticalBlocks, int horisontalBlocks/*, file */)
    {
        map = new GameObject[horisontalBlocks][verticalBlocks];

        for (int i = 0; i < horisontalBlocks; i++)
        {
            for (int j = 0; j < verticalBlocks; j++)
            {
                map[i][j] = new Wall(j*Wall.width, i*Wall.height); // kopija mozda nece trebati ->
                objects.add(map[i][j]); // -> nego direkt dodavanje novog zida u objekte!?
            }
        }

        // Za debagovanje getbounds i kolizije
        objects.add(new Wall(5*Wall.width, 5*Wall.height));
    }

    public void tick()
    {
        for (GameObject object : objects)
            object.tick();

        collisionHandler.tick(objects);
    }


    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Program.WIDTH, Program.HEIGHT);

        for (GameObject object : objects) {
            object.render(g);
        }
    }


    public Hero getHero() {
        return hero;
    }
    /*public void addGameObject(GameObject gameObject)
    {
        objects.add(gameObject);
    }*/


    /*public void removeGameObject(GameObject gameObject)
    {
        objects.remove(gameObject);
    }*/
}
