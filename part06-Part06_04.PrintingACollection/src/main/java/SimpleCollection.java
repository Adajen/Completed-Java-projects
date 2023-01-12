
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String output = "The collection " + this.name;
        String elementsCollected = "";
        if (elements.isEmpty()) {
            return output + " is empty.";

        }

        for (int i = 0; i < this.elements.size(); i++) {
            if (i == this.elements.size() - 1) {
                elementsCollected += this.elements.get(i);
            } else {
                elementsCollected += this.elements.get(i) + "\n";
            }
        }

        if (this.elements.size() == 1) {
            return output + " has " + this.elements.size() + " element:\n"
                    + elementsCollected;
        }

        return output + " has " + this.elements.size() + " elements:\n"
                + elementsCollected;
    }

}
