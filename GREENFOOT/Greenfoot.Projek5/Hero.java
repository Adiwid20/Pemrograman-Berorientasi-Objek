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

   public void act()
   {
       shootBall();
       move();
      
    }
   
   private void move()
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


    public void ballCollision(){
        if (isTouching(Enemy.class)){
            getWorld().addObject(new Duar(), getX(), getY());
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        } else if(isAtEdge())
            getWorld().removeObject(this);
    }

    
}



