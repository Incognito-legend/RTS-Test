import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Random_Map_Generator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Random_Map_Generator extends Map_Tiles
{
    int tile_n = 0;
    int ocean = 0;
    int forest = 0;
    int plain = 0;
    int tile_type = 0;
    int w = 0;
    int h = 0;
    int xZ = -16;
    int yZ = -16;
    boolean dirty_flag_rmg = false;
    boolean dfT = false;
    boolean System_RPTH_failed_Check = false;
    boolean System_Render_Complete = false;
    int check = 0;
    int Building_Count = 1;
    public void act() 
    {
         background Tile = (background)this.getWorld();
         if (Tile.tileGen(true))
      {
             if (tile_n < 3081)
     {
             if (w <= 79)
             {
             tile_type = getRandomNumberRange(1, 10);
             w = (w + 1) % 80;
             xZ = (xZ + 16);
             System.out.println("yZ: " + yZ + " xZ: " + xZ);
             if (xZ >= 1264){ 
                 yZ = yZ + 16;
                 xZ = 0;
                 
                 System.out.println("yZ: " + yZ + " xZ: " + xZ);
                }
             //tileGenTestRange = (tileGenTestRange + 1) % 10;
            } 
            
                if ((tile_type <= 1) && ((xZ <= 0) || (yZ <= 0)) || (xZ >= 1024 && yZ >= 608))
                {
                
                    Tile.addObject(new Forest(), xZ, yZ);
                
                    tile_n = (tile_n + 1);
                
                    System.out.println("tile total: " + tile_n);
                
                } else if ((tile_type <= 1) && (!(xZ <= 64 && yZ <= 64) || ( xZ >= 1024 && yZ >= 624)))
                { 
                
                    Tile.addObject(new Plain(), xZ, yZ);
                
                    tile_n = (tile_n + 1);
                
                    System.out.println("tile total: " + tile_n);
               }
            
               if ((tile_type >= 2) && (!(xZ <= 64 && yZ <= 64) || ( xZ >= 1024 && yZ >= 624)))
               { 
                
                   Tile.addObject(new Plain(), xZ, yZ);
                
                   tile_n = (tile_n + 1);
                
                   System.out.println("tile total: " + tile_n);
               
                }
     } else if (tile_n >= 3081){
         if (!(dirty_flag_rmg)){
         System.out.println("Render Initialization Finished!");
         
         dirty_flag_rmg = true;
        }
      if ((dirty_flag_rmg) && (!(dfT))){
            tile_type = getRandomNumberRange(1, 10);
            xZ = getRandomNumberRange(256, 1008);
            yZ = getRandomNumberRange(64, 560);
        if ((tile_type == 7) && (xZ <= 1008) && (xZ >= 256) && (yZ <= 560) && (yZ >= 64))
            {
               Tile.addObject(new TH_T1(), xZ, yZ);               
               Building_Count = 2;
               // when building count = 2, it just means theres 1 building;
            
        if (Building_Count == 2){
                System.out.println("System Render Buildings Done!");
                dfT = true;
        } else if ((Building_Count == 1) && (!(System_RPTH_failed_Check)) && (!(dfT))){
            
            System.out.println("System.Render.Player.Town_Hall Failed lotto");
            System.out.println("Restarting System.Render.Town_Hall...");
            System_RPTH_failed_Check = true;
        } 
    }
    } 
    if ((dfT) && (!(System_Render_Complete))) { 
        System.out.println("System.Render.Player.Town_Hall Finished");
        System_Render_Complete = true;
    
    }
}
        
    }    
}
}
