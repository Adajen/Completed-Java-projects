
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter ();
        
        System.out.println(counter);
        counter.increase();
        
        System.out.println(counter);
        counter.increase(7);
        
        System.out.println(counter);
        counter. increase(12);
        
        System.out.println(counter);
        counter.decrease(6);
        
        System.out.println(counter);
        counter.decrease(14);
        
        
    }
}
