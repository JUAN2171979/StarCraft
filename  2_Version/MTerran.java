
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MTerran extends Terran
{
    int vida = 120;
    public void act() 
    {
        super.act();
        
    }
    
    public void CurarT()
    {
        
        
        Actor a= this.getOneIntersectingObject(CTerran.class);
        if (a != null)
        {
        
             vida = vida-20;
             if(vida<0)
             {
                 getWorld().removeObjects(getWorld().getObjects(MTerran.class));
                }
             else
             {
                 turn(180);
                }
             move(5);
            }
            
        Actor b= this.getOneIntersectingObject(GTerran.class);
        if (b != null)
        {
             vida = vida-20;
             if(vida<0)
             {
                 getWorld().removeObjects(getWorld().getObjects(MTerran.class));
                }
             else
             {
                 turn(180);
                }
             move(5);
        }
    }   
}

