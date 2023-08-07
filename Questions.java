/**
 * This class represents the methods needed to transform given parameters into a question
 * <p> Also initialises constructors TallyIntroExtro and TallyOptPess to count player's choices
 */
public class Questions {

    //constructor
    TallyIntroExtro IE = new TallyIntroExtro(0, 0);
    TallyOptPess OP = new TallyOptPess(0, 0, 0);

    /**
     * This pre-setup method takes in parameters and assigns each to its respective places.
     * <p> For every choice chosen, its count raises by 1.
     * @param narative question for players
     * @param ExtrovertChoice Extrovert response if the player choose this choice
     * @param IntrovertChoice Introvert response if the player choose this choice
     */
    public void QuestionEI(String narative, String ExtrovertChoice, String IntrovertChoice){
        boolean finished = false;
        while (!finished){
            try {
                System.out.println(narative);
                int userInput = Integer.parseInt(System.console().readLine());
                if (userInput == 1){
                    FrameBorder.printResponse(ExtrovertChoice);
                    IE.addCountExt();
                    finished=true;
                } else if (userInput == 2){
                    FrameBorder.printResponse(IntrovertChoice);
                    IE.addCountInt();
                    finished=true;
                } else 
                    System.out.println("Invalid number!\n");
            } catch (NumberFormatException e) {
                System.out.println("Invalid, please input a number\n");
            }
        }
    }

    /**
     * This pre-setup method takes in parameters and assigns each to its respective places.
     * <p>For every choice chosen, its count raises by 1.
     * @param narative question for players
     * @param ExtrovertChoice Extrovert response if the player choose this choice
     * @param IntrovertChoice Introvert response if the player choose this choice
     */
    public void QuestionIE(String narative, String ExtrovertChoice, String IntrovertChoice){
        boolean finished = false;
        while (!finished){
            try {
                System.out.println(narative);
                int userInput = Integer.parseInt(System.console().readLine());
                if (userInput == 1){
                    FrameBorder.printResponse(IntrovertChoice);
                    IE.addCountInt();
                    finished=true;
                } else if (userInput == 2){
                    FrameBorder.printResponse(ExtrovertChoice);
                    IE.addCountExt();
                    finished=true;
                } else 
                    System.out.println("Invalid number\n");
            } catch (NumberFormatException e) {
                System.out.println("Invalid, please input a number\n");
            } 
        }
    }

    /**
     * This pre-setup method takes in parameters and assigns each to its respective places.
     * <p> For every choice chosen, its count raises by 1.
     * @param narative question for players
     * @param choice1 Optimist response if the player choose this choice
     * @param choice2 Middle response if the player choose this choice
     * @param choice3 Pessimist response if the player choose this choice
     */
    public void QuestionOP(String narative, String choice1, String choice2, String choice3){
        boolean finished = false;
        while (!finished){
            try{
                System.out.println(narative);
                int userInput = Integer.parseInt(System.console().readLine());
                if (userInput == 1){
                    FrameBorder.printResponse(choice1);
                    OP.addCountOpt();
                    finished=true;
                } else if (userInput == 2){
                    FrameBorder.printResponse(choice2);
                    OP.addCountMid();
                    finished=true;
                } else if (userInput == 3){
                    FrameBorder.printResponse(choice3);
                    OP.addCountPess();
                    finished=true;
                }else
                    System.out.println("Invalid number\n");
            } catch (NumberFormatException e) {
                System.out.println("Invalid, please input a number\n");
            }
        }
    }
}
