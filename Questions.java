public class Questions {

    //constructor
    TallyIntroExtro IE = new TallyIntroExtro(0, 0);
    TallyOptPess OP = new TallyOptPess(0, 0, 0);

    public void QuestionEI(String narative, String ExtrovertChoice, String IntrovertChoice){
        boolean finished = false;
        while (!finished){
            try {
                System.out.println(narative);
                int userInput = Integer.parseInt(System.console().readLine());
                if (userInput == 1){
                    System.out.println(ExtrovertChoice);
                    IE.addCountExt();
                    finished=true;
                } else if (userInput == 2){
                    System.out.println(IntrovertChoice);
                    IE.addCountInt();
                    finished=true;
                } else 
                    System.out.println("Invalid number!\n");
            } catch (NumberFormatException e) {
                System.out.println("Invalid, please input a number\n");
            }
        }
    }

    public void QuestionIE(String narative, String ExtrovertChoice, String IntrovertChoice){
        boolean finished = false;
        while (!finished){
            try {
                System.out.println(narative);
                int userInput = Integer.parseInt(System.console().readLine());
                if (userInput == 1){
                    System.out.println(IntrovertChoice);
                    IE.addCountInt();
                    finished=true;
                } else if (userInput == 2){
                    System.out.println(ExtrovertChoice);
                    IE.addCountExt();
                    finished=true;
                } else 
                    System.out.println("Invalid number\n");
            } catch (NumberFormatException e) {
                System.out.println("Invalid, please input a number\n");
            } 
        }
    }

    public void QuestionOP(String narative, String choice1, String choice2, String choice3){
        boolean finished = false;
        while (!finished){
            try{
                System.out.println(narative);
                int userInput = Integer.parseInt(System.console().readLine());
                if (userInput == 1){
                    System.out.println(choice1);
                    OP.addCountOpt();
                    finished=true;
                } else if (userInput == 2){
                    System.out.println(choice2);
                    OP.addCountMid();
                    finished=true;
                } else if (userInput == 3){
                    System.out.println(choice3);
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
