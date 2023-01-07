import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int timer = 5;
   
    
    public void act()
    {
        move(4);
        

        
        ballCollision();
        
    }
    private void ballCollision(){
        if (isTouching(Enemy.class)){
            getWorld().addObject(new Duar(), getX(), getY());
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        } else if(isAtEdge())
            getWorld().removeObject(this);
    }
}
