import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    

   public void act ()
   {
       int x = 0, y = 0;
            if (Greenfoot.isKeyDown("w")) 
            
                y--;
            
             if (Greenfoot.isKeyDown("s")) 
        
                y++;
            
             if (Greenfoot.isKeyDown("d")) 
            
                x++;
            
             if (Greenfoot.isKeyDown("a")) 
            
                x--;
            
            if (x != 0 || y != 0) 
            setLocation(getX()+x, getY()+y);  
}
}
