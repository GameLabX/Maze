package engine;

import game.Game;
import game.objects.Hero;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by zdravko on 6.11.16..
 */
public class KeyInput extends KeyAdapter
{
    Game game;

    public KeyInput(Game g)
    {
        game = g;
    }


    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        Hero hero = game.getHero();

        if (key == KeyEvent.VK_LEFT) hero.setVelX(-5);
        if (key == KeyEvent.VK_RIGHT) hero.setVelX(5);
        if (key == KeyEvent.VK_UP) hero.setVelY(-5);
        if (key == KeyEvent.VK_DOWN) hero.setVelY(5);
    }


    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        Hero hero = game.getHero();

        if (key == KeyEvent.VK_LEFT) hero.setVelX(0);
        if (key == KeyEvent.VK_RIGHT) hero.setVelX(0);
        if (key == KeyEvent.VK_UP) hero.setVelY(0);
        if (key == KeyEvent.VK_DOWN) hero.setVelY(0);
    }
}
