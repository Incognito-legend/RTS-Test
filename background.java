import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    boolean World_Start = false;
    boolean Game_Start = false;
    boolean Player_Start = false;
    boolean Ci = false;
    // castle initialization
    boolean Fi = false;
    // farm initialization
    boolean Vi = false;
    // village initialization
    boolean Mi = false;
    // merchant initialization
    boolean Li = false;
    
    
    
    
    boolean castle_df = false;
    public background()
    {    
        super(600, 400, 1); 
        // width of map = 1248
        // height of map = 624
        if (!(World_Start))
        
        {
            
            addObject(new Player_(), 200, 300);
            addObject(new Objects(), 0, 0);
            addObject(new Castles(), 0, 0);
            World_Start = true;
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        else if (World_Start)
        
        {
            
        }
        
    }
    
       public boolean Game_Start(boolean Game_Start)
       {
        if (Game_Start)
        
        {
            
           World_Start = true;
           
        }
        
        else if (!(Game_Start))
        
        {
            
           
            
        }
        
        return Game_Start;
        
    }
    
        public boolean PSImportC(boolean PSImportC)
        {
        if (PSImportC)
        
        {
            
           Player_Start = true;
           
        }
        
        else if (!(PSImportC))
        
        {
            
        
            
        }
        
        return PSImportC;
        
    }
       public int town_hall(int town_hall){
           if (!(Ci)){
               if (castle_df){
               System.out.println("Construction Commencing for Town hall Tier " + town_hall);
               castle_df = false;
               Ci = true;
            }
        }
           if ((Ci) && (town_hall == 0)){
               town_hall = 1;
               Ci = false;
               castle_df = true;
               System.out.println(town_hall);
        }
           else if ((Ci) && (town_hall == 1)){
               town_hall = 2;
               Ci = false;
               castle_df = true;
               System.out.println(town_hall);
        }
           else if ((Ci) && (town_hall == 2)){
               town_hall = 3;
               Ci = false;
               castle_df = true;
               System.out.println(town_hall);
        }
           else if ((Ci) && (town_hall == 3)){
               town_hall = 4;
               Ci = false;
               castle_df = true;
               System.out.println(town_hall);
        }
           else if ((Ci) && (town_hall == 4)){
               town_hall = 5;
               Ci = false;
               castle_df = true;
               System.out.println(town_hall);
        }
           else if ((Ci) && (town_hall == 5)){
               town_hall = 6;
               Ci = false;
               castle_df = true;
               System.out.println(town_hall);
        }
           else if ((Ci) && (town_hall == 6)){
               town_hall = 7;
               Ci = false;
               castle_df = true;
               System.out.println(town_hall);
        }
        return town_hall;
}

















}







