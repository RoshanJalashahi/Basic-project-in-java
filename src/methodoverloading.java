class adder{
    static int add(int a,int b){
        return a+b;
    }
    static  int add(int a,int b,int c){
        return a+b+c;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        System.out.println(adder.add(4,5));
        System.out.println(adder.add(4,5,6));

    }
}
