public class User {
    private String name;
    
    public User(String name){
        this.name = name;
    }

    public String assignName(String input){
        return this.name = input;
    }

    public String getName(){
        return this.name;
    }
}
