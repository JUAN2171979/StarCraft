    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    import java.lang.*;
    /**
     * Write a description of class Protoss here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Protoss extends Actor
    {

        GreenfootSound musicaPerder = new GreenfootSound("GameOver.mp3");
        GreenfootSound musicaFondo = new GreenfootSound("God Of War I II  III - Música Tema - Parte 2.mp3");
        public int energia=160;
        
        public void setEnergia(int e)
        {
                this.energia=e;
        }
        
        public int getEnergia()
        {
            return energia;
        }
        
        public void act(){
            int prob;
            prob = Greenfoot.getRandomNumber(100);
            move(5);
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
            World world = getWorld();
            if(getX() >= world.getWidth()-5 || getX()<=5)
            {
                turn(180);
                if(Greenfoot.getRandomNumber(100)<90)
                {
                    turn(Greenfoot.getRandomNumber(90-45));
                }
            }
            if(getY() >= world.getHeight()-10 || getY()<=10)
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
        move(5);
    }
    
        public void ChCentroComando()
        {
            
            Actor b= this.getOneIntersectingObject(CentroComando.class);
                    if (b != null){
                    turn(180); 
                }
                move(5);
            }
            
        public void ChCentroCuracion()
        {
            
            Actor c= this.getOneIntersectingObject(CentroCuracion.class);
            if (c != null){
            turn(180); 
        }
        move(5);
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
            int cura=15;
            if(energia<160 )
            {
                energia += 15;
                if(energia+15>160)
                        {
                            int e = (energia+15)-160;
                            cura = 15-e;
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
    
    public void curarCC()
    {
        Actor a = this.getOneIntersectingObject(CentroCuracion.class);
        if(a != null)
        {
            int cura=15;
            if(energia<160 )
            {
                energia = energia +15;
                if(energia+15>160)
                        {
                            int e = (energia+15)-160;
                            cura = 15-e;
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
        Actor a = this.getOneIntersectingObject(GTerran.class);
        if(a != null)
        {
            if(getEnergia()<=0)
            {
            getWorld().removeObject(a);
        }
        }
        Actor b = this.getOneIntersectingObject(CTerran.class);
        if(b != null)
        {
            if(getEnergia()<=0)
            {
            getWorld().removeObject(b);
        }
        }
        Actor c = this.getOneIntersectingObject(MTerran.class);
        if(c != null)
        {
            if(getEnergia()<=0)
            {
            getWorld().removeObject(c);
        }
        }
    }
    
    
}
