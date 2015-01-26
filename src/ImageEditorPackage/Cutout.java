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
public class Cutout extends Merging {
    
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
        for(int i=0;i<imagesSelected.size();i++)
            {
                img = ImageIO.read(imagesSelected.get(i));
                width = width + img.getWidth();
                if(img.getHeight()>maxHeight)
                    maxHeight=img.getHeight();
            }
        int maxWidth = 0;
        int height=0;
        for(int i=0;i<imagesSelected.size();i++)
            {
                img = ImageIO.read(imagesSelected.get(i));
                height = height + img.getHeight();
                if(img.getWidth()>maxWidth)
                    maxWidth=img.getWidth();
            }
        for(int i=0;i<imagesSelected.size();i++)
            {
                img = ImageIO.read(imagesSelected.get(i));
                if(type==1)
                img = resize(img,maxWidth,img.getHeight(),BufferedImage.TYPE_INT_ARGB);
                else img = resize(img,img.getWidth(),maxHeight,BufferedImage.TYPE_INT_ARGB);
                ImageIO.read(imagesSelected.get(i));
            }

            
        int x=0, xx=0;
        int y=0, yy=0;
        int p=0;
        if(type==1)
            p=1;
        
        BufferedImage result;
        if(p==1)
        result = new BufferedImage(maxWidth, height, BufferedImage.TYPE_INT_ARGB);
        else result = new BufferedImage(width, maxHeight, BufferedImage.TYPE_INT_ARGB);
	Graphics2D g = result.createGraphics();
	
        int maxSlides = imagesSelected.size()*number;
        Vector<Integer> vectorForWidth = new Vector<>();
        
        for(int i=0;i<imagesSelected.size();i++)
            {
                vectorForWidth.add(0);
            }
        //Main loop of the function
        while(loop)
        {
            for(int i=0;i<imagesSelected.size();i++)
            {
                int strHeight;
                int strWidth;
                
                img = ImageIO.read(imagesSelected.get(i));
                if(p==1)
                {
                    strHeight=img.getHeight()/number;
                    strWidth = img.getWidth();
                }
                else {
                    strWidth = img.getWidth()/number;
                    strHeight=img.getHeight();
                    }
                        
                BufferedImage temp;
                if(p==1)
                {
                    if(y==0)
                        temp = img.getSubimage(x, y, strWidth, strHeight);
                    else {
                        y=vectorForWidth.get(i);
                        temp = img.getSubimage(x, y, strWidth, strHeight);
                        }
                }
                else{
                    if(x==0)
                        temp = img.getSubimage(x, y, strWidth, strHeight);
                    else {
                        x=vectorForWidth.get(i);
                        temp = img.getSubimage(x, y, strWidth, strHeight);
                        }
                }
                
                g.drawImage(temp, xx, yy, strWidth, strHeight, null);
                counter++;
                
                if(p==1)
                {
                    vectorForWidth.set(i,vectorForWidth.get(i)+ strHeight);
                    yy=yy+strHeight; 
                }
                else {
                    vectorForWidth.set(i,vectorForWidth.get(i)+ strWidth);
                    xx=xx+strWidth; 
                }
                if(p==1)    
                    y++;  
                else x++;
            }
            
            if(counter==maxSlides)
                break;
            }
        g.dispose();
        result_image = result.getScaledInstance((int)result.getWidth()-4, (int)result.getHeight(),BufferedImage.TYPE_INT_RGB);
        }
        
    private static BufferedImage resize(BufferedImage originalImage, int H,int W, int typ){
	BufferedImage resizedImage = new BufferedImage(W, H, typ);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, W, H, null);
	g.dispose();
 
	return resizedImage;
    }
    }
