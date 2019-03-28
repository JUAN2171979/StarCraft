import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import greenfoot.Font;
/**
 * Write a description of class FinDelJuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinDelJuego extends Actor
{
    GreenfootImage imagen;
    String mensaje;
    
    public void act() 
    {
        imagen = new GreenfootImage(400,300);
        imagen.setColor(new Color(250,100,0,255));
        imagen.setFont(new Font("Verdana", 34));
        imagen.drawString("Perdiste we",0,30);
        setImage(imagen);
        Greenfoot.stop();
    }    
}
