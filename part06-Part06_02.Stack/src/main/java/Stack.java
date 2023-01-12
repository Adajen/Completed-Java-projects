
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenny
 */
public class Stack {
  
    private ArrayList<String> strings = new ArrayList<>();

    public boolean isEmpty() {
        return this.strings.isEmpty();
    }

    public void add(String value) {
        strings.add(value);
    }

    public ArrayList<String> values() {
        return strings;
    }

    public String take() {
        return strings.remove(strings.size() - 1);
        
}
}