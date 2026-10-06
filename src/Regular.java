

// If a class implement an Interface then the implementing class must provide the definition of the methods of the interface
// if a class inherit and implement the "extends" must be performed before "implements"
// Rule : A class can implements multiple interfaces - interfaces have to be comma-separated
public class Regular extends AbstractClass implements Interface_A,Interface_B {
    @Override
    public void method_1_A() {
        System.out.println("Regular class is implementing method_1_A");

    }

    @Override
    public void method_2_A() {
        System.out.println("Regular class is implementing method_2_A");

    }


//    @Override
//    public void display_information() {
//        System.out.println("Regular class is Overriding the superclass display_information method");
//    }

    @Override

    public void method_1_B () {
        System.out.println("Regular class is Overriding method_1_B");
    }
    public void method_2_b () {
        System.out.println("Regular class is Overriding method_1_B");

    }

    public void abstract_method_AC(){
        System.out.println("Regular class is defining abstract method abstract_method_AC ");

    }

    public void method_1_C() {
        System.out.println("Regular class is defining method_1_C");
    }

    @Override
    public void method_1_D() {
        System.out.println("Regular class is defining method_1_D");
    }

    public void abstract_method_E() {
        System.out.println("Regular class is defining abstract_method_E ");
    }
}
