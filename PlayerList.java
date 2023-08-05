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

    public boolean containsOnlyLetters (String name) {
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public void addPlayer() {
        System.out.println("\nHold on, Player please tell us your name!");
        boolean nameValid = false;
        while (!nameValid) {
            String user = System.console().readLine();
            
            if (containsOnlyLetters(user) && !isPlayerNameTaken(user)) {
                Player newPlayer = new Player(user);
                players.add(newPlayer);
                System.out.println("\n" + user + ", thank you for saving the world, and don't forget us!");
                nameValid = true;
            } else {
                System.out.println("\nSorry, " + user + " is already taken.");
                System.out.println("Please give another name:");
            }
        }
    }

    @Override
    public String toString(){
        if(players.isEmpty()){
            return "Sorry! the Players' record empty!";
        }
        else{
            System.out.println("The Players' Record:");
            String print = ""; 
            for(Player item : players) { 
                print += item.displayInfo() + "\n";
            }
            return print;
        }
    }
}

