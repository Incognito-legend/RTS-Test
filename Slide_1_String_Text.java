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
    boolean check_ = false;
    boolean Story_Transition = true;
    //boolean Check = false;
    public Slide_1_String_Text(String text)  
    {  
        //GreenfootImage img = new GreenfootImage(text, 20, new Color(0, 0, 0), new Color(0, 0, 0, 0)); <--- black text color
    background level = (background)this.getWorld();
     if (Story_Transition)
     {
             if (!(check_))
        {
            
           
        GreenfootImage img = new GreenfootImage(text, 30, new Color(255, 251, 91), new Color(0, 0, 0, 0));
        
        //-------------------------------------(,font_size,-----------Red-Green-Blue------------
        // max value for r, g, & b is 255 
        // 255,255,255 is white
        // 0  ,0  ,0   is black
        // 255,0  ,0   is Red 100%
        // 0  ,255,0   is Green 100%
        // 0  ,0  ,255 is Blue 100%
        
        setImage(img);
        
        check_ = true;
        
    } 
    if (check_){
        if (Greenfoot.isKeyDown("Space")){
            
            Story_Transition = false;
            level.removeObject(this);
        }
    }
}
    // else if (check_){
//             if (!(Check))
//             {
//                 
//                 if (x < 25)
//                 {
//                     
//                     x = (x+1);
//                     GreenfootImage img = new GreenfootImage(text, x, new Color(255, 251, 91), new Color(0, 0, 0, 0));
//                     setImage(img);
//                 }
//                 
//             if (x == 25)
//             {
//                 
//             if (Greenfoot.isKeyDown("Space"))
//           {
//             
//             Check = true;
//            
//            //Story_Transition = false;
//           }
//           
//          } 
//         
//     
//    
// } else if (Check)
//     {
//      if (x > 0)
//      {
//          
//          x = (x-1);
//          GreenfootImage img = new GreenfootImage(text, x, new Color(255, 251, 91), new Color(0, 0, 0, 0));
//          setImage(img);
//         }
//         
//       if (x == 0)
//         {
//             
//           Story_Transition = false;
//           
//      }
//      
// }
// 
// }

//}
}

//public int zx(int X){ return X;}
//         System.out.println("String Performed Task!");

public void drawString(java.lang.String string, int x, int y)
{
}
public void setColor(java.awt.Color color)
{
}
}
