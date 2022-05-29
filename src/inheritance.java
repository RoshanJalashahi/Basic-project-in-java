class inhr{
    void show(){
        System.out.println("you are perfect");
    }
}
class B extends  inhr{
    void show(){
        System.out.println("you are beautiful");
    }
}
 class inheritance  {
    public static void main(String[] args) {
        B b =new B();
        b.show();
    }
}
