/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class PojoPyrmaid {
    private double  Height;
    private String Modern_Name;
    private String Pharaon;
    private String Site;
    
     public PojoPyrmaid(double height,String modern_name, String pharaon,String site){
        this.Height=height;
        this.Modern_Name=modern_name;
        this.Pharaon=pharaon;
        this.Site=site;
     }
        
     public void setheight(double  height){ 
          this.Height=height;
                                          }
     public double  getheight(){ 
       return Height;
                               }  
     public void setmodern_name(String modern_name){ 
          this.Modern_Name=modern_name;
                                          }
     public String getmodern_name(){
             return Modern_Name;
     }
     public void setPharaon(String pharaon){ 
          this.Pharaon=pharaon;
                                          }
     public String getpharaon(){
             return Pharaon;
     }
     public void setsite(String site){ 
          this.Site=site;
                                          }
     public String getsite(){
             return Site;
     }
     @Override
    public String toString() {
        return "PojoPyrmaid{" +
                "Height='" + Height + '\'' +
                ",Modern_Name='" + Modern_Name + '\'' +
                ", Pharaon='" + Pharaon + '\'' +
                ", Site=" + Site +
                '}';
    }
    
    
    
}
    
