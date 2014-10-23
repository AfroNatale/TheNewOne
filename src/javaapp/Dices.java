package Javaapp;
import JavaApp.players.PlayerComp;
import javaapp.players.Human;
import javaapp.players.Player;
import java.util.Random;

public class Dices {


    public static void main(String[] args) {
        
        Player player = new PlayerComp("Komp ");
        //Human g3 = new Human();
        
        Random losowanie = new Random();
        int guess;
        int kostka;
        player.setName("");
        
        try{
            player.setName("");
            System.out.println("Imie zmienione na "+player.getName());
        }catch(IllegalArgumentException e){
            
           System.out.println(e.getMessage());
        }
        System.out.println("Imie nie moze byc puste");
           
        
        do{
        guess=player.guess();
        System.out.println("Gracz "+player.getName()+"wylosowal: "+guess);
        kostka=losowanie.nextInt(6)+1;
        System.out.println("Kostka "+kostka);
        if (kostka==guess){
            System.out.println("Udalo sie!");
            
        }else{
            System.out.println("Niestety, zla cyfra");
        }
           
        //public abstract int guess(); - metoda abstrakcyjna
        
        
    }while (kostka!=guess);
}
}