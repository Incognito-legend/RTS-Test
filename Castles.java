import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Castles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Castles extends Buildings
{
    int tier;
    boolean tdf = false;
    public void act() 
    {
        background Townhall = (background)this.getWorld();
        if (!(tdf)){
        tier = 0;
        Townhall.town_hall(tier);
        tdf = true;
    }
        
    }    
}
