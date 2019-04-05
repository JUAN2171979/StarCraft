
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
        CurarT();
        morir();
        
    }
    
    public void CurarT()
    {
        Actor a= this.getOneIntersectingObject(CTerran.class);
        if (a != null)
        {

            if(getEnergia()<160)
            {
             vida = vida-20;
             
            }
            else
            {
              
             move(4);
            }

        Actor b= this.getOneIntersectingObject(GTerran.class);
        if (b != null)
        {
            if(getEnergia()<160)
            {
             vida = vida-20;
           
            }
            else
            {
                
                move(4);
            }
             
        }
        
    }   

}

        public void morir()
        {

        if(vida==0)
        {
            getWorld().removeObjects(getWorld().getObjects(MTerran.class));
         }
        else
        {
            
            move(4);
        }
 
}
    
    

 
}

