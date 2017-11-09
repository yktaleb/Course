package by.training.innerpackage;

public class InnerPackageChild extends Parent {

    public String publicVariable = "childPublicVariable";

    public void publicMethod() {
        System.out.println("childPublicMethod");
    }

    void defaultMethod() {
        System.out.println("childDefaultMethod");
    }

    public void callProtectedParentVariable() {
        System.out.println(protectedVariable);
    }

    public void callProtectedParentMethod() {
        protectedMethod();
    }
}
