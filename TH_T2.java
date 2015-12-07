import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TH_T2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TH_T2 extends Map_Tiles
{
    int tiletype;
    int t = 0;
    int xZ;
    int yZ;
    public void act() 
    {
         background Tile = (background)this.getWorld();
         if (Tile.tileGen(true)){
             if (t <= 9){
             tiletype = getRandomNumberRange(1, 100);
             System.out.println("tile # = " + tiletype);
             if (tiletype <= 50){
             t++;
             if (t == 1){ Tile.addObject(new TH_T2_tile1(), 624, 312); }
             else if (t == 2){ Tile.addObject(new TH_T2_tile2(), 640, 312); }
             else if (t == 3){ Tile.addObject(new TH_T2_tile3(), 656, 312); }
             else if (t == 4){ Tile.addObject(new TH_T2_tile4(), 624, 328); }
             else if (t == 5){ Tile.addObject(new TH_T2_tile5(), 640, 328); }
             else if (t == 6){ Tile.addObject(new TH_T2_tile6(), 656, 328); }
             else if (t == 7){ Tile.addObject(new TH_T2_tile7(), 624, 344); }
             else if (t == 8){ Tile.addObject(new TH_T2_tile8(), 640, 344); }
             else if (t == 9){ Tile.addObject(new TH_T2_tile9(), 656, 344); }

             //tileGenTestRange = (tileGenTestRange + 1) % 10;
            }else if (51 < tiletype || tiletype <= 60)
            { 
                Tile.addObject(new Ocean(), xZ, yZ);}
         else if (60 < tiletype || tiletype <= 75){ Tile.addObject(new Forest(), xZ, yZ); }
         else if (75 < tiletype || tiletype <= 100){ Tile.addObject(new Plain(), xZ, yZ); }
        }
    }    
}
}
