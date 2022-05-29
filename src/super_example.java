class nepal{
    void visit(){
        System.out.println("Visit nepal 2022");
    }
}
class pokhara extends nepal{
    void visit(){
        System.out.println("visit pokhara 2022");
    }
    void tourism(){
        System.out.println("tourism is one of the best way to earn forign currency");
    }
    void lets_come(){
        super.visit();

    }
}
public class super_example {
    public static void main(String[] args) {
       pokhara p =new pokhara();
       p.visit();
       p.lets_come();
    }
}
