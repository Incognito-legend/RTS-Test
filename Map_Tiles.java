import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Doodad_Tiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map_Tiles extends Actor
{
    String baseString = "";
    String RGTileType;
    String RGBTileType;
    String TH_T1;
    String TH_T2;
    String TH_T3;
    String TH_T4;
    String TH_T5;
    String TH_T6;
    String TH_T7;
    public static boolean StartupProcess = false;
    public void act() 
    {
        
        background Tile = (background)this.getWorld();
        if (!(Tile.tileGen(StartupProcess))){
            
//         Tile.addObject(new TH_T2_tile1(), 624, 312);
//         Tile.addObject(new TH_T2_tile2(), 640, 312);
//         Tile.addObject(new TH_T2_tile3(), 656, 312);
//         Tile.addObject(new TH_T2_tile4(), 624, 328);
//         Tile.addObject(new TH_T2_tile5(), 640, 328);
//         Tile.addObject(new TH_T2_tile6(), 656, 328);
//         Tile.addObject(new TH_T2_tile7(), 624, 344);
//         Tile.addObject(new TH_T2_tile8(), 640, 344);
//         Tile.addObject(new TH_T2_tile9(), 656, 344); 
        StartupProcess = true;
        Tile.tileGen(StartupProcess);
    }
}
        public static int getRandomNumberRange(int start, int end){
    int normal = Greenfoot.getRandomNumber(end-start+1);
    return normal+start;
}
}
