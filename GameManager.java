
public class GameManager {

    //constructors
    QuestionBank Qbank = new QuestionBank();
    ResultAll score = new ResultAll();
    PlayerList players = new PlayerList();

    public void GameStart(){
        System.out.println("WELCOME TO INTERACTIVE PERSONALITY IF GAME\n");
        System.out.println("A word of warning, please answer truthfully, really TRUTHFULLY no matter what.\nIt's for your accurate assessment\n");

        boolean finished = false;
        while(!finished){
            System.out.println("MENU (CHOOSE A NUMBER): \n   1. Start\n   2. Display All Results\n   3. Exit\n");
            int input = Integer.parseInt(System.console().readLine());
            switch (input){
                case 1:
                    System.out.println(".\n..\n...\nloading...\nping");
                    System.out.println("\nWelcome user, please input your name: ");
                    
                    //user name input prompt
                    
                    players.addPlayer();
                        
                    
                    // String name= System.console().readLine();
                    // Player user = new Player(name);
                    // System.out.println("Acknowledged, user's name is "+ user.getName() + "\n");
                    
                    // System.out.println("Without further ado, let me welcome you, to a new adventure. Good luck " + user.getName());
                    // System.out.println();
                    // System.out.println("Narrator: Welcome "+ user.getName());
        
                    //opening
                    System.out.println("Narrator: It has been 10 years since you've arrived in a strange world,"+ 
                        "similar to Earth in medieval era but it has magic and monsters.\n"+
                        "You have climbed in ranks as an A class adventurer and you currently has a crush on another adventurer\n");
                    System.out.println("Narrator: From there onwards, please choose one number that is relatable for you");
                    
                    // Qbank.Process();
                    
                    //after Q20
                    System.out.println("--------------------T H E  E N D--------------------");

                    //RESULT
                    System.out.println("\nHope you enjoy your adventure!\nThen I will tell the result of the choices you have made: ");
                    System.out.println("\nBetween Extrovert and Introvert, the result is: ");
                    TallyIntroExtro.resultIE();

                    System.out.println("Between Optimist and Pessimist, the result is: ");
                    TallyOptPess.resultOP();

                    //test score DELETE LATER
                    System.out.println(TallyIntroExtro.getCountExtrovert()+", "+ TallyIntroExtro.getCountIntrovert());
                    System.out.println(TallyOptPess.getCountOptimist()+", "+ TallyOptPess.getCountMiddle()+", "+ TallyOptPess.getCountPessimist());
                    
                    //Assign player's result to resultAll list
                    // score.addToList(name, Player.setPersonalityIE(), Player.setPersonalityOP());

                    //reset count for constructors
                    TallyIntroExtro.resetCountIE();
                    TallyOptPess.resetCountOP();
                    break;

                case 2:
                    System.out.println(score);  
                    break;
                
                case 3:
                    System.out.println("Thank you for participating");
                    finished=true;
                    break;

                default :
                    System.out.println("Please choose one of the options!");
            }
        }
    }
}
