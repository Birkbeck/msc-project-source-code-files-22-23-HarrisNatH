import java.util.ArrayList;

public class ResultAll {
    ArrayList<Result> results;

    public ResultAll(){
        this.results = new ArrayList<>();
    }

    public void addToList(Player user, TallyIntroExtro tallyIE, TallyOptPess tallyOP){
        Result newResult = new Result(user, tallyIE, tallyOP);
        results.add(newResult);
    }
    
    @Override
    public String toString(){
       String print = ""; 
        for(Result item : results) { 
            print += item.toString() + "\n";
        }
        return print;
    }
}
