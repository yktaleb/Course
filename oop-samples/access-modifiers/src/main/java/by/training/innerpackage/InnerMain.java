package by.training.innerpackage;

import by.training.ExternalPackageChild;

public class InnerMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.publicMethod();
//        parent.protectedMethod();
        parent.defaultMethod();
//        parent.privateMethod();
        System.out.println(parent.publicVariable);
//        System.out.println(parent.protectedVariable);
        System.out.println(parent.defaultVariable);
//        System.out.println(parent.privateVariable);

//      ---------------------------------------------------

        Parent parent1 = new InnerPackageChild();
        parent1.publicMethod();
        parent1.defaultMethod();
        System.out.println(parent1.publicVariable);
        System.out.println(parent1.defaultVariable);

//      ---------------------------------------------------

        InnerPackageChild child = new InnerPackageChild();
        child.publicMethod();
        child.callProtectedParentVariable();
        child.callProtectedParentMethod();
        System.out.println(child.publicVariable);

//      ---------------------------------------------------

        ExternalPackageChild child1 = new ExternalPackageChild();
        child1.publicMethod();
        child1.callProtectedParentVariable();
        child1.callProtectedParentMethod();
        System.out.println(child1.publicVariable);

        Long i = 31212L;
        Integer b = 31212;
        System.out.println(b instanceof Integer);
    }
}
