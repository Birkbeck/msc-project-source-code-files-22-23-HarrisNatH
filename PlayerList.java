import java.util.ArrayList;

public class PlayerList {
    ArrayList<Player> players;

    public PlayerList(){
        this.players = new ArrayList<>();
    }

    public boolean isPlayerNameTaken (String name) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void addPlayer(){
        boolean nameValid = false;
        while(!nameValid){
            String user= System.console().readLine();
            if (!isPlayerNameTaken(user)) {
                Player newPlayer = new Player(user);
                players.add(newPlayer);
                System.out.println("\nPlayer " + user + " created.");
                System.out.println("Let me welcome you, to a new adventure. Good luck " + user);
                nameValid = true;
            } else {                                                       
                System.out.println("\nSorry, " + user + " is already taken.");
                System.out.println("Please input another name:");      
            }
        }
    }

    @Override
    public String toString(){
        if(players == null){
            System.out.println("Sorry! no score saved yet");
        }

        String print = ""; 
        for(Player item : players) { 
            print += item.displayInfo() + "\n";
        }
        return print;
        
    }
}

