import java.util.ArrayList;

import Tally.IntroExtroTally;

public class ResultAll {
    ArrayList<Result> results;

    public ResultAll(){
        this.results = new ArrayList<>();
    }

    public void addToList(Player user, IntroExtroTally tally){
        Result newResult = new Result(tally, user);
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
