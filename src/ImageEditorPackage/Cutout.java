/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author Bob
 */
public class Cutout {
    
    public ArrayList<File> imagesSelected = new ArrayList<>();
    public BufferedImage img1;
    public BufferedImage result;
    public Image result_image;
    
    public void merge(int type) throws IOException
    {
        int fHeight = 0;
        int fWidth = 0;
        int x=0;
        int y=0;
        int i=0;
        BufferedImage prev = null;
        //BufferedImage croppedImage = originalImage.getSubimage(x, y, width, height);
        
        for(;i<imagesSelected.size()-1;i++)
        {
            
        }
        result = new BufferedImage(fWidth, fHeight,BufferedImage.TYPE_INT_RGB);
        result = prev;     
        
        result_image = result.getScaledInstance((int)result.getWidth()-4, (int)result.getHeight(),BufferedImage.TYPE_INT_RGB);
    }
}
