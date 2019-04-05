
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GProtoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GProtoss extends Protoss
{
   
    
    public void act() 
    {
       super.act();
       Curar();
       atacarT();
    }
    
    public void Curar()
    {
        Actor a= this.getOneIntersectingObject(MProtoss.class);
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
                turn(180);
                move(4);
        }
        
    }
    protected void  atacarT()
    {
        
        Actor a = this.getOneIntersectingObject(GTerran.class);
        if(a != null)
        {
            int probabilidad = Greenfoot.getRandomNumber(100);
                if(probabilidad > 55){
                    setEnergia(energia-20);  
                    
                    if(energia==0)
                    {
                        GTerran guerreroT = (GTerran)getOneObjectAtOffset(0, 0, GTerran.class);
                        getWorld().removeObject(guerreroT);
                        
                        
                    }
                } 
                
        }
                        
        Actor b = this.getOneIntersectingObject(CTerran.class);
        if(b != null)
        {
            int probabilidad = Greenfoot.getRandomNumber(100);
                if(probabilidad > 30){
                    setEnergia(energia-20);  
                    
                    if(energia==0)
                    {
                        CTerran constructorT = (CTerran)getOneObjectAtOffset(0, 0, CTerran.class);
                        getWorld().removeObject(constructorT);
                    }
                } 
                        }
                        
        Actor c = this.getOneIntersectingObject(MTerran.class);
        if(c != null)
        {
            int probabilidad = Greenfoot.getRandomNumber(100);
                if(probabilidad > 30){
                    setEnergia(energia-20); 
                    
                    if(energia==0)
                    {
                        MTerran medicoT = (MTerran)getOneObjectAtOffset(0, 0, MTerran.class);
                        getWorld().removeObject(medicoT);
                    }
                } 
                        }         
                        
                        
    }
    

}
