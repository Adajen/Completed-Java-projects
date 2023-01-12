
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
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;

    }

    public int currentWeight() {
        int currentWeight = 0;
        for (Suitcase s : suitcases) {
            currentWeight += s.totalWeight();
        }
        return currentWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight() + "kg)";

    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }

}
