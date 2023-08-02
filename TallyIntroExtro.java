

public class TallyIntroExtro {
    private static int countIntrovert, countExtrovert;

    public TallyIntroExtro(int countIntrovert, int countExtrovert){
        TallyIntroExtro.countIntrovert = countIntrovert;
        TallyIntroExtro.countExtrovert = countExtrovert;
    }

    public static int getCountIntrovert(){
        return countIntrovert;
    }

    public static int getCountExtrovert(){
        return countExtrovert;
    }

    public void addCountInt(){
        countIntrovert++;
    }

    public void addCountExt(){
        countExtrovert ++;
    }
    
    public static void resultIE(){
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
