import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Tally.IntroExtroTally;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    String name;
    int input;
    Questions question;

    
    

    @BeforeEach
    public void addInput(int input){
        this.input = input;
    }

    public int getInput(){
        return input;
    }

    public void scanUser(){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        addInput(userInput);
        sc.close();
    }

    @Test
    void choice1Test(){
        question.choice1();
        String actual = "You are a good leader";
        assertEquals("You are a good leader", actual);
    }

    @Test
    void result(){
        IntroExtroTally tally = new IntroExtroTally(7, 3, 7, 3, 0);
        Player user = new Player(name);
        ResultAll score = new ResultAll();

        score.addToList(user, tally);
        score.toString();
    }

}
