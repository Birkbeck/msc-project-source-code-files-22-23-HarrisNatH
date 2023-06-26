public class Main{
    static Questions question;
    
    public static void main(String[]args){
        //introduction
        Introduction.Introduction();

        //opening
        System.out.println("Narrator: It has been 10 years since you've arriced in a strange world,"+ 
            "similar to Earth in medieval era but it has magic and monsters. "+
            "You have climbed in ranks as an A class adventurer and you currently has a crush on another adventurer\n");
        
        
        question.choice1();

    }
}