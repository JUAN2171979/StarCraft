 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terran extends Actor
{
    
        public int energia=160;
        
        public void setEnergia(int e)
        {
                this.energia=e;
        }
        
        public int getEnergia()
        {
            return energia;
        }
        
    public void act() 
    {
        int prob;
        prob = Greenfoot.getRandomNumber(100);
        move(4);
        if(prob == 75){
         turn(Greenfoot.getRandomNumber(360));   
        }
        mover();
        ChBarrera();
        ChCentroComando();
        ChCentroCuracion();
        ChMinaCristales();
        curarCM();
        curarCC();
        remover();
}
    
    public void mover(){
        move(4);
        World m = getWorld();
        if(getX() >= m.getWidth()-5 || getX()<=5)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if(getY() >= m.getHeight()-10 || getY()<=10)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
    }
    
    
        
    public void ChBarrera()
        {
            
            Actor a= this.getOneIntersectingObject(Barrera.class);
            if (a != null){
            turn(180); 
        }
        move(4);
    }
    
        public void ChCentroComando()
        {
            
            Actor b= this.getOneIntersectingObject(CentroComando.class);
            if (b != null){
            turn(180); 
        }
        move(4);
    }
    
        public void ChCentroCuracion()
    {
        
        Actor c= this.getOneIntersectingObject(CentroCuracion.class);
        if (c != null){
        turn(180); 
    }
    move(4);
}

        public void ChMinaCristales()
    {
        
        Actor d= this.getOneIntersectingObject(MinaCristales.class);
        if (d != null){
        turn(180); 
    }
    move(4);
}

    public void curarCM()
    {
        Actor a = this.getOneIntersectingObject(CentroComando.class);
        if(a != null)
        {
            int cura=20;
            if(energia<160 )
            {
                energia = energia +20;
                if(energia+15>160)
                        {
                            int e = (energia+20)-160;
                            cura = 20-e;
                        }
                        setEnergia(cura);
                        turn(180);
                        move(4);
            }
            else
            {
                if(energia==160)
                {
                    turn(180);
                    move(4);
                }
            }
        }
    }   
    
    public void curarCC()
    {
        Actor a = this.getOneIntersectingObject(CentroCuracion.class);
        if(a != null)
        {
            int cura=20;
            if(energia<160 )
            {
                energia = energia +20;
                if(energia+15>160)
                        {
                            int e = (energia+20)-160;
                            cura = 20-e;
                        }
                        setEnergia(cura);
            }
            else
            {
                if(energia ==160)
                {
                    turn(180);
                    move(4);
                }
            }
        }
    }
    
    public void remover()
    {
        Actor a = this.getOneIntersectingObject(GProtoss.class);
        if(a != null)
        {
            if(getEnergia()<=0)
            {
            getWorld().removeObject(a);
        }
        }
        Actor b = this.getOneIntersectingObject(CProtoss.class);
        if(b != null)
        {
            if(getEnergia()<=0)
            {
            getWorld().removeObject(b);
        }
        }
        Actor c = this.getOneIntersectingObject(MProtoss.class);
        if(c != null)
        {
            if(getEnergia()<=0)
            {
            getWorld().removeObject(c);
        }
        }
    }
    
    
}
