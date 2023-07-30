

public class TallyOptPess {
    private int countOptimist, countPessimist, countMiddle;

    public TallyOptPess(int countOptimist, int countPessimist, int countMiddle){
        this.countOptimist = countOptimist;
        this.countPessimist = countPessimist;
        this.countMiddle = countMiddle;
    }

    public int getCountOptimist(){
        return countOptimist;
    }

    public int getCountPessimist(){
        return countPessimist;
    }

    public int getCountMiddle(){
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

    public void resultOP(){
        if(getCountOptimist() > getCountPessimist() && getCountOptimist() > getCountMiddle())
            PersonalityTrait.OptimistTrait();
        else if(getCountMiddle()>getCountOptimist() && getCountMiddle()>getCountPessimist())
            PersonalityTrait.OPMiddleTrait();
        else
            PersonalityTrait.PessimistTrait();        
    }

}
