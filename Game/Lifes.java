import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lifes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lifes extends Actor
{
    int c=3;
    public Lifes() 
    {
        
    }   

    public void Disminuir()
    {
     c--;
     if(c==0)
     {
         Greenfoot.stop();
        }
    }
}
