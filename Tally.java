public class Tally {
    private int countIntrovert;
    private int countExtrovert;
    private int countOptimist;
    private int countPessimist;
    private int countMiddle;

    public Tally(int countIntrovert, int countExtrovert, int countOptimist, int countPessimist, int countMiddle){
        this.countIntrovert = countIntrovert;
        this.countExtrovert = countExtrovert;
        this.countOptimist = countOptimist;
        this.countPessimist = countPessimist;
        this.countMiddle = countMiddle;
    }

    public int getCountIntrovert(){
        return countIntrovert;
    }

    public int getCountExtrovert(){
        return countExtrovert;
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

    public void addCountInt(){
        countIntrovert++;
    }

    public void addCountExt(){
        countExtrovert ++;
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

    public void resultIE(){
        if(getCountExtrovert() >= 7){
            System.out.println("You have an extrovert personality\nTypically outgoing and enjoy socializing");
        }
        else if(getCountIntrovert() >= 7){
            System.out.println("You have an introvert personality\nTypically shy and reticent, prefer to stay at home");
        }
        else{
            System.out.println("You are somewhere in the middle of the extroversion-introversion");
        }
    }

    public void resultOP(){
        if(getCountOptimist() > getCountPessimist() && getCountOptimist() > getCountMiddle()){
            System.out.println("You are an optimist person\nYou always stay happy no matter what\nTypically outgoing and enjoy socializing");
        }
        else if(getCountMiddle()>getCountOptimist() && getCountMiddle()>getCountPessimist()){
            System.out.println("You are in between of an optimist and a pessimist\nYou are bright most of the time but also feels a bit down in feeling");
        }
        else{
            System.out.println("You are a pessimist person\nLife is one rainy day after another for you, you always expect worse result");
        }
    }

}
