import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.util.Date;
//import java.util.List;
public class background extends World
{
//     GreenfootImage final_Map = new GreenfootImage("Template.png");
        
boolean df = false;
String Slide1_Text = "You've Entered the 1st Age!";
String Slide1_transparent_text = " ";
int Slide_check_instance = 0;
int pos_x = 1264;
int pos_y = 624;

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
        GameTransition(true);
        //addObject(new Player_Cursor_Images_(), 632, 312);
        //addObject(new Slide_1_String_Text(Slide1_Text), 632, 312);
        
    }
    
    public boolean GameTransition(boolean gt){
        if (!(gt)){
            addObject(new Player_Cursor_(), 632, 312);
            
            addObject(new Player_Cursor_Images_(), 632, 312);
        } else {
        
        }
        return gt;
    }
    
    
    
    
    public boolean setStringText(boolean S)
    {
        if (!(S)){
            if (Slide_check_instance == 0){
            addObject(new Slide_1_String_Text(Slide1_Text), 632, 512);
            S = true; Slide_check_instance = 1; System.out.println("sci = " + Slide_check_instance);
            
    }
            if (Slide_check_instance == 1){
            //clear();
            //addObject(new Slide_1_String_Text(Slide1_transparent_text), 632, 512);
            //Slide_1_String_Text.x(0);
            S = true; Slide_check_instance = 2; System.out.println("sci = " + Slide_check_instance);
            
    }
}
    return S;
}
    //public int Player_Stats_(int Player_Stamina_, int Player_Strength_, int Player_Mana_, int Player_
public int Player_Stats_(int Affinity_, int Aid_, int Attack_Speed_, int Constitution_, int Defense_, int Hp_, int Leadership_, int Level_, int Luck_, int Magic_, int Maximum_Hp_, int Movement_, int Movement_Star_, int Pursuit_Critical_Coefficient_, int Relative_Power_, int Resistance_, int Skill_, int Speed_, int Strength_, int Weapon_Level_, int Weapon_Rank_, int Weight_)
    {
        
    return 0;
    }
    
    //System.out.println("Affinity: " + Affinity_);
    
    
    
    //System.out.println("Aid: " + Aid_);
    
    
    
    //System.out.println("Attack Speed: " + Attack_Speed_);
    
    
    
    //System.out.println("Constitution: " + Constitution_);
    
    
    
    //System.out.println("Defense: " + Defense_);
    
    
    
    //System.out.println("Hp: " + Hp_);
    
    
    
    //System.out.println("Leadership: " + Leadership_);
    
    
    
    //System.out.println("Level: " + Level_);
    
    
    
    //System.out.println("Luck: " + Luck_);
    
    
    
    //System.out.println("Magic: " + Magic_);
    
    
    
    //System.out.println("Maximum Hp: " + Maximum_Hp_);
    
    
    
    //System.out.println("Movement: " + Movement_);
    
    
    
    //System.out.println("Movement_Star: " + Movement_Star_);
    
    
    
    //System.out.println("PCC: " + Pursuit_Critical_Coefficient_);
    
    
    
    //System.out.println("RP: " + Relative_Power_);
    
    
    
    //System.out.println("Resistance: " + Resistance_);
    
    
    
    //System.out.println("Skill: " + Skill_);
    
    
    
    //System.out.println("Speed: " + Speed_);
    
    
    
    //System.out.println("Strength: " + Strength_);
    
    
    
    //System.out.println("Weapon Level: " + Weapon_Level_);
    
    
    
    //System.out.println("Weapon Rank: " + Weapon_Rank_);
    
    
    
    //System.out.println("Weight: " + Weight_);
    
    //Initialization = false;
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
public void setTransparency(int t){
}
    // if t = 255, image is at full visibility
    // if t = 0, image is invisible

public int getTransparency(){
    return 0;
}
// public void setLocation(int x, int y){
//     }
// public void scroll(int dx, int dy){
//        pos_x = pos_x + dx;
//        pos_y += dy;
//        
// }
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







//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------