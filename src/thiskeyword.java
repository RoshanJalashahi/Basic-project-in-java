class student{
    int roll;
    int fee;
    String name;
    student(int rollno,int fee, String name ){
        this.roll =rollno;
        this.fee=fee;
        this.name=name;

    }

    public void show(){
        System.out.println(roll+":"+fee+":"+name);
    }
}
public class thiskeyword {
    public static void main(String[] args) {

        student roshan=new student(25,53000,"Roshan");
        student shushal =new student(36,2000,"shushal");

        roshan.show();
        shushal.show();

    }
}
