import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import greenfoot.Font;
/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero extends Actor
{
    GreenfootImage imagen;
    int cont;
    String mensaje;
    
    public Tablero(int c, String m)
    {
        cont = c;
        mensaje = m;
        imagen = new GreenfootImage(250, 150);
        imagen.setColor(new Color(200,200,0,225));
        imagen.setFont(new Font("Verdana", 24));
        Dibuja();
    }
    
    public void Dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje + cont, 20, 20);
        setImage(imagen);
    }
     
    public void Incrementar()
    {
        cont++;
        Dibuja();
    }
    public void Decrementar()
    {
        cont--;
        Dibuja();
    }
    
    public int getValor()
    {
        return cont;
    }
}
