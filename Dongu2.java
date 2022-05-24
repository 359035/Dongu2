/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dongu2;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class Dongu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,toplam=0;
        
        do{
            Scanner inp=new Scanner(System.in);
            System.out.print("Sayi giriniz:");
            i=inp.nextInt();
            if(i%4==0){
                toplam+=i;
                
            }
            
        }while(i%2==0);
        
        System.out.println("Sonlandi");
        System.out.println("Toplam:"+toplam);
        
        
    }
    
}
