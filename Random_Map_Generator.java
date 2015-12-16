import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Random_Map_Generator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Random_Map_Generator extends Map_Tiles
{
    int tile_n = -1;
    int rendered_lumbermill_parameter_check = 0;
    int rendered_farm_parameter_check = 0;
    int rendered_th_parameter_check = 0;
    int ocean = 0;
    
 
    int forest = 0;
    int plain = 0;
    int mountain = 0;
    int tile_type = 0;
    int w = 0;
    int h = 0;
    int xZ = -16;
    int yZ = -16;
    int zZ = 0;
     
    int[] map_parameters;
    int mp;
    
    int pRMR = 0;//pick random mountain range = pRMR;
    int MTIC = 0;// Mountain Type Instance Check;
    
    boolean dirty_flag_rmg = false;
    boolean dfT = false;
    boolean System_RPTH_failed_Check = false;
    boolean System_Render_Complete = false;
    boolean Lumbermill_df = false;
    boolean Farm_df = false;
    boolean param_df = false;
    int check = 0;
    int Building_Count = 1;
    int map_total_width = 79;//in tiles
    int wI = w * 16;
    int ocean_counter = 0;
    int ocean_check = 0;
    int o = 0;
    int oO = 0;
    boolean ocean_patch = false;
    boolean o_df = false;
        public int getTileAt(int x, int y){
        int i = x + wI * y;
        return map_parameters[i];
    }
    public void map_param() {
        
     map_parameters = new int[3278];
     
     map_parameters[mp] = tile_n;
     
    }
    
    public int[] return_Array() {

        int[] a =new int[10];   
        
        int b = 16;
        
            for(int i=0; i<10; i++) 
            
            {     
                
                
            a[i] = b * i;
            
            
           }
           
        return a;

    }
//     int[] data; // Declare
//     int iW = w * 16;
// public void setup() {
//   data = new int[iW]; // Create
//   data[iW] = xZ; // Assign
//   for (int i = 0; i < data.length; i++) {
//     //line(data[i], 0, data[i], 100);
// }
// }
// public static int[] addInt(int [] series, int newInt){
//     //create a new array with extra index
//     int[] newSeries = new int[series.length + 1];
// 
//     //copy the integers from series to newSeries    
//     for (int i = 0; i < series.length; i++){
//         newSeries[i] = series[i];
//     }
// //add the new integer to the last index     
//     newSeries[newSeries.length - 1] = newInt;
// 
// 
// 
//     return newSeries;
// 
//      }

    public void act() 
    {
        
         background Tile = (background)this.getWorld();
         if (Tile.tileGen(true))
      {
          if (!(o_df)){
              oO = getRandomNumberRange(1, 100);
              o = getRandomNumberRange(1, oO);}
             if (tile_n <= 3278)
     {
             if (w <= 79)
             {
             tile_type = getRandomNumberRange(1, 10);
             w = (w + 1) % 80;
             xZ = (xZ + 16);
             System.out.println("yZ: " + yZ + " xZ: " + xZ);
             if (xZ > 1264){ 
                 yZ = yZ + 16;
                 h = (h + 1) % 40;
                 xZ = 0;
                 
                 System.out.println("yZ: " + yZ + " xZ: " + xZ);
                }
             //tileGenTestRange = (tileGenTestRange + 1) % 10;
            } 
            
            if ((tile_type == 1) && (xZ <= 1008) && (xZ >= 256) && (yZ <= 560) && (yZ >= 64)){
                    
                    Tile.addObject(new Forest(), xZ, yZ);
                    forest = forest + 1;
                    tile_n = (tile_n + 1);
                
                    System.out.println("tile total: " + tile_n + " tile.forest.current." + forest);
                    
               
                                        
             }
            if (!((xZ < 1009) && (xZ > 255) && (yZ < 561) && (yZ > 63))){
                Tile.addObject(new Mountain_Range_1_p1(), xZ, yZ);
                mountain = mountain + 1;
                tile_n = (tile_n + 1);
                //                 MTIC = (MTIC + 1) % 7;
                
                
                //                 if ((MTIC == 0)){
                    //                     Tile.addObject(new Mountain_Range_1_p1(), xZ, yZ);
                    //                 } 
                    //                 if ((MTIC == 1)){
                        //                     Tile.addObject(new Mountain_Range_1_p2(), xZ, yZ);
                        //                 } 
                        //                 if ((MTIC == 2)){
                            //                     Tile.addObject(new Mountain_Range_1_p3(), xZ, yZ);
                            //                 }
                            //                 if ((MTIC == 3)){
                                //                     Tile.addObject(new Mountain_Range_1_v2_p1(), xZ, yZ);
                                //                 } 
                                //                 if ((MTIC == 4)){
                                    //                     Tile.addObject(new Mountain_Range_2_p1(), xZ, yZ);
                                    //                 } 
                                    //                 if ((MTIC == 5)){
                                        //                     Tile.addObject(new Mountain_Range_2_p2(), xZ, yZ);
                                        //                 } 
                                        //                 if ((MTIC == 6)){
                                            //                     Tile.addObject(new Mountain_Range_2_p3(), xZ, yZ);
                                            //             }
        }
            //if(Greenfoot.getRandomNumber(rate) < 1) getWorld().addObject(new Zombie(), (int) Math.round(x), (int) Math.round(y));
               
               
               if ((tile_type >= 2) && (xZ <= 1008) && (xZ >= 256) && (yZ <= 560) && (yZ >= 64))
               { 
                   
                   Tile.addObject(new Plain(), xZ, yZ);
                   plain = plain + 1;
                   tile_n = (tile_n + 1);
                
                   System.out.println("tile total: " + tile_n + " tile.plain.current." + plain);
               
                }
//                if ((!(ocean_patch)) && (xZ <= 1008) && (xZ >= 256) && (yZ <= 560) && (yZ >= 64))
//                {
// //                    tile_type = 10;
//                    if (ocean_counter == 0) {
// //                        xZ = xZ;
// //                        yZ = yZ;
//                        Tile.addObject(new Ocean(), xZ, yZ);
//                        ocean = ocean + 1;
//                    
//                        System.out.println("yZ: " + yZ + " xZ: " + xZ);
//         } else if (ocean_counter == 1) {
// //                        xZ = xZ + 16;
// //                        yZ = yZ;
//                        Tile.addObject(new Ocean(), xZ, yZ);
//                        ocean = ocean + 1;
//                    
//                        System.out.println("yZ: " + yZ + " xZ: " + xZ);
//         } else if (ocean_counter == 2) {
// //                        xZ = xZ + 16;
// //                        yZ = yZ;
//                        Tile.addObject(new Ocean(), xZ, yZ);
//                        ocean = ocean + 1;
//                    
//                        System.out.println("yZ: " + yZ + " xZ: " + xZ);
//         } else if (ocean_counter == 3) {
// //                        xZ = xZ - 32;
// //                        yZ = yZ;
//                        Tile.addObject(new Ocean(), xZ, yZ);
//                        ocean = ocean + 1;
//                   
//                        System.out.println("yZ: " + yZ + " xZ: " + xZ);
//                        ocean_check = ocean_check + 1;
//         }
//         ocean_counter = (ocean_counter + 1) % 4;
//                    //Tile.addObject(new Ship_Object(), xZ, yZ);
//                 
//                    System.out.println("tile total: " + tile_n + " tile.ocean.current." + ocean);
//                    
//                    if (ocean_check == o * 100){ ocean_patch = true; }
//                    
//     }
     
     }
     
     else if (tile_n > 3278)
     
     {
         
         if (!(dirty_flag_rmg))
         
         {
             System.out.println("tile total: " + tile_n + "_tile.forest.total." + forest);
             System.out.println("tile total: " + tile_n + "_tile.plain.total." + plain);
             System.out.println("Terrain Render Initialization Finished!");
         
             dirty_flag_rmg = true;
             
        }
        
      if ((dirty_flag_rmg) && (!(dfT)))
      
      {
          
            tile_type = getRandomNumberRange(1, 10);
            
            //xZ = getRandomNumberRange(256, 1008);
            
            //yZ = getRandomNumberRange(64, 560);
            if (!(param_df)){
            w = getRandomNumberRange(16, 63);
            System.out.println("width: " + w);
            h = getRandomNumberRange(4, 35);
            System.out.println("height: " + h);
            xZ = w * 16;
            yZ = h * 16;
            param_df = true;
        }
        if ((tile_type == 5) && (!(Farm_df)) && (xZ <= 1008) && (xZ >= 256) && (yZ <= 560) && (yZ >= 64))
        
        {
        Tile.setZ(xZ, yZ, zZ);
        
        Tile.addObject(new Farm(), xZ, yZ);
        
        rendered_farm_parameter_check = rendered_farm_parameter_check + 1;
        
        param_df = false;
        
        if (rendered_farm_parameter_check == 3)
        
        {
            
            Farm_df = true; 
            
        }
        
     }
    
        if ((tile_type == 6) && (!(Lumbermill_df)) && (xZ <= 1008) && (xZ >= 256) && (yZ <= 560) && (yZ >= 64))
    
        {
        Tile.setZ(xZ, yZ, zZ);
       
        Tile.addObject(new Lumbermill(), xZ, yZ);
               
        rendered_lumbermill_parameter_check = rendered_lumbermill_parameter_check + 1;
        
        param_df = false;
        
        if (rendered_lumbermill_parameter_check == 1)
        {
            Lumbermill_df = true; 
        }
    
     }    
        if ((tile_type == 7) && (Lumbermill_df) && (Farm_df) && (xZ <= 1008) && (xZ >= 256) && (yZ <= 560) && (yZ >= 64))
        
        {
        Tile.setZ(xZ, yZ, zZ);
        
        Tile.addObject(new TH_T1(), xZ, yZ);
        
        Building_Count = 2;
               // when building count = 2, it just means theres 1 building;
            
        param_df = false;
        
        if (Building_Count == 2){
                System.out.println("System.Render.Buildings.Done");
                dfT = true;
        } else if ((Building_Count == 1) && (!(System_RPTH_failed_Check)) && (!(dfT))){
            
            System.out.println("System.Render.Player.Town_Hall.FailedLotto");
            System.out.println("Restarting System.Render.Town_Hall...");
            System_RPTH_failed_Check = true;
        } 
     } 
    if ((dfT) && (!(System_Render_Complete))) { 
        System.out.println("System.Render.Player.Town_Hall.Finished");
        //return_Array();
        System.out.println("System.Render.Player.Ship.Initializing");
        Tile.addObject(new Concept_Art(), 632, 312); 
        System_Render_Complete = true;
    }

}
}
}
}
//Greenfoot.setWorld(new Concept_Art()); <----- this is used to change the world entirely;
// public static void main(String[] args) {
//     int[] series = new int[0];
//     int x = 5;
// 
// 
//     series = addInt(series, x);
// 
//     //print out the array with commas as delimiters
//     System.out.print("New series: ");
//     for (int i = 0; i < series.length; i++){
//         if (i == series.length - 1){
//             System.out.println(series[i]);
//         }
//         else{
//             System.out.print(series[i] + ", ");
//         }
//     }
// }
// public static int[] addInt(int [] series, int newInt){
//     //create a new array with extra index
//     int[] newSeries = new int[series.length + 1];
// 
//     //copy the integers from series to newSeries    
//     for (int i = 0; i < series.length; i++){
//         newSeries[i] = series[i];
//     }
// //add the new integer to the last index     
//     newSeries[newSeries.length - 1] = newInt;
// 
// 
// 
//     return newSeries;
// 
//      }
}