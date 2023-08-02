

public class TallyOptPess {
    private static int countOptimist, countPessimist, countMiddle;

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

    public void addCountOpt(){
        countOptimist ++;
    }

    public void addCountPess(){
        countPessimist ++;
    }

    public void addCountMid(){
        countMiddle ++;
    }

    public static void resultOP(){
        if(getCountOptimist() > getCountPessimist() && getCountOptimist() > getCountMiddle())
            PersonalityTrait.OptimistTrait();
        else if(getCountMiddle()>getCountOptimist() && getCountMiddle()>getCountPessimist())
            PersonalityTrait.OPMiddleTrait();
        else
            PersonalityTrait.PessimistTrait();        
    }

}
