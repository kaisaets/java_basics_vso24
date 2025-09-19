package week9.firstpackages.mooc.logic;

import week9.firstpackages.mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes){
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            ui.update();
        }
    }
}
