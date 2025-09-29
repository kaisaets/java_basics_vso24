package week7.ex2;

import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes;

    public Changer (){
        changes = new ArrayList<>();
    }

    public void addChange (Change change){
        changes.add(change);
    }

    public String change (String characterString){
        String result = characterString;

        for (Change change: changes){
            result = change.change(result);
        }
        return result;
    }
}
