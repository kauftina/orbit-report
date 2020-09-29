package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem>listOfDishes;
    private Date lastUpdated;

    public Menu() {
        //this.lastUpdated = new ArrayList<>();
        this.lastUpdated = new Date();


    }
    public void add(MenuItem m) {
        if(!listOfDishes.contains(m));
        listOfDishes.add(m);
        this.lastUpdated = new Date();
        }

}
