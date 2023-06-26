public class Introduction {
    
    public static void Introduction(){
        System.out.println(".\n..\n...\nloading...\nping\n");
        System.out.println("PERSONALITY IF GAME\nWelcome user, please input your name: ");
        
        //user name input prompt
        String name= System.console().readLine();
        User user = new User(name);
        System.out.println("Acknowledged, user's name is "+ user.getName() + "\n");
        
        System.out.println("A word of warning, please answer truthfully, really, TRUTHFULLY no matter what >.<");
        System.out.println("Without further ado, let me welcome you, to a new adventure. Good luck " + user.getName());
        System.out.println();
        System.out.println("Narrator: Welcome "+ user.getName());
    }
}
