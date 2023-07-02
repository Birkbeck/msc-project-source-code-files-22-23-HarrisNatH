import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Questions question;
    Tally tally = new Tally(0, 0, 0, 0, 0);
    public int input;

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
    }

}
