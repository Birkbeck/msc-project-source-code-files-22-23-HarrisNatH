import java.util.ArrayList;

/**
 * This class represents an ArrayList of the Player class, to handle different players' objects
 */
public class PlayerList {
    ArrayList<Player> players;

    /**
     * This Constructor is to initialise Player class as arrayList
     */
    public PlayerList(){
        this.players = new ArrayList<>();
    }

    /**
     * boolean check to prevent duplicate by iterating name to every element in the PlayerList
     * @param name Player's name input
     * @return true if there is a duplicate name
     * @return false if there is no duplicate
     */
    public boolean isPlayerNameTaken (String name) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * boolean check to prevent any numbers mixed in the name.
     * @param name Player's name input
     * @return false if there is a number in the name
     * @return true if the name is all letters
     */
    public boolean containsOnlyLetters (String name) {
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * This method utilises the is.Empty(), containsOnlyLetters() and isPlayerNameTaken() check methods
     * <p> To prevent number, empty, and or duplicate name input from the player 
     */
    public void addPlayer() {
        System.out.println("\nHold on, Player please tell us your name!");
        boolean nameValid = false;
        while (!nameValid) {
            String user = System.console().readLine().trim();

            if (user.isEmpty()) {
                System.out.println("\nSorry, name cannot be empty. Please give another name:");
            } else if (containsOnlyLetters(user) && !isPlayerNameTaken(user)) {
                Player newPlayer = new Player(user);
                players.add(newPlayer);
                System.out.println("\n" + user + ", thank you for saving the world, and don't forget us!");
                nameValid = true;
            } else {
                System.out.println("\nSorry, " + user + " is already taken or is invalid. Please give another name:");
            }
        }
    }

    @Override
    public String toString(){
        if(players.isEmpty()){
            return "Sorry! the Players' record is empty!";
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

