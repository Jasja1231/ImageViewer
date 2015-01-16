/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditorPackage;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Jaryna
 */
class GenericExtFilter implements FilenameFilter {
    private final String[] ext;
    
    public GenericExtFilter(String[] ext) {
            this.ext = ext;
        }
    
    @Override
    public boolean accept(File dir, String name) {
        for(String sub : ext){
            if(name.endsWith(sub)== true){
             return true;
            }
        }
        return false;
    }
}
