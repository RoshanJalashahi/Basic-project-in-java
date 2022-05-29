class Employee{
    int salary=20000;
    void show(){
        System.out.println(" the salary of the programmer is:"+salary);
    }
}
class programmer extends Employee{
    int bonus =5000;
    void show(){
        System.out.println("the bonus for programmer is:"+bonus);
    }

}
public class inheritancetest {
    public static void main(String[] args) {
        programmer p =new programmer();
        p.show();
    }
}
