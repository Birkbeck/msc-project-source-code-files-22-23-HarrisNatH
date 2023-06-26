public class Tally {
    private int countIntrovert;
    private int countExtrovert;
    private int countOptimist;
    private int countPessimist;

    public Tally(int countIntrovert, int countExtrovert, int countOptimist, int countPessimist){
        this.countIntrovert = countIntrovert;
        this.countExtrovert = countExtrovert;
        this.countOptimist = countOptimist;
        this.countPessimist = countPessimist;
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

}
