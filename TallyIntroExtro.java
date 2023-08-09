/**
 * This class represents Introvert and Extrovert count
 */
public class TallyIntroExtro {
    private static int countIntrovert, countExtrovert;

    /**
     * This constructor initialises counts as object
     * @param countIntrovert introvert trait count
     * @param countExtrovert extrovert trait count
     */
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

    /**
     * This resets all of the counts in the constructor to 0
     */
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
    
    /**
     * Depending on the count in the constructor, it prints the assigned trait assessment to the player
     */
    public static void resultIE(){
        if(getCountExtrovert() ==0 && getCountIntrovert() == 0)
            System.out.println("You haven't taken a test");
        else if(getCountExtrovert() >= 7)
            PersonalityTrait.ExtrovertTrait();
        else if(getCountIntrovert() >= 7)
            PersonalityTrait.IntrovertTrait();
        else
            PersonalityTrait.IEMiddleTrait();
    }
}
