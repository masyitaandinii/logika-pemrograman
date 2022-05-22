/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refreshing2;

import java.util.Scanner;

/**
 *
 * @author MASTER 10
 */
public class Refreshing2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        
        System.out.println("Input bilangan a = ");
        a = input.nextInt();
        
        if(a%2==0){
            System.out.println("Genap");
        }else {
            System.out.println("Ganjil");
        }
        
    }
    
}
