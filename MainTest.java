import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void traitResultIntrovert(){
        TallyIntroExtro IE = new TallyIntroExtro(7, 3);
        assertEquals(IE.resultIE(), PersonalityTrait.IntrovertTrait());
    }

    @Test
    void displayInfo(){
        PlayerList score = new PlayerList();
        score.addPlayer("Har");
        score.addPlayer("Any");
        String expected = "\n   Har\n   Traits: Introvert, OPMiddle\n   Any\n   Traits: Extrovert, Pessimist";
        assertEquals(expected, score.toString());
    }


}
