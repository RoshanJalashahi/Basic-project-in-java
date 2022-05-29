interface
A1{
    default void display1() {
        System.out.println("A1");
    }
}
interface A2{
    default void display2() {
        System.out.println("A2");
    }
}

 public class multipleinheritance implements A1,A2 {
    public static void main(String[] args) {
        multipleinheritance m=new multipleinheritance();
        m.display1();
        m.display2();
    }
}
