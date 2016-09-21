import greenfoot.*;
import java.awt.Color;
public class CounterP1 extends Actor
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
        Greenfoot.setWorld(new Player1Win());
    }
    public void addScore()
    {
        score++;
    }
    public void gameOver()
    {
        Greenfoot.setWorld(new Player2Win());
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

