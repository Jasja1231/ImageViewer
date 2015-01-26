/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.imageio.ImageIO;

/**
 *
 * @author Bob
 */
public class Cutout {
    
    public ArrayList<File> imagesSelected = new ArrayList<>();
    public BufferedImage img;
    public BufferedImage result;
    public Image result_image;
    
    public void cut(int number, int type) throws IOException
    {
        boolean loop = true;
        int counter =0;
        
        int maxHeight = 0;
        int width=0;
        for(int i=0;i<imagesSelected.size()-1;i++)
            {
                img = ImageIO.read(imagesSelected.get(i));
                width = width + img.getWidth();
                if(img.getHeight()>maxHeight)
                    maxHeight=img.getHeight();
            }
        
        int x=0, xx=0;
        
        BufferedImage result;
        result = new BufferedImage(width, maxHeight, BufferedImage.TYPE_INT_ARGB);
	Graphics2D g = result.createGraphics();
	
        int maxSlides = imagesSelected.size()*number;
        
        Vector<Integer> vectorForWidth = new Vector<>();
        while(loop)
        {
            
            for(int i=0;i<imagesSelected.size()-1;i++)
            {
                int strHeight;
                int strWidth;
                
                img = ImageIO.read(imagesSelected.get(i));
                strHeight=img.getHeight();
                strWidth = img.getWidth()/number;
                vectorForWidth.add(strWidth);
                        
                BufferedImage temp;
                temp = img.getSubimage(x, 0, strWidth, strHeight);
                
                g.drawImage(temp, xx, 0, strWidth, strHeight, null);
                counter++;
                
                xx=xx+strWidth; 
            }
            for(int i=0;i<imagesSelected.size()-1;i++)
            {
                x = x + vectorForWidth.get(i);
            }
            if(counter==maxSlides)
                break;
            }
        g.dispose();
        result_image = result.getScaledInstance((int)result.getWidth()-4, (int)result.getHeight(),BufferedImage.TYPE_INT_RGB);
        }
        
    }
