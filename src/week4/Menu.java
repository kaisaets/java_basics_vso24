package week4;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal (String meal) {

        if (!this.meals.contains(meal)) {
        this.meals.add(meal);
        }
    }

    public void printMeals(){
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        this.meals.clear();
    }

    public static void main(String[] args) {

        Menu menu = new Menu();
        //Ex 76.1
        menu.addMeal("Hamburger");
        menu.addMeal("Fish'n'Chips");
        menu.addMeal("Sauerkraut");
        menu.addMeal("Hamburger"); // test duplicate
        //Ex 76.2
        menu.printMeals();
        //Ex 76.3
        menu.clearMenu();
        menu.printMeals();
    }
}
