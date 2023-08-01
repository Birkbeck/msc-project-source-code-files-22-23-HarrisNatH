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
        ResultAll score = new ResultAll();
        score.addToList("Har", "Introvert", "OPMiddle");
        score.addToList("Any", "Extrovert", "Pessimist");
        String expected = "Har, Traits: Introvert, OPMiddle\nAny, Traits: Extrovert, Pessimist";
        assertEquals(expected, score.toString());
    }


}
