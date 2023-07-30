public class Main{
    
    public static void main(String[]args){

        //constructors
        QuestionBank Qbank = new QuestionBank();
        TallyIntroExtro tallyIE = new TallyIntroExtro(0, 0);
        TallyOptPess tallyOP = new TallyOptPess(0, 0, 0);
        Player user = new Player(null);
        Result result = new Result(null, tallyIE, tallyOP);
        ResultAll score = new ResultAll();

        boolean finished=false;
        while(!finished){
            System.out.println("CHOOSE A NUMBER: \n   1. Start\n   2. Display All Results\n   3. Exit\n");
            int input = Integer.parseInt(System.console().readLine());
            switch (input){
                case 1:
                    // introduction
                    Introduction.StartUp();
        
                    //opening
                    System.out.println("Narrator: It has been 10 years since you've arrived in a strange world,"+ 
                        "similar to Earth in medieval era but it has magic and monsters.\n"+
                        "You have climbed in ranks as an A class adventurer and you currently has a crush on another adventurer\n");
                    System.out.println("Narrator: From there onwards, please choose one number that is relatable for you");
                    
                    Qbank.Process();
                    
                    
                    // questions.choice1();
                    // questions.choice2();
                    // questions.choice3();
                    // questions.choice4();
                    // questions.choice5();
                    // questions.choice6();
                    // questions.choice7();
                    // questions.choice8();
                    // questions.choice9();
                    // questions.choice10();
                    // questions.choice11();
                    // questions.choice12();
                    // questions.choice13();
                    // questions.choice14();
                    // questions.choice15();
                    // questions.choice16();
                    // questions.choice17();
                    // questions.choice18();
                    // questions.choice19();
                    // questions.choice20();

                    //after Q19
                    System.out.println("\nYou accepted happily for your promotion, then you run back to home and shares the news with your crush\n\nYou both move to the capital city for a brand new adventures\n\nMany decades later, You are retired and has happy life, on your bed, you close your eyes...\n");
                    
                    //after Q20
                    System.out.println("--------------------T H E  E N D--------------------");

                    //RESULT
                    System.out.println("\nHope you enjoy your adventure!\nThen I will tell the result of the choices you have made: ");
                    System.out.println("Between Extrovert and Introvert, the result is: ");
                    tallyIE.resultIE();

                    System.out.println("\nBetween Optimist and Pessimist, the result is: ");
                    tallyOP.resultOP();

                    // System.out.println("\nFinally, last questions regarding your experience");
                    // System.out.println("How true is your Extrovert-Introvert personality result?\n(Please input either true or false)");
                    // String IEAssessment = System.console().readLine();
                    
                    // System.out.println("\nHow true is your Optimist-Pessimist personality result?\n(Please input either true or false)");
                    // String OPAssessment = System.console().readLine();

                    // result.Experience(IEAssessment, OPAssessment);
                    break;

                case 2:
                    System.out.println(score);
                    break;
                
                case 3:
                    System.out.println("Thank you for participating");
                    finished=true;

                default :
                    System.out.println("Please choose one of the options!");

            }
        }
    }
}
