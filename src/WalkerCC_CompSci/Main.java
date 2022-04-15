package WalkerCC_CompSci;
import java.io.*;
import java.util.*;

// Main class
// To add elements to HashMap
class Main {


    public static void main(String args[])
    {

        HashMap<Integer, String> hmName = new HashMap<>();


        HashMap<Integer, String> hmYear
                = new HashMap<Integer, String>();


        hmName.put(1, "Johnny Apple");
        hmName.put(2, "Snoop Dog");
        hmName.put(3, "Auntie Ann");

        hmYear.put(4, "1956");
        hmYear.put(5, "1970");
        hmYear.put(6, "195");


        System.out.println("Family Member Names are : "
                + hmName);


        System.out.println("Birth years are : "
                + hmYear);
    }
}
