import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SectorKropulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SectorKropulo extends World
{

    public Lifes objLife;
    Tablero puntos;
    Tablero vidas;
    public SectorKropulo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        setPaintOrder(FinDelJuego.class,Tablero.class,Terran.class,Protoss.class);
        Terran humano = new Terran();
        addObject(humano, 100, 300);   //Creacion del humano
        addProtoss(Greenfoot.getRandomNumber(6));
        objLife = new Lifes();
        puntos = new Tablero(0,"Puntos");
        vidas = new Tablero(3,"Vidas:");
        addObject(puntos,150,85);
        addObject(vidas,300,85);
    }
    
     
    
    public void addProtoss(int num)
    {
        for(int i=0; i<num; i++){
        
        Protoss humanoide = new Protoss();
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(humanoide, x, y);
    }
    }
}

