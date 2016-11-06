package engine;

import game.GameObject;
import game.ObjectType;
import game.objects.Hero;
import game.objects.Wall;

import java.util.LinkedList;

/**
 * Created by boris on 11/6/16.
 */
public class CollisionHandler
{
    private Hero hero;
    private Wall wall;

    public void tick(LinkedList<GameObject> objects)
    {
        // Kolizija izmedju zidova i hero-a
        hero = findHeroInList(objects);

        for (int i = 0; i < objects.size(); ++i)
        {
            if(objects.get(i).getObjectType() == ObjectType.Wall)
            {
                wall = (Wall) objects.get(i);

                if(wall.getBounds().intersects(hero.getTopBounds()))
                    hero.setY(wall.getY() + wall.height);

                if(wall.getBounds().intersects(hero.getBottomBounds()))
                    hero.setY(wall.getY() - hero.getHeight());

                if(wall.getBounds().intersects(hero.getRightBounds()))
                    hero.setX(wall.getX() - hero.getWidth());

                if(wall.getBounds().intersects(hero.getLeftBounds()))
                    hero.setX(wall.getX() + wall.width);
            }
        }

    }

    private Hero findHeroInList(LinkedList<GameObject> objects)
    {
        for (int i = 0; i < objects.size(); ++i)
            if(objects.get(i).getObjectType() == ObjectType.Hero)
                return (Hero) objects.get(i);

        return null;
    }
}
