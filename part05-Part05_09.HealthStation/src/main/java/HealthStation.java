
public class HealthStation {
    
    private int weightTotal;
    
    public int weigh(Person person){
        weightTotal++;
        return person.getWeight();
    
     } 

    public void feed (Person person){
        person.setWeight(person.getWeight()+1);
        
    }
    public int weighings(){
        return weightTotal;
    }
    
}
