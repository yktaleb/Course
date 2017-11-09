package by.training.innerpackage;

public class Parent {
    public String publicVariable = "publicVariable";
    protected String protectedVariable = "protectedVariable";
    String defaultVariable = "defaultVariable";
    private String privateVariable = "privateVariable";

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }
}
