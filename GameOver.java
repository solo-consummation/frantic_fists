import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 400, 1);
        
        GreenfootImage bg = new GreenfootImage("GameOver.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
         prepare();
    }
       
    private void prepare()
    {
        GOver gOver = new GOver();
        addObject(gOver,363,154);

        Enemy4 enemy4 = new Enemy4();
        addObject(enemy4,41,336);
        removeObject(enemy4);
        gOver.setLocation(1188,387);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("Space"))
        Greenfoot.setWorld(new EnterGame());
        
    }
}

