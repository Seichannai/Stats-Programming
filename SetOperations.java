package Prgrams;
import java.util.*;
public class SetOperations {
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
       
        list1.add("Sunday");
        list1.add("Monday");
        list1.add("Thursday");
        list1.add("Friday");
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Friday");
        list2.add("Tuesday");
        list2.add("Wednersday");
        list2.add("Thursday");
        list2.add("Saturday");
        
        Set set1 = new Set(list1);
        Set set2 = new Set(list2);
        
        //union of set1 and set2
        Set unionSet = Set.union(set1, set2);
        System.out.println("Union of set1 and set2: " + unionSet);
        System.out.println();
        
        //intersect of set1 and set2
        Set intersectionSet = Set.intersect(set1, set2);
        System.out.println("Intersection of set1 and set2: " + intersectionSet);
        System.out.println();
        
        //intersect of set1 and set2
        Set complementedSet = Set.complement(set1, set2);
        System.out.println("Complementation of set1 and set2: " + complementedSet);
        System.out.println();
        
        //intersect of set1 and set2
        Set complementedSet2 = Set.complement(set2, set1);
        System.out.println("Complementation of set2 and set1: " + complementedSet2);
        
    }
}
