import greenfoot.*;
import javax.swing.*;

public class TurtleWorld extends World
{
    public TurtleWorld() 
    {
        super(1000, 600, 1);
        
        chooseGameType();
    }
    public void singlePlayer()
    {
            Bug[] bugs = new Bug[2];
            for(int i = 0; i<bugs.length; i++)
            {
                bugs[i] = new Bug();
            
                int flyX = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
                int flyY = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
            
                addObject(bugs[i], flyX, flyY);
            }
        
            Lettuce[] lettuce = new Lettuce[25];
            for(int i = 0; i<lettuce.length; i++)
            {
                lettuce[i] = new Lettuce();
            
                int flyX = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
                int flyY = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
            
                addObject(lettuce[i], flyX, flyY);
            }
            
            Snake[] snakes = new Snake[2]; 
            for(int i = 0; i<snakes.length; i++)
            {
                snakes[i] = new Snake();
            
                int flyX = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
                int flyY = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
            
                addObject(snakes[i], flyX, flyY);
            }
            
            Timer timer = new Timer();
            addObject(timer, 46, 582);
            
            Counter counter = new Counter();
            addObject(counter, 94, 20);
            
            Turtle turtle = new Turtle(counter);
            addObject(turtle ,Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            
            Block1 block1 = new Block1();
            addObject(block1, 262, 96);
            
            Block1 block2 = new Block1();
            addObject(block2, 656, 96);
            
            Block1 block3 = new Block1();
            addObject(block3, 786, 226);
            
            Block1 block4 = new Block1();
            addObject(block1, 328, 400);
            
            Block1 block5 = new Block1();
            addObject(block5, 199, 271);
            
            Block2 block6 = new Block2();
            addObject(block6, 264, 335);
            
            Block2 block7 = new Block2();
            addObject(block7, 393, 466);
            
            Block2 block8 = new Block2();
            addObject(block8, 722, 161);
            
            Block2 block9 = new Block2();
            addObject(block9, 852, 290);
    }
    public void twoPlayer()
    {
            Bug[] bugs = new Bug[2];
            for(int i = 0; i<bugs.length; i++)
            {
                bugs[i] = new Bug();
            
                int flyX = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
                int flyY = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
            
                addObject(bugs[i], flyX, flyY);
            }
        
            Lettuce[] lettuce = new Lettuce[30];
            for(int i = 0; i<lettuce.length; i++)
            {
                lettuce[i] = new Lettuce();
            
                int flyX = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
                int flyY = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
            
                addObject(lettuce[i], flyX, flyY);
            }
            
            Snake[] snakes = new Snake[2]; 
            for(int i = 0; i<snakes.length; i++)
            {
                snakes[i] = new Snake();
            
                int flyX = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
                int flyY = 15 + Greenfoot.getRandomNumber(getWidth() - 25);
            
                addObject(snakes[i], flyX, flyY);
            }
 
            Timer timer = new Timer();
            addObject(timer, 46, 582);
        
            CounterP1 counterP1 = new CounterP1();
            addObject(counterP1, 94, 20);
        
            CounterP2 counterP2 = new CounterP2();
            addObject(counterP2, 906, 18);
        
            Player1 player1 = new Player1(counterP1);
            addObject(player1 ,Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        
            Player2 player2 = new Player2(counterP2);
            addObject(player2 ,Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            
            Block1 block1 = new Block1();
            addObject(block1, 262, 96);
            
            Block1 block2 = new Block1();
            addObject(block2, 656, 96);
            
            Block1 block3 = new Block1();
            addObject(block3, 786, 226);
            
            Block1 block4 = new Block1();
            addObject(block1, 328, 400);
            
            Block1 block5 = new Block1();
            addObject(block5, 199, 271);
            
            Block2 block6 = new Block2();
            addObject(block6, 264, 335);
            
            Block2 block7 = new Block2();
            addObject(block7, 393, 466);
            
            Block2 block8 = new Block2();
            addObject(block8, 722, 161);
            
            Block2 block9 = new Block2();
            addObject(block9, 852, 290);
    }
    public void chooseGameType()
    {
        Object[] options = { "Single Player", "Two Player" };
        
        Object choice = JOptionPane.showInputDialog(null,
            "Choose the game type", "Input",
            JOptionPane.QUESTION_MESSAGE, null,
            options, options[0]);
            
        if( choice == options[0])
        {
            singlePlayer();
        }
        if( choice == options[1])
        {
            twoPlayer();
        }        
    }
}