
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
import java.util.*;  
import java.io.FileReader;  
import java.io.IOException;

public class DOABUSINESS implements PyramidInterface{
     public List <PojoPyrmaid> readPyramidFromCsv(String FileName){
         List<PojoPyrmaid>Pyramds=new ArrayList();
         try( BufferedReader br=new BufferedReader(new FileReader(FileName))){
          String Line = br.readLine();
          if(Line != null){
              Line = br.readLine();
          }
          while(Line != null){
          String[]attributes=Line.split(",");
          PojoPyrmaid pyr =Createpyramid(attributes);
           Pyramds.add(pyr);
           Line =br.readLine();
      }
          }
         catch(IOException ioe){
         ioe.printStackTrace();
         }
     
         return Pyramds;
     }
    public PojoPyrmaid Createpyramid(String[] metadata){
           double  height=0;
           String modern_name=metadata[2];
           String pharaon=metadata[0];
           String site=metadata[4];
           if(metadata[7]!=null &&metadata[7].length()>0){
               height=Double.parseDouble(metadata[7]);
              }
           return new PojoPyrmaid(height, modern_name, pharaon,site);
           
          }
    
    //sort the pyramids
   public List<PojoPyrmaid> SortPyrmaid( List<PojoPyrmaid>Pyramds){
   
   Pyramds.sort(Comparator.comparingDouble(PojoPyrmaid::getheight));
   return Pyramds; 
   
   }
   
   public Map<String, Integer> SiteMap(List<PojoPyrmaid>Pyramds){
         
         Map<String, Integer> Sites=new HashMap<>();
          for(PojoPyrmaid p:Pyramds){
       
             String site=p.getsite();
             Integer num=Sites.get(site);
             if(num==null){
                  num=1;
                        }
             else{
                num++;
             }  
             Sites.put(site,num);
       }
        return Sites;
   }
}
