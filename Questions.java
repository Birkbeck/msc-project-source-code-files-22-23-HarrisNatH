import java.util.Scanner;

public class Questions {
    public int input;

    public void addInput(int input){
        this.input = input;
    }

    //constructor
    Tally tally = new Tally(0, 0, 0, 0);

    public int getInput(){
        return input;
    }
    //scanner method
    public void scanUser(){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        addInput(userInput);
        sc.close();
    }

    public void choice1(){
        System.out.println("Narrator: From there onwards, please choose one number that is relatable for you");
        System.out.println("You wake up, and see your reflection in mirror, do you see yourself as:\n1. A leader for your party\n2. A lone adventurer");
        scanUser();
        while(getInput()==1 || getInput()==2){
            if (getInput() == 1){
                System.out.println("   \"You are a good leader\"");
                tally.addCountExt();
            } else{
                System.out.println("   \"You are very shy, aren't you?\"");
                tally.addCountInt();
            }
        } System.out.println("Invalid number");
    }
}
