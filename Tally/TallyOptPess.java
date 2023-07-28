package Tally;

public class TallyOptPess {
    private int countOptimist, countPessimist, countMiddle;
    private String Optimist, Pessimist, OPMiddle;
    PersonalityTrait trait;

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
            trait.OptimistTrait();
        else if(getCountMiddle()>getCountOptimist() && getCountMiddle()>getCountPessimist())
            trait.OPMiddleTrait();
        else
            trait.PessimistTrait();        
        }


    //For result list 
    public String OptPess(TallyIntroExtro tally){
        if(getCountOptimist() > getCountPessimist() && getCountOptimist() > getCountMiddle()){
            return Optimist;        
        } else if(getCountMiddle()> getCountOptimist() && getCountMiddle()>getCountPessimist()){
            return OPMiddle;
        } else{
            return Pessimist;        
        }
    }

}
