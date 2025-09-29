package week7.ex2;

public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change (char fromCharacter, char toCharacter){
            this.fromCharacter = fromCharacter;
            this.toCharacter = toCharacter;
    }

    public String change(String characterString){
        String result = "";

        for (int i = 0; i < characterString.length(); i++){
            char current = characterString.charAt(i);
            if (current == fromCharacter){
                result += toCharacter;
            } else {
                result += current;
            }
        }
        return result;
    }
}

