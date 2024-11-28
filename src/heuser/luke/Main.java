package heuser.luke;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY",1);
    }


    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type.toUpperCase());

    }
}

public class Main {

    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 4);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 2);
        System.out.println(Arrays.toString(groceryArray));


        // The below code is the RAW use of the object type 'Object'.
        // If we do not specify a type with an ArrayList, it's using
        // the Object class by default
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Peanuts"));
        objectList.add("Pie");


        // how to specify the type for an array list
        ArrayList<GroceryItem> groceryList = new ArrayList<>();

        // The below entries add a new heuser.luke.GroceryItem at the end of the list
        groceryList.add(new GroceryItem("Peanuts"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Tea","Drink",2));
        // The entry below sets the value at index 0, Which here, replaces.
        groceryList.set(0,
                new GroceryItem("Beef", "MEAT", 1));
        groceryList.remove(1);
        System.out.println(groceryList);


    }

}
