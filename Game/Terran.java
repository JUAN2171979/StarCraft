import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terran extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int directionShot = 2;
    boolean isShot = false;
    public void act() 
    {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("right"))
        {
         setDirection(RIGHT); x=x+5;
         directionShot=2;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
         x=x-5;
         directionShot=3;
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
         setDirection(UP); y=y-5;
         directionShot=0;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
         setDirection(DOWN); y=y+5;
         directionShot=0;
        }
        setShot(directionShot);
        setLocation(x,y);
    }    
    
    public void setShot(int direction)
    {
        if(isShot && Greenfoot.isKeyDown("x"))
        {
            Shot s = new Shot(direction);
            getWorld().addObject(s, getX()+30, getY()-3);
            isShot=false;
        }
        if(!isShot && !Greenfoot.isKeyDown("x"))
        {
            isShot=true;
        }
    }
    
    public void setDirection(int direccion)
    {
        switch(direccion)
        {
            case UP:
            setRotation(270);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX(), getY()-10);
            }
            else
            {
                setLocation(getX(), getY()-1);
            }
            break;
            
            case DOWN:
            setRotation(90);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX(), getY()+10);
            }
            else
            {
                setLocation(getX(), getY()+1);
            }
            break;
        
        case LEFT:
            setRotation(180);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX()-10, getY());
            }
            else
            {
                setLocation(getX()-1, getY());
            }
            break;
            
        case RIGHT:
            setRotation(0);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX()+10, getY());
            }
            else
            {
                setLocation(getX()+1, getY());
            }
            break;
        }
}
}
