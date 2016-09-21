import greenfoot.*;
import java.awt.Color;
public class Timer extends Actor
{
    private int time = 1200;
    public void act() 
    {
        setImage(new GreenfootImage("Time: " + time / 20, 24, Color.GREEN, Color.BLACK));
        time1();
        if(time == 1100 || time == 1000 || time == 900 || time == 800 || time == 700 || time == 600 || time == 500 || time == 400 || time == 300 || time == 200 || time == 100)
        {
            createNewLettuce();
        }
        if (time == 900 || time == 300)
        {
            createNewHeart();
        }
    }
    private void time1()
    {
        if( time > 0) 
        {
            time--;
            if(time == 0)
            {
                GameOver();
            }
        }
    }
    private void GameOver()
    {
        Greenfoot.setWorld(new GameOver());
    }
    private void createNewLettuce()
    {
        Lettuce[] lettuce = new Lettuce[8];
        
        World world;
        world = getWorld();
        
        for(int i = 0; i<lettuce.length; i++)
        {
            lettuce[i] = new Lettuce();
            
            int worldWidth = world.getWidth();
            int worldHeight = world.getHeight();
        
            int x = Greenfoot.getRandomNumber(worldWidth);
            int y = Greenfoot.getRandomNumber(worldHeight);
            
            world.addObject(lettuce[i], x, y);
        }
    }
    private void createNewHeart()
    {
        Heart heart = new Heart();
        
        World world;
        world = getWorld();
        
        int worldWidth = world.getWidth();
        int worldHeight = world.getHeight();
        
        int x = Greenfoot.getRandomNumber(worldWidth);
        int y = Greenfoot.getRandomNumber(worldHeight);
            
        world.addObject(heart, x, y);
    }
}