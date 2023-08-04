

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

    public static void resetCountIE(){
        TallyIntroExtro.countIntrovert = 0;
        TallyIntroExtro.countExtrovert = 0;
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

    // public static String setPersonalityIE(){
    //     if(getCountExtrovert() >= 7){
    //         return "Extrovert";
    //     } else if(getCountIntrovert() >= 7){
    //         return "Introvert";        
    //     }else{
    //         return "Intro-Extro middle";        
    //     }
    // }

    
}
