

public class TallyIntroExtro {
    private int countIntrovert, countExtrovert;

    public TallyIntroExtro(int countIntrovert, int countExtrovert){
        this.countIntrovert = countIntrovert;
        this.countExtrovert = countExtrovert;
    }

    public int getCountIntrovert(){
        return countIntrovert;
    }

    public int getCountExtrovert(){
        return countExtrovert;
    }

    public void addCountInt(){
        countIntrovert++;
    }

    public void addCountExt(){
        countExtrovert ++;
    }
    
    public void resultIE(){
        if(getCountExtrovert() >= 7)
            PersonalityTrait.ExtrovertTrait();
        else if(getCountIntrovert() >= 7)
            PersonalityTrait.IntrovertTrait();
        else
            PersonalityTrait.IEMiddleTrait();
    }

    

    //For result list 
    // public String IntroExtro(TallyIntroExtro tally){
    //     if(tally.getCountExtrovert() >= 7){
    //         return Extrovert;
    //     } else if(tally.getCountIntrovert() >= 7){
    //         return Introvert;        
    //     }else{
    //         return IEMiddle;        
    //     }
    // }

}
