package model;

public class Alfa {
    private int orderNumber;
    private String name;
    private Double value;
    private boolean valid;
    private String descripion;
    private String[] listOfAlfas;
    private String message;

    public Alfa(){
        printMessage();
    }

    public void printMessage(){
        System.out.print(" \n\t Hi from Alfa!");
    }


    public void printPostMessage(){
        System.out.print(" extended from Alfa! ");
    }
    public Alfa(int orderNumber, String name, Double value, boolean valid, String descripion, String[] listOfAlfas, String message) {
        this.orderNumber = orderNumber;
        this.name = name;
        this.value = value;
        this.valid = valid;
        this.descripion = descripion;
        this.listOfAlfas = listOfAlfas;
        this.message = message;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public String[] getListOfAlfas() {
        return listOfAlfas;
    }

    public void setListOfAlfas(String[] listOfAlfas) {
        this.listOfAlfas = listOfAlfas;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
