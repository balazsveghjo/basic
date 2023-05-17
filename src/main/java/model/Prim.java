package model;

public class Prim {
    int order;
    int value;

    public Prim(){
    }

    public Prim(int o, int v){
        this.order = o;
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

}
