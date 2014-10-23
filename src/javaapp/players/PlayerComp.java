package JavaApp.players;
import java.util.Random;
import javaapp.players.Player;

public class PlayerComp extends Player{
    
    Random losowanie = new Random();
    
    public PlayerComp(){
        
    }
    public PlayerComp(String name){
        super(name);
    }
   @Override
    public int guess(){
        
        
        
        int gracz = losowanie.nextInt(6)+1;
        
        return gracz;
    }
}