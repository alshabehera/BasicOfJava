/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currenttime;

/**
 *
 * @author DELL
 */
public class CurrentTime {

  
    public static long currentTimeMillis(){
        long duration=10000;//10millisecond
         long starttime= System.currentTimeMillis();
         long endtime= starttime+duration;
         while(starttime<endtime){
             System.out.println("Alsha Behera");
             starttime= System.currentTimeMillis();
         }
         return 0;
    }
    public static void main(String[] args) {
     currentTimeMillis();  
      
    }
    
}
