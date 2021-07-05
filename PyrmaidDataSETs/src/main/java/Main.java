/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */

import java.io.BufferedReader;
import java.util.*;  
import java.io.FileReader;  
import java.io.IOException;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DOABUSINESS DOA =new DOABUSINESS();
        // TODO code application logic here
      List<PojoPyrmaid>py=DOA.readPyramidFromCsv("C:\\Users\\asmaa\\Downloads\\archive\\pyramids.csv");
     
       int i=0;
       for(PojoPyrmaid p:py){
       
        System.out.println("#"+(i++)+p);
       
       }
       System.out.println(DOA.SortPyrmaid(py));
       System.out.println(DOA.SiteMap(py));
       
//        HashMap<String, List<PojoPyrmaid>>pyramidssMap=DOA.createdMap(py);
//        System.out.println(pyramidssMap);
//  
//        
//              String File_Name="C:\\Users\\asmaa\\OneDrive\\Desktop\\iti\\java\\Day4\\dataset\\Cities.csv";
//        List<PojoPyrmaid> sortedpyramid=DOA.sortedpyramid(pyramidssMap);
//        System.out.println(sortedpyramid);


  
        
        
        
    }
    
}

//Map<String,Integer>Countbysite=new  LinkedHashMap<>();
//        
//          for(PojoPyrmaid p:py){
//              String site=p.getsite();
//              Integer count=Countbysite.get(site);
//              System.out.println(Countbysite.get(site));
//              if(count==null){
//              
//               count=1;
//              }
//              else{
//              count ++;
//             }
//           Countbysite.put(site,count);
//          }
//          System.out.println(Countbysite);