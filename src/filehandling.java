import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {
        try{

             //code to create a file

           // File myfile=new File("student.txt");
           // myfile.createNewFile();



            //code to write in a file
            FileWriter fileWriter =new FileWriter("student.txt");
            fileWriter.write("this is a Roshan speaking from the Pokhara University\n OK guys see u soon");
             fileWriter.close();

             // Reading a file
             File myfile= new File("student.txt");
            Scanner sc= new Scanner(myfile);
            while (sc.hasNext()){
                String line =sc.nextLine();
                System.out.println(line);
            }


            // deleting a file
//            File myfile= new File("student.txt");
//            if(myfile.delete()){
//                System.out.println("the file is deleted"+myfile.getName());
//            }
//            else{
//                System.out.println("sorry cant delete file");
//            }


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
