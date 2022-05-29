class outer{
    private int data=400;
    class inner{
        void msg(){
            System.out.println("data value is:"+" "+data);
        }
    }
}

public class innerclasses {
    public static void main(String[] args) {
        outer ob=new outer();
        outer.inner in =ob.new inner();
        in.msg();

    }
}
