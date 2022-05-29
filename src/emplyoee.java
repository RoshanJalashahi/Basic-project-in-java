class Address{
    String city;
    String state;
    String country;
    Address (String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;

    }
}

public class emplyoee {
    int id;
    String name;
    Address address;
    emplyoee(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;

    }
    void display(){
        System.out.println("your id:"+id+"  "+" and"+"  "+"name is "+""+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
    public static void main(String[] args) {
        Address address1=new Address("pokhara","gandaki","Nepal");
        emplyoee e =new emplyoee(1,"roshan",address1);
        e.display();
    }
}