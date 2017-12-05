import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida1 extends Car
{ 
    public void act() 
    {
       
        checkVida();
        
   
    } 
    
    public void checkVida(){
        int vidaAtual = Car.getResistance();
        
        if (vidaAtual <= 400 && vidaAtual > 300){
                 
        getWorld().removeObject(this);
        
    }
}
}

