package javaapp.players;

import java.util.Scanner;
public class Human extends Player{

    @Override
    public int guess(){
        
     Scanner sc = new Scanner(System.in);
     
     int i = sc.nextInt();
     
        return i;
      
    }
    
}