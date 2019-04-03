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
            
          
        }
      
        
        public void mover(){
            move(5);
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
        move(5);
    }

    public void  atacar()
    {
        
        Actor a = this.getOneIntersectingObject(GTerran.class);
        if(a != null)
        {
            
        }
    }
    
    public void curarCM()
    {
        Actor a = this.getOneIntersectingObject(CentroComando.class);
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
                        turn(180);
                        move(5);
            }
            else
            {
                if(energia ==160)
                {
                    turn(180);
                    move(5);
                }
            }
        }
    }
}
