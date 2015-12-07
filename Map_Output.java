import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*; // (list)
import java.awt.image.*; // (BufferedImage)
import java.io.*; // (File)
import javax.imageio.*; // (ImageIo)

public class Map_Output extends World
{
    public static float midX; // The center point horizontally
    public static float midY; // The center point vertically
    public static float zDbl; // The magnification (0.00001 to 0.1, most magnified to least)
    public static int zInt; // The depth of magnification (-45 to 135)
    public static int fFactor; // The fold factor (-5000 to 5000) (* -0.0001)
    public static int gAdder; // The gravity factor (-4000 to 4000) (* 0.0005)
    public static int iAdder; // The twist factor (-4000 to 4000) (* 0.0005)
    public static int iFactor; // The stretch factor (-50000 to 50000) (* -0.001)
    public static int chgRate; // The jump factor for gravity, twist, stretch, and fold (1 to 20)
    public static int xFactor; // The translation factor (-4000 to 4000) (* 0.0005)
    
    public Map_Output()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels
        super(1264, 624, 1); 
        midX = 0;
        midY = 0;
        zDbl = (float) 0.01;
        fFactor = 10000;
        gAdder = 0;
        iAdder = 0;
        chgRate = 10;
        zInt = 0;
        iFactor = 1000;
        xFactor = 0;
    }
       private void saveImage()
    {
        List<Map_Tiles>Map_Objects = getObjects(Map_Tiles.class);
        //BufferedImage bi = Map_Objects.getImage().getAwtImage(); 
        if (Map_Objects.size() == 0) { return; }
        Map_Tiles Tile = Map_Objects.get(0);
        String fileName = "fractal_";
        if (gAdder < 0) { fileName = fileName + "r" + Integer.toString(-gAdder); }
        else { fileName = fileName + "g" + Integer.toString(gAdder); }
        if (iAdder < 0) { fileName = fileName + "o" + Integer.toString(-iAdder); }
        else { fileName = fileName + "c" + Integer.toString(iAdder); }
        if (iFactor < 0) { fileName = fileName + "t" + Integer.toString(-iFactor); }
        else { fileName = fileName + "s" + Integer.toString(iFactor); }
        if (fFactor < 0) { fileName = fileName + "d" + Integer.toString(-fFactor); }
        else { fileName = fileName + "f" + Integer.toString(fFactor); }
        if (xFactor < 0) { fileName = fileName + "n" + Integer.toString(-xFactor); }
        else { fileName = fileName + "t" + Integer.toString(xFactor); }
        if (zInt < 0) { fileName = fileName + "m" + Integer.toString(-zInt); }
        else { fileName = fileName + "z" + Integer.toString(zInt); }
        if (midX < 0) { fileName = fileName + "v" + Integer.toString((int) (-midX * 1000 + .4999)); }
        else { fileName = fileName + "x" + Integer.toString((int) (midX * 1000 + .4999)); }
        if (midY < 0) { fileName = fileName + "w" + Integer.toString((int) (-midY * 1000 + .4999)); }
        else { fileName = fileName + "y" + Integer.toString((int) (midY * 1000 + .4999)); }
        fileName = fileName + ".png";
        try
        {
            BufferedImage bi = Tile.getImage().getAwtImage();
            File outputfile = new File(fileName);
            ImageIO.write(bi, "png", outputfile);
        }
        catch (IOException e)
        {
            System.out.println("Image could not be read");
            System.exit(1);
        }
// //                 
// //               getAwtImage means flatten all objects into one
// //               
// //               large object and as one large image like a sponge.
// //               
//                  File outputfile = new File("RTS-map");
// //  
// //                 
//                  ImageIO.write(bi, "png", outputfile);


}
}