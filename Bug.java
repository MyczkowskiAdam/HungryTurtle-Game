import greenfoot.*; 
public class Bug extends Actor
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
        if(foundLettuce())
        {
            eatLettuce();
        }
        if (foundBlock1() || foundBlock2())
        {
            turn(180);
        }
   } 
   private boolean atWorldEdge()
   {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
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
     }
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
