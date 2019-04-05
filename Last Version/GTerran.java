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
        atacarP();
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
                        GTerran gt = (GTerran)getOneObjectAtOffset(0, 0, GTerran.class);
                        getWorld().removeObject(gt);
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
                        GTerran gt = (GTerran)getOneObjectAtOffset(0, 0, GTerran.class);
                        getWorld().removeObject(gt);
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
                        GTerran gt = (GTerran)getOneObjectAtOffset(0, 0, GTerran.class);
                        getWorld().removeObject(gt);
                    }
                } 
                        }    
        }

}
