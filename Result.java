public class Result {
    private Tally tally;
    private User user;
    private String Introvert, Extrovert, IEMiddle, Optimist, Pessimist, OPMiddle;

    public Result(Tally tally, User user){
        this.tally = tally;
        this.user = user;
    }

    public String IntroExtro(){
        if(tally.getCountExtrovert() >= 7){
            return Extrovert;
        } else if(tally.getCountIntrovert() >= 7){
            return Introvert;        
        }else{
            return IEMiddle;        
        }
    }

    public String OptPess(){
        if(tally.getCountOptimist() > tally.getCountPessimist() && tally.getCountOptimist() > tally.getCountMiddle()){
            return Optimist;        
        } else if(tally.getCountMiddle()>tally.getCountOptimist() && tally.getCountMiddle()>tally.getCountPessimist()){
            return OPMiddle;
        } else{
            return Pessimist;        
        }
    }

    public static String (String IEAssessment){

    }

    @Override
    public String toString(){
        return user.getName() + " : " + IntroExtro() + ", " + OptPess();
    }
}
