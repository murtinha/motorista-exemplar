import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstcl_Green_Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trafic_Car extends Actor
{
    /**
     * Act - do whatever the Trafic_Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 6);
        detectColision();
    }
    
    private void detectColision() {
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
