public class Result {
    // private TallyIntroExtro tallyIE;
    // private TallyOptPess tallyOP;
    // // private Player user;
    private String name;
    private String traitIE;
    private String traitOP;


    public Result(String name, String traitIE, String traitOP){
        this.name = name;
        this.traitIE = traitIE;
        this.traitOP = traitOP; 
    }

    public String getName(){
        return this.name;
    }

    public String getTraitIE(){
        return this.traitIE;
    }

    public String getTraitOP(){
        return this.traitOP;
    }

    public String displayInfo(){
        return getName() + ", Traits: " + getTraitIE() + ", " + getTraitOP();
    }
}
