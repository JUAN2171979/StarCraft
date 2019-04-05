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
        CurarP();
        morir();
        
}

    public void CurarP()
    {
        
        Actor a= this.getOneIntersectingObject(CProtoss.class);
        if (a != null)
        {

            if(getEnergia()<160)
            {
             vida = vida-15;
             
            }
            else
            {
              
             move(4);
            }

        Actor b= this.getOneIntersectingObject(GProtoss.class);
        if (b != null)
        {
            if(getEnergia()<160)
            {
             vida = vida-15;
           
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

        if(vida<0)
        {
            getWorld().removeObjects(getWorld().getObjects(MProtoss.class));
         }
        else
        {
            
            move(4);
        }
        
}
        
     
        

}


