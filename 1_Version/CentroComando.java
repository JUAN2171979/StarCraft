import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CentroComando here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CentroComando extends Construcciones
{
    public int recursos = 0;
    public void act() 
    {
        getRecursos(); 
        Curar();
    }    
    
    public void  getRecursos()
    {
        
        Actor a= this.getOneIntersectingObject(CProtoss.class);
        if (a != null)
        {
             recursos = recursos +35;
        }
    
        Actor b= this.getOneIntersectingObject(CTerran.class);
        if (b != null)
        {
             recursos = recursos +40;
        }
      
    }
    
    public void Curar()
    {
        if(recursos==0)
        {
            ;   
        }
        else
        {
            if(recursos>0)
            {
                Actor a = this.getOneIntersectingObject(GTerran.class);
                if(a != null)
                {
                    
                    recursos = recursos-20;
                }
                Actor b = this.getOneIntersectingObject(CTerran.class);
                if(b != null)
                {
                    recursos = recursos-20;
                }
                Actor c = this.getOneIntersectingObject(MTerran.class);
                if(c != null)
                {
                    recursos = recursos-20;
                }
                Actor d = this.getOneIntersectingObject(GProtoss.class);
                if(d != null)
                {
                    recursos = recursos-25;
                }
                Actor e = this.getOneIntersectingObject(CProtoss.class);
                if(e != null)
                {
                    recursos = recursos-25;
                }
                Actor f = this.getOneIntersectingObject(MProtoss.class);
                if(f != null)
                {
                    recursos = recursos-25;
                }
            }
              
        }
    }
}
