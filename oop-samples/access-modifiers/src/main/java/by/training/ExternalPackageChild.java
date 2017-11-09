package by.training;

import by.training.innerpackage.Parent;

public class ExternalPackageChild extends Parent {
    public String publicVariable = "externalPackageChildPublicVariable";
    String defaultVariable = "externalPackageChildDefaultVariable";

    public void publicMethod() {
        System.out.println("externalPackageChildChildPublicMethod");
    }

    public void callProtectedParentVariable() {
        System.out.println(protectedVariable);
    }

    public void callProtectedParentMethod() {
        protectedMethod();
    }
}
