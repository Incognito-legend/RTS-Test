import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Slide_1_String_Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slide_1_String_Text extends Actor
{
    public Slide_1_String_Text(String text)  
    {  
        //GreenfootImage img = new GreenfootImage(text, 20, new Color(0, 0, 0), new Color(0, 0, 0, 0)); <--- black text color
        GreenfootImage img = new GreenfootImage(text, 20, new Color(0, 0, 0), new Color(0, 0, 0, 0));
        setImage(img);
        
        System.out.println("String Performed Task!");
}
public void drawString(java.lang.String string, int x, int y){
}
}
