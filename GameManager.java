/**
 * This class is the centre of all classes. <p>
 * Manages the game flow by initializing the QuestionBank, handles presenting questions to the player, 
 * collects and stores their answers, calculates scores, and displays the results.
 */
public class GameManager {

    //constructors
    QuestionBank Qbank = new QuestionBank();
    PlayerList players = new PlayerList();

    public void GameStart(){
        boolean finished = false;
        while(!finished){
            try{
                //Title Intro    
                FrameBorder.printTitleIntro();
                System.out.println("\nWelcome Player to IF (Interactive Fiction) game.\nA word of warning, please answer truthfully, really TRUTHFULLY no matter what.\nIt's all for your assessment accuracy :)\n");
                MessageDelayer.waiting();

                //Menu Intro
                System.out.println("MENU (CHOOSE A NUMBER): \n   1. Start\n   2. Display All Results\n   3. Exit\n");
                int input = Integer.parseInt(System.console().readLine());
                switch (input){
                    case 1:
                        System.out.println("\nWelcome, You who transmigrated to another world, your second life begins.");
                
                        //Opening
                        System.out.println("\nNarrator: \n   It has been 10 years since you've arrived in a strange world,"+ 
                            " similar to Earth in medieval era but it has magic and monsters.\n"+
                            "   You have climbed in ranks as an A class adventurer and you currently has a crush on another adventurer.\n");
                        System.out.println("   From there onwards, please choose one number that is relatable for you.");
                        MessageDelayer.waiting();
                        Qbank.Process();
                        
                        //after Questioning
                        System.out.println("\n--------------------T H E  E N D--------------------");

                        //RESULT
                        System.out.println("\nHope you enjoy your adventure!\nThen I will tell the result of the choices you have made: ");
                        System.out.println("\nBetween Extrovert and Introvert, the result is: ");
                        TallyIntroExtro.resultIE();

                        System.out.println("\nBetween Optimist and Pessimist, the result is: ");
                        TallyOptPess.resultOP();

                        MessageDelayer.waiting();

                        //Player name input
                        players.addPlayer();
                        
                        //Reset count for score constructors
                        TallyIntroExtro.resetCountIE();
                        TallyOptPess.resetCountOP();
                        break;

                    case 2:
                        //calling the PlayerList toString()
                        System.out.println(players);
                        MessageDelayer.waiting();
                        break;
                    
                    case 3:
                    // end of program
                        System.out.println("Thank you for participating");
                        finished=true;
                        break;

                    default :
                        System.out.println("Please choose one of the options!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid, please input a number\n");
            }
        }
    }
}
