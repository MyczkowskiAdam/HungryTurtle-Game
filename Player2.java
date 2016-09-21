import greenfoot.*; 
public class Player2 extends Actor
{
    private CounterP2 counterP2;
    public Player2(CounterP2 scoreCounter2)
    {
        counterP2 = scoreCounter2;
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("d"))
        {
            turn(10);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            move(10);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-10);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-10);
        }
        if (foundLettuce())
        {
            eatLettuce();
        }
        if (foundSnake())
        {
            counterP2.snakeHit();
        }
        if (foundHeart())
        {
            counterP2.addLife();
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
         counterP2.addScore();
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