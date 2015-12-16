import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Map_Tiles
{
    String baseString = "";
    String left1;
    String left2;
    String left3;
    String right1;
    String right2;
    String right3;
    String down1;
    String down2;
    String down3;
    String up1;
    String up2;
    String up3;
    int whichWalk = 0;
    public void act() 
    {
        background level = (background)this.getWorld();
        if (Greenfoot.isKeyDown("left")){
        if (whichWalk == 0) {
            setImage(left1);
        } else if (whichWalk == 20) {
            setImage(left2);
        } else if (whichWalk == 40) {
            setImage(left3);
        } else if (whichWalk == 60) {
            setImage(left2);
        }
        whichWalk = (whichWalk + 1) % 80;
        
        }
        else if (Greenfoot.isKeyDown("right")){
        if (whichWalk == 0) {
            setImage(right1);
        } else if (whichWalk == 20) {
            setImage(right2);
        } else if (whichWalk == 40) {
            setImage(right3);
        } else if (whichWalk == 60) {
            setImage(right2);
        }
        whichWalk = (whichWalk + 1) % 80;
        
        
        }
        else if (Greenfoot.isKeyDown("up")){
        if (whichWalk == 0) {
            setImage(up1);
        } else if (whichWalk == 20) {
            setImage(up2);
        } else if (whichWalk == 40) {
            setImage(up3);
        } else if (whichWalk == 60) {
            setImage(up2);
        }
        whichWalk = (whichWalk + 1) % 80;
        
        
        }
        else if (Greenfoot.isKeyDown("down")){
        if (whichWalk == 0) {
            setImage(down1);
        } else if (whichWalk == 20) {
            setImage(down2);
        } else if (whichWalk == 40) {
            setImage(down3);
        } else if (whichWalk == 60) {
            setImage(down2);
        }
        whichWalk = (whichWalk + 1) % 80;
        
        
        }
    }    
}
