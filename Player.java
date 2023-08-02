public class Player {
    private String name;
    private String Introvert, Extrovert, IEMiddle, Optimist, Pessimist, OPMiddle;

    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public String setPersonalityIE(){
        if(TallyIntroExtro.getCountExtrovert() >= 7){
            return Extrovert;
        } else if(TallyIntroExtro.getCountIntrovert() >= 7){
            return Introvert;        
        }else{
            return IEMiddle;        
        }
    }

    public String setPersonalityOP(){
        if(TallyOptPess.getCountOptimist() > TallyOptPess.getCountPessimist() && TallyOptPess.getCountOptimist() > TallyOptPess.getCountMiddle())
            return Optimist;
        else if(TallyOptPess.getCountMiddle()>TallyOptPess.getCountOptimist() && TallyOptPess.getCountMiddle()>TallyOptPess.getCountPessimist())
            return OPMiddle;
        else
            return Pessimist; 
    }
}
