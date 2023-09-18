import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class MainTest {
    PlayerList list= new PlayerList();
    
    //test to print out border
    @Test
    void testBorder(){
        String response = "hello Player";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        FrameBorder.printResponse(response);
        System.setOut(System.out);
        String actual = outputStream.toString().trim();
        String expected = "------------------\n" + "hello Player\n" + "------------------";
        assertEquals(expected, actual);
    }

    //test to print response if playerlist is empty
    @Test
    void ifPlayersIsEmpty(){
        String actual = list.toString();
        String expected = "Sorry! the Players' record is empty!";
        assertEquals(expected, actual);
    }

    //test to print false if the String contains number
    @Test
    void nameIgnoreCase(){
        String name = "Harr234is";
        boolean containsOnlyLetters =true;
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                containsOnlyLetters = false;
                break;
            } 
        }
        assertEquals(false, containsOnlyLetters);
    }

    //test to print false if the String is empty or space
    @Test
    void emptySpaceAsName(){
        String user = "";
        boolean isSpace = true;
        if(user.isEmpty()) {
            isSpace = true;
        } else{ isSpace = false; }
        assertEquals(true, isSpace);
    }

    @Test
    void isListEmpty(){
        ArrayList<String> test = new ArrayList<>();
        boolean listEmpty = true;
        if(test.isEmpty()){
            listEmpty = true;
        } else { listEmpty = false; }
        assertEquals(true, listEmpty);
    }

    //test to print out the assessmnet result
    @Test
    void IETrait1 (){
        TallyIntroExtro test = new TallyIntroExtro(7, 0);
        TallyOptPess test2 = new TallyOptPess(3, 5, 2);
        Player player = new Player("Experiment");
        String expected = "\n   Experiment\n   Traits: Introvert, Pessimist";
        assertEquals(expected, player.displayInfo()); 
    }

    @Test
    void IETrait2 (){
        TallyIntroExtro test = new TallyIntroExtro(4, 6);
        TallyOptPess test2 = new TallyOptPess(0, 3, 7);
        Player player = new Player("Experiment");
        String expected = "\n   Experiment\n   Traits: Intro-Extro middle, Optimist-Pessimist middle";
        assertEquals(expected, player.displayInfo()); 
    }

    //test to print exception if the number intered is text
    public static void numberException(String text){
        try {
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
        }
    }

    @Test
    void invalidInput(){
        MainTest.numberException("test");
    }
}
