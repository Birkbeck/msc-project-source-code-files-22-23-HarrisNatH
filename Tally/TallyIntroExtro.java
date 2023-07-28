package Tally;

public class TallyIntroExtro {
    private int countIntrovert, countExtrovert;
    private String Introvert, Extrovert, IEMiddle;
    PersonalityTrait trait;

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
            trait.ExtrovertTrait();
        else if(getCountIntrovert() >= 7)
            trait.IntrovertTrait();
        else
            trait.ExtrovertTrait();
    }

    //For result list 
    public String IntroExtro(IntroExtroTally tally){
        if(tally.getCountExtrovert() >= 7){
            return Extrovert;
        } else if(tally.getCountIntrovert() >= 7){
            return Introvert;        
        }else{
            return IEMiddle;        
        }
    }

}
