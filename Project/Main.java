import Studentinfo.Student;
import Subjectdetials.Subdetials;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        String name = ip.next();
        int roll = ip.nextInt();
        String Sname = ip.next();
        int Scode = ip.nextInt();
        Student obj = new Student(name, roll);
        Subdetials obj1 = new Subdetials(Sname, Scode);
        obj.studdisp();
        obj1.subdisp();
    }
}
