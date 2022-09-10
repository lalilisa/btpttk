package Aggregation;
class People {
    Address op;
    private String name;
    public People(String name){
            this.name=name;
            op=new Address("Nam Dinh");
    }
    public People( String name, Address op) {
        this.op = op;
        this.name = name;
    }
    public  void deletePeople(){
        this.name=null;

    }

    public Address getOp() {
        return op;
    }

    public void setOp(Address op) {
        this.op = op;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (this.name==null)
            return "People is not exist";
        return "People{" +
                "op=" + op +
                ", name='" + name + '\'' +
                '}';
    }
}
