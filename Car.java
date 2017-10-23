import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int Resistance;
    private int _count;
    public Car() {
        Resistance = 500;
        _count = 0;
    }
    
    public void act() 
    {
        move();
        checkColision();
        checkResistance();
    }
    
    private void move() {
        String key = Greenfoot.getKey();
        if (key == "left" && this.getX() > 266) {
            this.setLocation(getX()-130, getY());            
        } 
        else if(key == "right" && this.getX() < 662) {
            this.setLocation(getX()+130, getY());            
        }
        
    }
    
    public void hitDamage(int _damage) {
        Resistance -= _damage;
    }
    
    public void checkColision() {
       Trafic_Car trafic_Car = (Trafic_Car)getOneIntersectingObject(Trafic_Car.class);
       if(this.getX() < 266 || this.getX() > 662) {
           _count+=1;
           if(_count%10 == 0) {
               hitDamage(_count);
            }
            
        }
        
        else if(trafic_Car != null){
           hitDamage(100);
           getWorld().removeObject(trafic_Car);
        }
    }
    
    public void gameOver() {
        getWorld().removeObject(this);
        Greenfoot.stop();
    }
    
    public int getResistance() {
        return Resistance;
    }
    
    public void checkResistance() {
        if (Resistance <= 0) {
            gameOver();
        }
    }
 
        
}
