import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    
    int speedShot=7; 
    int position;
    
    public Shot(int direction)
    {
        position=direction;
    }
    public void act() 
    {
        setImage("Shot.png");
        switch(position)
        {
            case 0:
                setLocation(getX(), getY()-speedShot);
            break;
            case 1:
                setLocation(getX(), getY()+speedShot);
            break;
            case 2:
                setLocation(getX()+speedShot, getY());
            break;
            case 3:
                setLocation(getX()-speedShot, getY());
            break;
        }
        if((getX()>=getWorld().getWidth()-5)||(getX()<=5))
        {
            getWorld().removeObject(this);
        }
        else
        {
        if((getY()>=getWorld().getWidth()-5)||(getY()<=5))
        {
            getWorld().removeObject(this);
        }
    }
    }
}    