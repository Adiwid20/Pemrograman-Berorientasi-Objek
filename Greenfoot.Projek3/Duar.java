import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duar extends Actor
{
    /**
     * Act - do whatever the Duar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int jeda = 5;
    public void act()
    {
        // Add your action code here.
        turn(2);
        duar();
       
    }
    
    int duarTimer = 0;
    
    public void duar(){
        if (duarTimer==30){
            getWorld().removeObject(this);
        }else {
            duarTimer++;
        }
    }
}
