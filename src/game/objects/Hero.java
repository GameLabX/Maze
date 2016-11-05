package game.objects;

import engine.Program;
import game.GameObject;

import java.awt.*;

/**
 * Created by zdravko on 4.11.16..
 */
public class Hero extends GameObject
{
    private float width;
    private float height;

    public Hero(float x, float y, float width, float height, float velX, float velY)
    {
        super(x, y, velX, velY);
        this.width = width;
        this.height = height;
    }


    public Hero(float x, float y, float width, float height)
    {
        this(x, y, width, height, 0, 0);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        //g.setColor(Color.BLACK);
        //g.fillRect(0, 0, Program.WIDTH, Program.HEIGHT);

        g.setColor(Color.white);
        ///g.setFont(new Font("Arial black", 1, 32));
        g.fillRect((int)x, (int)y, (int)width, (int)height);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle getTopBounds() {
        return null;
    }

    @Override
    public Rectangle getBottomBounds() {
        return null;
    }

    @Override
    public Rectangle getLeftBounds() {
        return null;
    }

    @Override
    public Rectangle getRightBounds() {
        return null;
    }
}
