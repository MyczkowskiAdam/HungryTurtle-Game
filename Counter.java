import greenfoot.*;
import java.awt.Color;
public class Counter extends Actor
{
    int score = 0;
    int life = 20;
    public void act() 
    {
        setImage(new GreenfootImage("Player 1: " + (35 - score) + "   HP: " + life, 24, Color.GREEN, Color.BLACK));
        if(score >= 35)
        {
            YouWin();
        }
        else if (life == 0)
        {
            gameOver();
        }
    }
    public void YouWin()
    {
        Greenfoot.setWorld(new YouWin());
    }
    public void addScore()
    {
        score++;
    }
    public void gameOver()
    {
        Greenfoot.setWorld(new GameOver());
    }
    public void snakeHit()
    {
        life--;
    }
    public void addLife()
    {
        life = life + 5;
    }
}