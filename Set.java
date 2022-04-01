package Prgrams;
import java.util.*;
public class Set {
private ArrayList<String> elements;
    
    public Set(){
        elements = new ArrayList<String>();
    }
    
    public Set(ArrayList<String> elements){
        this.elements = elements;
    }
    
    public String getElement(int i){
        return elements.get(i);
    }
    
    public void setElement(int i, String element){
        elements.set(i, element);
    }
    
    public void addElement(String element){
        elements.add(element);
    }
    
    public ArrayList<String> getAll(){
        return elements;
    }
    
    public void setAll(ArrayList<String> elements){
        this.elements = elements;
    }
    
    @Override
    public String toString(){
        return elements.toString();
    }
    
    public static Set union(Set set1, Set set2){
        Set resultingSet = new Set();
        
        for(String element : set1.getAll())
            resultingSet.addElement(element);
        
        for(String element: set2.getAll()){
            boolean found = false;
            for(String element2 : resultingSet.getAll()){
                if(element.equals(element2))
                    found = true;
            }
            if(!found)
                resultingSet.addElement(element);
        }
        return resultingSet;
    }
    
    public static Set intersect(Set set1, Set set2){
        Set resultingSet = new Set();
        
        for(String element1: set1.getAll()){
            boolean found = false;
            for(String element2: set2.getAll()){
                if(element1.equals(element2))
                    found = true;
            }
            if(found)
                resultingSet.addElement(element1);
        }
        
        return resultingSet;
    }
    
    public static Set complement(Set set1, Set set2){
        Set resultingSet = new Set();
        
        //complement(set1, set2) = elements of set1 which are not in set2
        for(String element1: set1.getAll()){
            boolean found = false;
            for(String element2: set2.getAll()){
                if(element1.equals(element2))
                    found = true;
            }
            if(!found)
                resultingSet.addElement(element1);
        }
        return resultingSet;
    }
}
