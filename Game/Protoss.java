import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Protoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Protoss extends Actor
{
    
    public void act() 
    {
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
        if(getY() >= m.getHeight()-5 || getY()<=5)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
        Actor Terran=getOneObjectAtOffset(0, 0, Terran.class);
        if(Terran!=null)
        {
            SectorKropulo sk = (SectorKropulo)getWorld();
            getWorld().removeObject(Terran);
            sk.objLife.Disminuir();
            getWorld().addObject(new Terran(), 50, 300);
            if(sk.vidas.getValor()==0)
            {
                FinDelJuego f = new FinDelJuego();
                getWorld().addObject(f,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
        }
    }    
    
}
