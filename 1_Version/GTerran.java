import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GTerran extends Terran
{
    public void act() 
    {
        super.act();
        Curar();
    }     
    
    public void Curar()
    {
        Actor a= this.getOneIntersectingObject(MTerran.class);
        if (a != null)
        {
            int cura=15;
                if(getEnergia()==160)
                {
                    
                }
                else
                {
                    if(getEnergia()<160)
                    {
                        if(getEnergia()+15>160)
                        {
                            int e = (getEnergia()+15)-160;
                            cura = 15-e;
                        }
                        setEnergia(cura);
                    }
                }
            
        }
        move(5);
    }
    
    public void pbGT()
    {
        
    }
}
