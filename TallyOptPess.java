/**
 * This class represents Optimist, Middle and Pessimist count
 */
public class TallyOptPess {
    private static int countOptimist, countPessimist, countMiddle;

    /**
     * This constructor initialises counts as object
     * @param countOptimist optimist trait count
     * @param countPessimist pessimist trait count
     * @param countMiddle middle trait count
     */
    public TallyOptPess(int countOptimist, int countPessimist, int countMiddle){
        TallyOptPess.countOptimist = countOptimist;
        TallyOptPess.countPessimist = countPessimist;
        TallyOptPess.countMiddle = countMiddle;
    }

    public static int getCountOptimist(){
        return countOptimist;
    }

    public static int getCountPessimist(){
        return countPessimist;
    }

    public static int getCountMiddle(){
        return countMiddle;
    }

    /**
     * This resets all of the counts in the constructor to 0
     */
    public static void resetCountOP(){
        TallyOptPess.countOptimist = 0;
        TallyOptPess.countPessimist = 0;
        TallyOptPess.countMiddle = 0;
    }

    public void addCountOpt(){
        countOptimist ++;
    }

    public void addCountPess(){
        countPessimist ++;
    }

    public void addCountMid(){
        countMiddle ++;
    }

    /**
     * Depending on the count in the constructor, it prints the assigned trait assessment to the player
     */
    public static void resultOP(){
        if(getCountOptimist() > getCountPessimist() && getCountOptimist() > getCountMiddle())
            PersonalityTrait.OptimistTrait();
        else if(getCountMiddle()>getCountOptimist() && getCountMiddle()>getCountPessimist())
            PersonalityTrait.OPMiddleTrait();
        else
            PersonalityTrait.PessimistTrait();        
    }
}
