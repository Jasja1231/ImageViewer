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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bob
 */
public class Merging_Directories extends Merging {
    
    public ArrayList<ArrayList<File>> foldersWithImages = new ArrayList<>();
    public ArrayList<Image> resultDir;
    public ArrayList<BufferedImage> resultDirr;
    
    
    void mergeDir(int type){
        int num = 0;
        resultDir = new ArrayList<Image>();
        while(true)
        {
            int check =0;
            Merging SingleMerge = new Merging();
            //Checking all the directories for the picture with a number num
            for(int i=0;i<foldersWithImages.size();i++)
            {
                if(foldersWithImages.get(i).size()>=num)
                {
                    SingleMerge.imagesSelected.add(foldersWithImages.get(i).get(num));
                }
                else check++;
            }
            //Check if we can merge and all folders
            if(check>=foldersWithImages.size()-1)
            {
                break;
            }
            //Merging of images that he have found
            try {
                SingleMerge.merge(type);
            } catch (IOException ex) {
                Logger.getLogger(Merging_Directories.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image tempimg = SingleMerge.result_image;
            BufferedImage result = SingleMerge.result;
            
            resultDirr.add(result);
            resultDir.add(tempimg);
            num++;
        }
        
        
    }
}
