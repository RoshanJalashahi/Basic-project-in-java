class Emp{
    int id;
    int salary;
   static String CEO;
    public  void show(){
        System.out.println(id+":"+salary+":"+CEO);
    }
}
public class staticdemo {
    public static void main(String[] args) {
Emp roshan =new Emp();
roshan.id =1;
roshan.salary=30000;
Emp.CEO=" shushil";
Emp shushal =new Emp();
shushal.id=2;
shushal.salary=35000;
shushal.CEO="Sandesh";

roshan.show();
shushal.show();

    }
}
