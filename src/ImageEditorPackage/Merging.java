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
import javax.imageio.ImageIO;


/**
 *
 * @author Bob
 */
public class Merging extends imagePanel {
    
    //imagePanel n = new imagePanel();
    public ArrayList<File> imagesSelected = new ArrayList<>();
    public BufferedImage img1;
    public BufferedImage img2;
    public BufferedImage result;
    public Image result_image;
    
    
    public Merging() {
        
    }
    
   
    public void merge(int type) throws IOException
    {
        int fHeight = 0;
        int fWidth = 0;
        int x=0;
        int y=0;
        int i=0;
        int counter=0;
        BufferedImage prev = null;
        
        for(;i<imagesSelected.size()-1;i++)
        {
            if(i==0)
            {
                img1 = ImageIO.read(imagesSelected.get(i));
            }
            else{
                img1 = prev;
            }
            img2= ImageIO.read(imagesSelected.get(i+1));
            
            //Resizing our images------------------------
            if(img1.getWidth()>img2.getWidth())
                fWidth = img1.getWidth();
            else fWidth = img2.getWidth();
            
            if(img1.getHeight()>img2.getHeight())
                fHeight = img1.getHeight();
            else fHeight = img2.getHeight();
            int typ = img1.getType() == 0? BufferedImage.TYPE_INT_ARGB : img1.getType();
            img1 = resize(img1,fHeight,fWidth,typ);
                typ = img2.getType() == 0? BufferedImage.TYPE_INT_ARGB : img2.getType();
            img2 = resize(img2,fHeight,fWidth,typ);
            //--------------------------------------------
            //Merging part--------------------------------
            BufferedImage tempres1 = new BufferedImage(fWidth, fHeight,BufferedImage.TYPE_INT_RGB);
            for(int k=0;k<fWidth;k++)
            {
                for(int l=0;l<fHeight;l++)
                {
                   int c1 = img1.getRGB(k, l);
                   int c2 = img2.getRGB(k, l);
                   int cres=0;
                   
                   cres = funcToUse(c1,c2, type);
                   tempres1.setRGB(k,l,cres);
                }
                counter++;
            }
            prev = tempres1;
        }
        result = new BufferedImage(fWidth, fHeight,BufferedImage.TYPE_INT_RGB);
        result = prev;     
        
        result_image = result.getScaledInstance((int)result.getWidth()-4, (int)result.getHeight(),BufferedImage.TYPE_INT_RGB);
    }
    private static BufferedImage resize(BufferedImage originalImage, int H,int W, int typ){
	BufferedImage resizedImage = new BufferedImage(W, H, typ);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, W, H, null);
	g.dispose();
 
	return resizedImage;
    }
/*    @Override
    public void resize(int x, int y)
    {
        Image img21 = (BufferedImage)img1.getScaledInstance(x, y, Image.SCALE_AREA_AVERAGING);
        Image img22 = (BufferedImage)img2.getScaledInstance(x, y, Image.SCALE_AREA_AVERAGING);  
    }*/
    private int funcToUse(int c1, int c2, int type)
    {
        int cres=0;
        if(type==0)
                   {
                       cres = AND(c1,c2);
                   }
                   if(type==1)
                   {
                       cres = OR(c1,c2);
                   }
                   if(type==2)
                   {
                       cres = XOR(c1,c2);
                   }
        return cres;
    }
    private int OR(int c1, int c2)
    {
        if(c1>c2)
            return c1;
        else return c2;
    }
    private int XOR(int c1, int c2)
    {
        if(c1>c2)
            return c1-c2;
        else if(c2>c1) return c2-c1;
        else return c1;
    }
    private int AND(int c1, int c2)
    {
        if(c1>c2)
            return c2;
        else return c1;
    }
    
    
    
    
}
