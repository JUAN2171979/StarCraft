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
        Recursos();
        
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
                        if(getEnergia()+20>160)
                        {
                            int e = (getEnergia()+20)-160;
                            cura = 20-e;
                        }
                        setEnergia(cura);
                    }
                }
            
        }
        move(4);
    }
    
    public void Recursos()
    {
        
        Actor a= this.getOneIntersectingObject(MinaCristales.class);
        if (a != null)
        {
        recursos = recursos +40;
    }
    move(4);
    
    
        
        Actor b= this.getOneIntersectingObject(CentroComando.class);
        if (b != null)
        {
        recursos = recursos -40;
    }
    move(4);   
    
}
      
        protected void atacarP()
    {
        Actor a = this.getOneIntersectingObject(GProtoss.class);
        if(a != null)
        {
            int probabilidad = Greenfoot.getRandomNumber(100);
                if(probabilidad > 55){
                    setEnergia(energia-20);  
                    
                    if(energia==0)
                    {
                        CTerran ct = (CTerran)getOneObjectAtOffset(0, 0, CTerran.class);
                        getWorld().removeObject(ct);
                    }
                } 
                
        }
                        
        Actor b = this.getOneIntersectingObject(CProtoss.class);
        if(b != null)
        {
            int probabilidad = Greenfoot.getRandomNumber(100);
                if(probabilidad > 30){
                    setEnergia(energia-20);  
                    
                    if(energia==0)
                    {
                        CTerran ct = (CTerran)getOneObjectAtOffset(0, 0, CTerran.class);
                        getWorld().removeObject(ct);
                    }
                } 
                        }
                        
        Actor c = this.getOneIntersectingObject(MProtoss.class);
        if(c != null)
        {
            int probabilidad = Greenfoot.getRandomNumber(100);
                if(probabilidad > 30){
                    setEnergia(energia-20); 
                    
                    if(energia==0)
                    {
                        CTerran ct = (CTerran)getOneObjectAtOffset(0, 0, CTerran.class);
                        getWorld().removeObject(ct);
                    }
                } 

                        }    
        }

}
