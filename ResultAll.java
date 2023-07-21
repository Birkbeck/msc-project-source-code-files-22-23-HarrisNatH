import java.util.ArrayList;

public class ResultAll {
    ArrayList<Result> results;

    public ResultAll(){
        this.results = new ArrayList<>();
    }

    public void addToList(Tally tally, User user ){
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
