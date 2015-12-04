import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fresh_Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Resources
{
    int RandomFishCount = getRandomNumberRange(300, 9999);
    boolean wDF = false;
    boolean wDFTIDn = false;
    int fishCount = RandomFishCount;
    public void act() 
    {   
        background Water = (background)this.getWorld();
        if (!(wDF)){
        System.out.println("Total Fish in the Ocean...");
        System.out.println(fishCount + " Fish!");
        wDF = true;
    } else if ((wDF) && (!(wDFTIDn))){  wDFTIDn = true;  }
    
    }    
    
        public int getRandomNumberRange(int start, int end){
    int normal = Greenfoot.getRandomNumber(end-start+1);
    return normal+start;
}
}
