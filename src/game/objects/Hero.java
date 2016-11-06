package game.objects;

import engine.Program;
import game.GameObject;
import game.ObjectType;

import java.awt.*;

/**
 * Created by zdravko on 4.11.16..
 */
public class Hero extends GameObject
{
    private final float width = 32;
    private final float height = 32;


    public Hero(float x, float y)
    {
        super(x, y, 0, 0, ObjectType.Hero);
    }

    // Cemu ovo sluzi ?
    /*
    public Hero(float x, float y, float width, float height)
    {
        this(x, y, width, height, 0, 0);
    }
    */
    public float getWidth() {
        return width;
    }

    /* Nepotrebno
    public void setWidth(float width) {
        this.width = width;
    }
    */
    public float getHeight() {
        return height;
    }
    /* Nepotrebno
    public void setHeight(float height) {
        this.height = height;
    }
    */
    @Override
    public void tick() {
        x += velX;
        y += velY;

        // u zavisnosti od tla, MAX brzina varira
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        ///g.setFont(new Font("Arial black", 1, 32));
        g.fillRect((int)x, (int)y, (int)width, (int)height);

        // Za debagovanje getboundsa
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(Color.BLUE);
        g2d.draw(getBottomBounds());
        g2d.draw(getLeftBounds());
        g2d.draw(getRightBounds());
        g2d.draw(getTopBounds());
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, (int)width, (int)height);
    }

    @Override
    public Rectangle getTopBounds() {
        return new Rectangle((int)x + 5, (int)y, 22, 10);
    }

    @Override
    public Rectangle getBottomBounds() {
        return new Rectangle((int)x + 5, (int)(y + height - 10), 22, 10);
    }

    @Override
    public Rectangle getLeftBounds() {
        return new Rectangle((int)x, (int)y + 5, 10, 22);
    }

    @Override
    public Rectangle getRightBounds() {
        return new Rectangle((int)(x + width - 10), (int)y + 5, 10, 22);
    }
}
