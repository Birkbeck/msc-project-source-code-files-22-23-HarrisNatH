public class Result {
    private TallyIntroExtro tallyIE;
    private TallyOptPess tallyOP;
    private Player user;

    public Result(Player user, TallyIntroExtro tallyIE, TallyOptPess tallyOP){
        this.user = user;
        this.tallyIE = tallyIE;
        this.tallyOP = tallyOP; 
    }

    @Override
    public String toString(){
        return user.getName() + ", Traits: " + user.setPersonalityIE(tallyIE) + ", " + user.setPersonalityOP(tallyOP);
    }
}
