package heuser.luke;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {


        String[] items = {"apples", "bananas", "milk", "eggs"};
        // The code below is using a factory method:
        // This is a static method call on a class that returns a
        // new instanceOf 'something' back.
        // In this case, it returns a list of String elements back which
        // is then assigned to a list variable.
        // ****
        // In short, this factory method transformed an array of String,
        // to a list of String
        // ****
        List<String> list = List.of(items);
        // The code below causes an exception because the list created is immutable
        //list.add("yogurt");
        System.out.println(list);

        // The result of this instantiation is a new mutable ArrayList populated
        // with the elements from the immutable list passed.
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);



        // The code below DOES NOT compile and throws an exception.
        // The instantiation code of ArrayList is calling a constructor
        // on ArrayList and passing the argument of type String[] 'nextItem'.
        // The String array must first be a list in this case.
//        String[] nextItem = {"test", "one", "two"};
//        ArrayList<String> nextGroceries = new ArrayList<>(nextItem);
//        nextGroceries.add("yogurt");
    }

}
