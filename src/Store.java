public class Store {
    //instance variables
    private String nameStore;
    private int numEmployee;
    //constructor of the base class
    public Store(String nameS, int numE){
        nameStore=nameS;
        numEmployee=numE;
    }
    //toString method of the base class
    public String toString(){
        return nameStore+" has "+numEmployee+" employees.";
    }
}
