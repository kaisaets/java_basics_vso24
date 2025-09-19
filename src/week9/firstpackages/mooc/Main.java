package week9.firstpackages.mooc;
import week9.firstpackages.mooc.logic.ApplicationLogic;
import week9.firstpackages.mooc.ui.UserInterface;
import week9.firstpackages.mooc.ui.TextUserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
