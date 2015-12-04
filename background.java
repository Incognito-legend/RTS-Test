import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*; // (list)
import java.awt.image.*; // (BufferedImage)
import java.io.*; // (File)
import javax.imageio.*; // (ImageIo)

public class background extends World
{
    GreenfootImage final_Map = new GreenfootImage("Template.png");
    public background()
    {    
        
        super(600, 400, 1);// original map parameters
        //super(1264, 624, 1);
        
        // width of map = 1264
        
        // height of map = 624
        
        // width of map (in tiles) = 79 tiles
        
        // height of map (in tiles) = 39 tiles
        
        // individual tiles = 16px * 16px

            //drawImage(GreenfootImage, int x, int y)
            addObject(new Resources(), 0, 0);
            addObject(new Water(), 0, 0);
            
//             
//             //public void drawImage(GreenfootImage, int, int);
//     
//     
//       //             BufferedImage bi = section.getImage().getAwtImage(); 
//       
//       //             getAwtImage means flatten all objects into one large object and as one large image like a sponge.
//       
//       //             File outputfile = new File(fileName);
//       
//       //             ImageIO.write(bi, "png", outputfile);
//       
//         
//     
//     
//                 BufferedImage bi = final_Map.getImage().getAwtImage(); 
//                 
//               //getAwtImage means flatten all objects into one
//               
//               //large object and as one large image like a sponge.
//               
//                 File outputfile = new File("RTS-map");
//  
//                 
//                 ImageIO.write(bi, "png", outputfile);
//         
    }
    public int TileID(int TIDn){return TIDn;}
    


    
//        public boolean Game_Start(boolean Game_Start)
//        {
// 
//         return Game_Start;
//         
//     }
//     
//         public boolean PSImportC(boolean PSImportC)
//         {
// 
//         return PSImportC;
//         
//     }
//     
//        public int town_hall(int town_hall)
//        {
//         
//         return town_hall;
//         
//     }

















}







