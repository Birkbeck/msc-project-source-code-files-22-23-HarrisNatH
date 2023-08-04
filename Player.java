public class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public static String setPersonalityIE(){
        if(TallyIntroExtro.getCountExtrovert() >= 7){
            return "Extrovert";
        } else if(TallyIntroExtro.getCountIntrovert() >= 7){
            return "Introvert";        
        }else{
            return "Intro-Extro middle";        
        }
    }

    public static String setPersonalityOP(){
        if(TallyOptPess.getCountOptimist() > TallyOptPess.getCountPessimist() && TallyOptPess.getCountOptimist() > TallyOptPess.getCountMiddle())
            return "Optimist";
        else if(TallyOptPess.getCountMiddle()>TallyOptPess.getCountOptimist() && TallyOptPess.getCountMiddle()>TallyOptPess.getCountPessimist())
            return "Optimist-Pessimist middle";
        else
            return "Pessimist"; 
    }

    //this point experiment 
    public String displayInfo(){
        return getName() + ", Traits: " + setPersonalityIE() + ", " + setPersonalityOP();
    }
}
