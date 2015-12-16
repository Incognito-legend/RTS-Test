import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Fader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fader extends Actor
{
    public int fadeLevel = 0;
    /**
     * Act - do whatever the Fader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        background level = (background)this.getWorld();
                 Greenfoot.delay(100);
        //getWorld().addObject(new Fader(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        level.addObject(new Fader(), 632, 312); 
        fade(fadeLevel++);
         
        if (fadeLevel > 255)
        {
            
//             Greenfoot.setWorld((background).getWorld());
        }
    }    
     
    public Fader()
    {
        fade(0);
    }
 
    public void fade(int f)
    {
        if (f > 255)
        {
            f = 255;
        }
        else if (f < 0)
        {
            f = 0;
        }
         
        GreenfootImage fade = new GreenfootImage(600, 400);
        Color fadeColor;
        fadeColor = new Color(0, 0, 0, f);
        fade.clear();
        fade.setColor(fadeColor);
        fade.fillRect(0, 0, 600, 400);
        setImage(fade);
    }
}
