import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SectorKropulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SectorKropulo extends World
{
     GreenfootSound musicaFondo = new GreenfootSound("God Of War I II  III - Música Tema - Parte 2.mp3");
   
    public SectorKropulo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addProtoss();
        addTerran();
        CentroComando cm = new CentroComando();
        addObject(cm, 402, 425);
        Barrera b = new Barrera();
        Barrera b1 = new Barrera();
        Barrera b2 = new Barrera();
        Barrera b3 = new Barrera();
        addObject(b,215,339);
        addObject(b1,552,339);
        addObject(b2,481,439);
        addObject(b3,299,439);
        CentroCuracion cc = new CentroCuracion();
        CentroCuracion cc1 = new CentroCuracion();
        addObject(cc,45,52);
        addObject(cc1,746,52);
        MinaCristales mc = new MinaCristales();
        MinaCristales mc1 = new MinaCristales();
        addObject(mc,236,566);
        addObject(mc1,516,566);
        musicaFondo.playLoop();
        musicaFondo.setVolume(50);
    }
    
     public void addProtoss(){
        
        int mp = Greenfoot.getRandomNumber(10);
        int cp = Greenfoot.getRandomNumber(5);
        int gp = ( 100- (30 + cp + mp) );
        int x = Greenfoot.getRandomNumber(100);
        int y = Greenfoot.getRandomNumber(100);
       
        for( int i=1; i<=(15+cp); i++){
            CProtoss pcp = new CProtoss();
            addObject(pcp,96+x, 510+y );
            pcp.atacarT();
            
        }

        for( int j=1; j<=(20+mp); j++){
           MProtoss pmp = new MProtoss();
           addObject(pmp, 100+x, 130+y);
           pmp.morir();
           
           
        }

        for( int k=1; k<=gp; k++){
            GProtoss pgp = new GProtoss();
            addObject(pgp, 100+x, 90+y);
            pgp.atacarT();  
            
        }

    }

    public void addTerran(){

        int mt = Greenfoot.getRandomNumber(10);
        int ct = Greenfoot.getRandomNumber(5);
        int gt = ( 100- (35 + ct + mt) );
        int x = Greenfoot.getRandomNumber(100);
        int y = Greenfoot.getRandomNumber(100);

        for(int i=1; i<=(15+ct); i++){
            CTerran tct = new CTerran();
            addObject(tct, 694+x, 510+y);   
            tct.atacarP();
          
        }

        for(int j=1; j<=(20+mt); j++){
            MTerran tmt = new MTerran();
            addObject(tmt, 600+x, 130+y);
            tmt.morir();
            
            
        }

        for(int k=1; k<=gt; k++){
            GTerran tgt = new GTerran();
            addObject(tgt, 600+x, 90+y);
            tgt.atacarP();
           
        }

    }
    
    
    
}
