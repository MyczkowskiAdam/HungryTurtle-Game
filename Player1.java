import greenfoot.*; 
public class Player1 extends Actor
{
    private CounterP1 counterP1;
    public Player1(CounterP1 scoreCounter1)
    {
        counterP1 = scoreCounter1;
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("Right"))
        {
            turn(10);
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            move(10);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            move(-10);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            turn(-10);
        }
        if (foundLettuce())
        {
            eatLettuce();
        }
        if (foundSnake())
        {
            counterP1.snakeHit();
        }
        if (foundHeart())
        {
            counterP1.addLife();
            removeHeart();
        }
        if (foundBlock1() || foundBlock2())
        {
            turn(180);
        }
    }
    private boolean foundLettuce()
    {
        Actor Lettuce = getOneObjectAtOffset(0, 0, Lettuce.class);
        if (Lettuce != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private void eatLettuce()
    {
        Actor Lettuce = getOneObjectAtOffset(0, 0, Lettuce.class);
        if (Lettuce != null)
        {
            getWorld().removeObject(Lettuce);
            counterP1.addScore();
        }
    }
    private boolean foundSnake()
    {
        Actor Snake = getOneObjectAtOffset(0, 0, Snake.class);
        if (Snake != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private boolean foundHeart()
    {
        Actor Heart = getOneObjectAtOffset(0, 0, Heart.class);
        if (Heart != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private void removeHeart()
    {
        Actor Heart = getOneObjectAtOffset(0, 0, Heart.class);
        
        getWorld().removeObject(Heart);
    }
    private boolean foundBlock1()
    {
        Actor Block1 = getOneObjectAtOffset(0, 0, Block1.class);
        if (Block1 != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private boolean foundBlock2()
    {
        Actor Block2 = getOneObjectAtOffset(0, 0, Block2.class);
        if (Block2 != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}