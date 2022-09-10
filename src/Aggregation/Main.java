package Aggregation;

public class Main {
    public static void main(String args[]){
        People c=new People("tri", new Address("Nam Dinh"));

        System.out.println(c);
        c.deletePeople();
        System.out.println(c);
        System.out.println(c.op);
    }
}
