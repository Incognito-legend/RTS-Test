import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 

/**
 * Write a description of class Player_Cursor_ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Cursor_ extends Actor
{
     String c1_;
     String c2_;
     String c3_;
     String c4_;
     String c5_;
     int counter = 1;
     int x = 632;
     int y = 312;
     
    public void act() 
    
    {          
    background level = (background)this.getWorld();
    if (Greenfoot.isKeyDown("a")){
        move(5);
    }
       if ((!(Greenfoot.isKeyDown("a"))) && (!(Greenfoot.isKeyDown("w"))) && (!(Greenfoot.isKeyDown("s"))) && (!(Greenfoot.isKeyDown("d")))){
       if(counter == 1) {
           setImage(c1_);
        }      else if (counter == 250) {
           setImage(c2_);            
        }      else if (counter == 500) {
           setImage(c3_);
        }      else if (counter == 750) {
           setImage(c4_);
        }      else if (counter == 1000) {
           setImage(c5_);           
        }
        counter = (counter + 1) % 1250;
    }
    

   
    } 
    
    
    
    Player_Cursor_ getActor(){return this;}
    int getButton(){return 0;}
    int getClickCount(){return 0;}
    
    
    
    public void setLocation(int x, int y){
     
    }
    public void move(int distance){
    }
    public void setRotation(int rotation){
    }
    // rotation - The rotation in degrees
    // set the rotation of this actor. Rotation is expressed as a degree value, range(0 to 359) {(0..359). Zero Degrees is to the east (right-hand side of the world), and the angle increases clockwise.
    
}