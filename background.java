import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.util.Date;
//import java.util.List;
public class background extends World
{
//     GreenfootImage final_Map = new GreenfootImage("Template.png");
boolean df = false;
    public background()
    {    
       
        
        // original map parameters
        super(1264, 624, 1);
        //GreenfootImage backgroundImg = new GreenfootImage("Template.png");
        
        // width of map = 1264
        
        // height of map = 624
        
        // width of map (in tiles) = 79 tiles
        
        // height of map (in tiles) = 39 tiles
        
        // individual tiles = 16px * 16px
        addObject(new Map_Tiles(), 0, 0);
        addObject(new Random_Map_Generator(), 0, 0);
    }
    

    
    public boolean tileGen(boolean tileID)
    {
        if ((tileID) && (!(df))){System.out.println("StartupProcess = " + Map_Tiles.StartupProcess); df = true;}
        else if ((!(tileID)) && (df)) { System.out.println("StartupProcess = " + Map_Tiles.StartupProcess);}
        //if (tileID) {Map_Tiles.getRandomNumberRange(x, y);
        //}
        return tileID; 
    }
    public int tileNumID(int tni)
    {
        if (tni == 1){
            
        }
        if (tni == 2){
            
        }
        if (tni == 3){
            
        }
        if (tni == 4){
            
        }
        if (tni == 5){
            
        }
        if (tni == 6){
            
        }
        return tni;
}
public int setZ(int x, int y, int z)
{
    System.out.println("Return.Parameter.x." + x + "_Return.Parameter.y." + y);
    return 0;
    
}
public int building_type(int rbt)
{
    if (rbt == 1){
        System.out.println("Return.Building.Type.Town_Hall.Spawn_Count_1");
    }
    else if (rbt == 2){
        System.out.println("Return.Building.Type.Farm.Spawn_Count_1");
        
    }
    else if (rbt == 3){
        System.out.println("Return.Building.Type.Farm.Spawn_Count_2");
    }
    else if (rbt == 4){
        System.out.println("Return.Building.Type.Farm.Spawn_Count_3");
    }
    else if (rbt == 5){
        System.out.println("Return.Building.Type.Lumbermill.Spawn_Count_1");
    }
    return 0;
}

}
//             //drawImage(GreenfootImage, int x, int y)
//             addObject(new Resources(), 0, 0);
//             addObject(new Water(), 0, 0);
//             
// //             
// //             //public void drawImage(GreenfootImage, int, int);
// //     
// //     
// //       //             BufferedImage bi = section.getImage().getAwtImage(); 
// //       
// //       //             getAwtImage means flatten all objects into one large object and as one large image like a sponge.
// //       
// //       //             File outputfile = new File(fileName);
// //       
// //       //             ImageIO.write(bi, "png", outputfile);
// //       
// //         
// //     
// //     
//                  
// //         
//     }
//     public int TileID(int TIDn){return TIDn;}
//     
// 
// 
//     
// //        public boolean Game_Start(boolean Game_Start)
// //        {
// // 
// //         return Game_Start;
// //         
// //     }
// //     
// //         public boolean PSImportC(boolean PSImportC)
// //         {
// // 
// //         return PSImportC;
// //         
// //     }
// //     
// //        public int town_hall(int town_hall)
// //        {
// //         
// //         return town_hall;
// //         
// //     }
//  
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// }







