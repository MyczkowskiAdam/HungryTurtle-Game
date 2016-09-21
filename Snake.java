import greenfoot.*;
public class Snake extends Actor
{
    public void act() 
    {
        move(10);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (atWorldEdge())
        {
            turn(180);
        }
        if (foundBlock1() || foundBlock2())
        {
            turn(180);
        }
    }  
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
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
