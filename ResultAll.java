import java.util.ArrayList;

public class ResultAll {
    ArrayList<Result> results;

    public ResultAll(){
        this.results = new ArrayList<>();
    }

    public void addToList(String name, String traitIE, String traitOP){
        Result newResult = new Result(name, traitIE, traitOP);
        results.add(newResult);
    }
    
    @Override
    public String toString(){
       String print = ""; 
        for(Result item : results) { 
            print += item.displayInfo() + "\n";
        }
        return print;
    }
}
