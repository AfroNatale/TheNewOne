package javaapp.players;


public abstract class Player{
    private String name;
    
    public Player(){
    this.name ="Anonim";
}
public Player(String name){
    if(name !=null && !name.isEmpty()){
    this.name=name;
    
    }else{
        this.name="Anonim";
    }
}
public void setName(String name){
    if(name!= null&& !name.isEmpty()){
        this.name=name;
    }

}
public String getName(){
    
    return name;
}

public abstract int guess();
}