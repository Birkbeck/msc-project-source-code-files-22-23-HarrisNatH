import Tally.IntroExtroTally;
import Tally.TallyOptPess;

public class Result {
    private IntroExtroTally tallyIE;
    private TallyOptPess tallyOP;
    private Player user;

    public Result(Player user, IntroExtroTally tallyIE, TallyOptPess tallyOP){
        this.user = user;
        this.tallyIE = tallyIE;
        this.tallyOP = tallyOP; 
    }

    @Override
    public String toString(){
        return user.getName() + " : " + tally.IntroExtro(new IntroExtroTally(0, 0)) + ", " + tally.OptPess(new TallyOptPess(0, 0, 0));
    }
}
