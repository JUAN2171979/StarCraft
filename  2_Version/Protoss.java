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
        

        private int energia;
        private GProtoss guerrero;
        private CProtoss constructor;
        private MProtoss medico;
        public Protoss(){
            this.energia = 160;
            guerrero = new GProtoss();
            constructor = new CProtoss();
            medico = new MProtoss();
            
        }
        public void setEnergia(int energia)
        {
                this.energia = energia;
        }
        
        public int getEnergia()
        {
            return energia;
        }
       
            public boolean foundTerran(){
           Terran terran = (Terran)getOneObjectAtOffset(0, 0, Terran.class);
           return terran != null;
        }
    
        public void  atacar(){
           Actor a = this.getOneIntersectingObject(GTerran.class);
            if(a != null){
                int probabilidad = Greenfoot.getRandomNumber(100);
                if(guerrero.foundTerran() && probabilidad > 55){
                    guerrero.setEnergia(energia-20);  
                } 
                if(medico.foundTerran() && probabilidad > 30){
                    medico.setEnergia(energia-20);  
                } 
                if(constructor.foundTerran() && probabilidad > 30){
                    constructor.setEnergia(energia-20);  
                }
           }
        }
        
        public void estadoDelCombate(){
            if(guerrero.getEnergia()!=0){
                    guerrero.delateTerran();
                }else{
                    guerrero.atacar();
                }
            if(medico.getEnergia()!= 0){
                    medico.delateTerran();
                }else{
                    medico.atacar();
                }
            if(constructor.getEnergia()!=0){
                    constructor.delateTerran();
                }else{
                    constructor.atacar();
                }
            
        }
        public void delateTerran(){
           Terran terran = (Terran)getOneObjectAtOffset(0, 0, Terran.class);
           getWorld().removeObject(terran);

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
    
        public void curarCM()
        {
           Actor a = this.getOneIntersectingObject(CentroComando.class);
            if(a != null){   
              int cura=15;
              if(energia<160 ){
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
    
        public void act(){
            int prob;
            prob = Greenfoot.getRandomNumber(100);
            move(5);
            if(prob == 75){
             turn(Greenfoot.getRandomNumber(360));   
            }
            mover();
            atacar();
            ChBarrera();
            ChCentroComando();
            ChCentroCuracion();
            ChMinaCristales();
      
        }
}
