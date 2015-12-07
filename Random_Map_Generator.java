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
    int xZ = 0;
    int yZ = 0;
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
                 xZ = 0; 
                 System.out.println("yZ: " + yZ + " xZ: " + xZ);
                }
             //tileGenTestRange = (tileGenTestRange + 1) % 10;
            } 
            if (h <= 39)
            {
            tile_type = getRandomNumberRange(1, 10);
            h = (h + 1) % 40;
            yZ = (yZ + 16);
            System.out.println("yZ: " + yZ + " xZ: " + xZ);
            
            if (yZ >= 624){
                yZ = 0; 
                System.out.println("yZ: " + yZ + " xZ: " + xZ);
            }
        }
            if (tile_type <= 1)
            {
                Tile.addObject(new Forest(), xZ, yZ);
                tile_n = (tile_n + 1);
                System.out.println("tile total: " + tile_n);
                
            }
            
            if (tile_type >= 2)
            { 
                Tile.addObject(new Plain(), xZ, yZ);
                tile_n = (tile_n + 1);
                System.out.println("tile total: " + tile_n);
            }
     } else if (tile_n == 3081){
         System.out.println("Render Finished!");
        }
    }    
}
}
