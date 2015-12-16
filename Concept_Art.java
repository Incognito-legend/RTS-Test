import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Concept_Art here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Concept_Art extends Actor
{

boolean Story_Transition = true;
boolean Slide_1 = false;

boolean Slide_2 = true;
boolean Slide_3 = true;
boolean Slide_4 = true;
boolean Slide_5 = true;
boolean Slide_6 = true;
boolean Slide_7 = true;
boolean Slide_8 = true;
boolean Slide_9 = true;
boolean Slide_10 = true;
int t = 0;

    String baseString = "";
    String Slide1 = "Yavanna and her Maiar.jpg";
    String Slide2 = "The Maiar.jpg";
    String Slide3 = "No-one Can Match My Strength.jpg";
    String Slide4 = "Melkor Character Design Concept.jpg";
    String Slide5 = "King of Kings.jpg";
    String Slide6 = "War.jpg";
    String Slide7 = "Melkor the Prime Dark Lord & Sauron the Deceiver.jpg";
    String Slide8 = "Melkor, Luthien Tenuviel, Sauron.jpg";
    String Slide9 = "Faenor and his Son.jpg";
    String Slide10 = "Sauron the Deceiver.jpg";
    
    // text strings
    String Slide1_Text = "You've Entered the 1st Age!";
    
    public void act()
    {    
    
        if (Story_Transition){
            
            if (!(Slide_1)){
                
            if (t < 255){
            setImage(Slide7);
            t = (t+1);
            getImage().setTransparency(t);
        }
        
        if (t == 255)
        {
       drawString(Slide1_Text, 632, 412);
            if (Greenfoot.isKeyDown("Space"))
        {
            System.out.println("Slide_1 =" + Slide_1);
           Slide_1 = true;
           //Story_Transition = false;
       }
        
     }
    
   
   }
}
}
public void setTransparency(int t){
}
    // if t = 255, image is at full visibility
    // if t = 0, image is invisible

public int getTransparency(){
    return 0;
}
public void drawString(java.lang.String string, int x, int y){
}
}
