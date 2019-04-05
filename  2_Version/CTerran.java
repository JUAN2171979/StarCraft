import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CTerran extends Terran
{
    public int recursos;
    
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
    
    public void Recursos()
    {
        
        Actor a= this.getOneIntersectingObject(MinaCristales.class);
        if (a != null)
        {
        recursos = recursos +40;
    }
    move(5);
    
    
        
        Actor b= this.getOneIntersectingObject(CentroComando.class);
        if (b != null)
        {
        recursos = recursos -40;
    }
    move(5);   
    
    }
}
