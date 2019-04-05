import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CProtoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CProtoss extends Protoss
{
    public int recursos;
    
    public void act() 
    {
        super.act();
        Recursos();
        Curar();
        atacarT();
    }
    
    public void Curar()
    {
        Actor b= this.getOneIntersectingObject(MProtoss.class);
        if (b != null)
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
    
    public void Recursos()
    {
        
        Actor a= this.getOneIntersectingObject(MinaCristales.class);
        if (a != null)
        {
        recursos = recursos +35;
        }
        move(4);
    
    
        
        Actor b= this.getOneIntersectingObject(CentroComando.class);
        if (b != null)
        {
        recursos = recursos -35;
        }
        move(4);   
    
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
                        CProtoss cp = (CProtoss)getOneObjectAtOffset(0, 0, CProtoss.class);
                        getWorld().removeObject(cp);
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
                        CProtoss cp = (CProtoss)getOneObjectAtOffset(0, 0, CProtoss.class);
                        getWorld().removeObject(cp);
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
                        CProtoss cp = (CProtoss)getOneObjectAtOffset(0, 0, CProtoss.class);
                        getWorld().removeObject(cp);
                    }
                } 
                        }         
                        
                        
    }
    
        }
    
       
    

