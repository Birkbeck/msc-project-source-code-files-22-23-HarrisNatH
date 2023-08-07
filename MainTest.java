// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

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

    @Test
    void ifPlayersIsEmpty(){
        PlayerList list= new PlayerList();
        String actual = list.toString();
        String expected = "Sorry! the Players' record is empty!";
        assertEquals(expected, actual);
    }


}
