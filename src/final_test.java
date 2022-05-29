class bike{
    int speedlimit=90;
     final void bikers(){
        speedlimit = 120;
        System.out.println("the speed lmit is:"+" "+speedlimit);
    }
}
class honda extends bike{
    void biker(){
        System.out.println("this is my bike");
    }
}
public class final_test {
    public static void main(String[] args) {
        honda h =new honda();
        h.bikers();
        h.biker();
    }
}
