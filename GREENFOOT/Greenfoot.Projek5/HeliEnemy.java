import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeliEnemy extends Enemy
{

    public HeliEnemy()
    {
      super();
      
    }
    
    public HeliEnemy(int speed){
        super(speed);
        
    }
    
    public void act(){
        super.act();
        turn(1);
    }
}


