package model;

public class Fibo {
    int order;
    int value;

    public Fibo(){
    }

    public Fibo(int o, int v){
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
