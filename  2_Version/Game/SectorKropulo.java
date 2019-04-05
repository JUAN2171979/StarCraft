import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SectorKropulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SectorKropulo extends World
{

   
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
        addObject(b,309,339);
        addObject(b1,484,339);
        CentroCuracion cc = new CentroCuracion();
        CentroCuracion cc1 = new CentroCuracion();
        addObject(cc,45,52);
        addObject(cc1,746,52);
        YacimientoGas yg = new YacimientoGas();
        YacimientoGas yg1 = new YacimientoGas();
        addObject(yg,236,566);
        addObject(yg1,516,566);
    }
    
     public void addProtoss(){
        
        int mp = Greenfoot.getRandomNumber(10);
        int cp = Greenfoot.getRandomNumber(5);
        int gp = ( 100- (30 + cp + mp) );
        int x = Greenfoot.getRandomNumber(100);
        int y = Greenfoot.getRandomNumber(100);
       
        for( int i=1; i<=(15+cp); i++){
            CProtoss pcp = new CProtoss();
            addObject(pcp,100+x, 180+y );
        }

        for( int j=1; j<=(20+mp); j++){
           MProtoss pmp = new MProtoss();
            addObject(pmp, 100+x, 160+y);
        }

        for( int k=1; k<=gp; k++){
            GProtoss pgp = new GProtoss();
            addObject(pgp, 100+x, 140+y);

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
            addObject(tct, 600+x, 180+y);        
        }

        for(int j=1; j<=(20+mt); j++){
            MTerran tmt = new MTerran();
            addObject(tmt, 600+x, 160+y);
        }

        for(int k=1; k<=gt; k++){
            GTerran tgt = new GTerran();
            addObject(tgt, 600+x, 140+y);

        }

    }
    
    

}
