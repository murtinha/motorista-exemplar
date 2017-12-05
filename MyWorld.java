import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    GreenfootSound backgroundMusic = new GreenfootSound("Top Gear - Las Vegas.mp3");
    private int _randomX;
    private int initialNumber = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    public void act() {
        generateCars();
        
    }
    
    public void started() {
        backgroundMusic.setVolume(50);
        backgroundMusic.playLoop();
    }

    public void stopped() {
        backgroundMusic.pause();        
    }
        
    private void prepare()
    {
        Car car = new Car();
        addObject(car,559,530);
        
        Vida1 vida1 = new Vida1();
        Vida2 vida2 = new Vida2();
        Vida3 vida3 = new Vida3();
        Vida4 vida4 = new Vida4();
        Vida5 vida5 = new Vida5();
        
        addObject(vida1,70,410);
        addObject(vida2,70,440);
        addObject(vida3,70,470);
        addObject(vida4,70,500);
        addObject(vida5,70,530);
    }
    
    private int getRandomNumber(int start, int end) {
        return start + (Greenfoot.getRandomNumber(end-start));
    }
    
    
    private String chooseColor() {
        String[] colors = {"green_car.png", "blue_car.png", "red_car.png", "pink_car.png"};
        
        return colors[Greenfoot.getRandomNumber(3)];
    }
    
    private void generateCars() {
        _randomX = getRandomNumber(266, 662);
        int allowCarGeneration = Greenfoot.getRandomNumber(80);
        if(allowCarGeneration == 0) {
            if(initialNumber <= (_randomX -150) || initialNumber >= (_randomX +150)) {
                String carColor = chooseColor();
                Trafic_Car traficCar = new Trafic_Car();
                traficCar.setImage(carColor);
                addObject(traficCar, _randomX, 0);
                initialNumber = _randomX;
        }
            
        }
    }
}
