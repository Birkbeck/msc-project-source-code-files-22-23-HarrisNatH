/**
 * This class represents each player
 */
public class Player {
    private String name;
    private String traitIE;
    private String traitOP;
    
    /**
     * This constructor contains player's name and traits obtained after calculation
     * @param name player's name
     */
    public Player(String name){
        this.name = name;
        this.traitIE = setPersonalityIE();
        this.traitOP = setPersonalityOP();
    }
    
    public String getName(){
        return name;
    }

    public String getTraitIE(){
        return traitIE;
    }

    public String getTraitOP(){
        return traitOP;
    }

    /**
     * This method takes in the TallyIntroExtro counts
     * @return a Trait string to be tied to Player's object
     */
    private String setPersonalityIE(){
        if(TallyIntroExtro.getCountExtrovert() >= 7)
            return "Extrovert";
        else if(TallyIntroExtro.getCountIntrovert() >= 7)
            return "Introvert";        
        else
            return "Intro-Extro middle";        
    }

    /**
     * This method takes in the TallyOptPess counts
     * @return a Trait string to be tied to Player's object
     */
    private String setPersonalityOP(){
        if(TallyOptPess.getCountOptimist() > TallyOptPess.getCountPessimist() && TallyOptPess.getCountOptimist() > TallyOptPess.getCountMiddle())
            return "Optimist";
        else if(TallyOptPess.getCountMiddle()>TallyOptPess.getCountOptimist() && TallyOptPess.getCountMiddle()>TallyOptPess.getCountPessimist())
            return "Optimist-Pessimist middle";
        else
            return "Pessimist"; 
    }

    public String displayInfo(){
        return  "\n   " + getName() + "\n   Traits: " + getTraitIE() + ", " + getTraitOP();
    }
}
