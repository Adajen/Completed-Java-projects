
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
public class Suitcase {

    private ArrayList<Item> list;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
       
    }

    public int currentWeight() {
        int currentWeight = 0;
        for(Item item : list) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    public void addItem(Item i) {
        if (this.currentWeight() + i.getWeight() <= this.maxWeight) {
            this.list.add(i);

        }
    }

    @Override
    public String toString() {
        if(this.list.isEmpty()) {
            return "no items (" + this.currentWeight() + " kg)";
        }
        if (this.list.size() == 1) {
            return this.list.size() + " item (" + this.currentWeight() + " kg)";
        }

        return this.list.size() + " items (" + this.currentWeight() + " kg)";
    }

    public void printItems() {
        for(Item i : list) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for(Item i : list) {
            totalWeight += i.getWeight();

        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (list.isEmpty()) {
            return null;

        }

        Item heaviest = this.list.get(0);
        for (Item i : list) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;

            }
        }
        return heaviest;
    }
}
