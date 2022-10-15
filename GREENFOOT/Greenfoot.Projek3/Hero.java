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
    
int speed = 2;
int timeShoot = 0;
int speedShoot = 5;
private boolean shooting;
   public void act()
   {
       shootBall();
       move();
      if (!shooting && Greenfoot.isKeyDown("space")) shooting = true;
        
        if (timeShoot > 0) 
        {
            timeShoot = timeShoot -1;
        }
        else if (shooting == true)
        {
            Actor ball = new Ball();
            
            timeShoot = speedShoot;
        
        }
    }
   
   public void move()
   {
    if (Greenfoot.isKeyDown("w"))
    
        setLocation(getX(), getY()-2);  
    if (Greenfoot.isKeyDown("s"))
    
        setLocation(getX(), getY()+2);  
    if (Greenfoot.isKeyDown("a"))
    
        setLocation(getX()-2, getY());
    if (Greenfoot.isKeyDown("d"))
    
        setLocation(getX()+2, getY());
        
    }
    int laserTimer = 0;
    public void shootBall(){
        if (laserTimer == 30){
            getWorld().addObject (new Ball(), getX() +5, getY());
            
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
    
    

}



