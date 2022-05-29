class Vehicle{

  void vehi(){
      System.out.println("the vehicle is the superclass of car");
  }
}
class car extends Vehicle{
    void vehi(){
        System.out.println("the lamborghini is one of the fastest car");
    }

}
public class overriding {
    public static void main(String[] args) {
        car c=new car();
        c.vehi();
    }
}
