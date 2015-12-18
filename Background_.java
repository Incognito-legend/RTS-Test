import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Background_ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background_ extends Concept_Art
{
boolean Story_Transition = true;
boolean Check = false;
int t = 0;
String bg_ = "Background.png";

    public void act() 
    {
          
        if (Story_Transition){
            
            if (!(Check)){
                
            if (t < 255){
            setImage(bg_);
            t = (t+1);
            getImage().setTransparency(t);
        }
        
        if (t == 255)
        {
        
            if (Greenfoot.isKeyDown("Space"))
        {
            System.out.println("Check =" + Check);
            
            Check = true;
           
           //Story_Transition = false;
       }
        
     }
    
   
   } else if (Check){
       if (t > 0){
       setImage(bg_);
       t = (t-1);
       getImage().setTransparency(t);
       
      }
      if (t == 0){
          Story_Transition = false;
  }
}
}
    }    
}
