import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MProtoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MProtoss extends Protoss
{
     int vida =120;
    public void act() 
    {
        super.act();
       
        
}

    public void CurarP()
    {
        
        Actor a= this.getOneIntersectingObject(CProtoss.class);
        if (a != null)
        {
             vida = vida-20;
             if(vida<0)
             {
                 getWorld().removeObjects(getWorld().getObjects(MProtoss.class));
                }
             else
             {
                 turn(180);
                }
             move(5);
        }
        
        Actor b= this.getOneIntersectingObject(GProtoss.class);
        if (b != null)
        {
             vida = vida-20;
             if(vida<0)
             {
                 getWorld().removeObjects(getWorld().getObjects(MProtoss.class));
                }
             else
             {
                 turn(180);
                }
             move(5);
        }
        
    }   
    
    

}
