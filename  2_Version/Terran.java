import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terran extends Actor
{
    private int energia=160;
    private GTerran guerrero;
    private MTerran medico;
    private CTerran constructor;
    
    public Terran()
    {
        energia = 100;
    }
    
    public void setEnergia(int energia)
    {
        this.energia=energia;
    }
        
    public int getEnergia()
    {
        return energia;
    }
      
    public boolean foundProto(){
        Protoss proto = (Protoss)getOneObjectAtOffset(0, 0, Protoss.class);
        return proto != null;
    }
    
    public void delateProto(){
        Protoss proto = (Protoss)getOneObjectAtOffset(0, 0, Protoss.class);
        getWorld().removeObject(proto);

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
        move(5);
    }
    
    public void ChCentroComando(){
            
            Actor b= this.getOneIntersectingObject(CentroComando.class);
            if (b != null){
            turn(180); 
        }
        move(5);
    }
    
    public void ChCentroCuracion(){
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
                        move(5);
            }
            else
            {
                if(energia==160)
                {
                    turn(180);
                    move(5);
                }
            }
        }
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
        
}
}
