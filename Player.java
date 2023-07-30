public class Player {
    private String name;
    private String Introvert, Extrovert, IEMiddle, Optimist, Pessimist, OPMiddle;

    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public String setPersonalityIE(TallyIntroExtro IE){
        if(IE.getCountExtrovert() >= 7){
            return Extrovert;
        } else if(IE.getCountIntrovert() >= 7){
            return Introvert;        
        }else{
            return IEMiddle;        
        }
    }

    public String setPersonalityOP(TallyOptPess OP){
        if(OP.getCountOptimist() > OP.getCountPessimist() && OP.getCountOptimist() > OP.getCountMiddle())
            return Optimist;
        else if(OP.getCountMiddle()>OP.getCountOptimist() && OP.getCountMiddle()>OP.getCountPessimist())
            return OPMiddle;
        else
            return Pessimist; 
    }
}
