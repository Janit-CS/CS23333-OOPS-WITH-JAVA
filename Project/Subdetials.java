package Subjectdetials;

public class Subdetials
{
    String Sname;
    int Scode;
    public Subdetials(String Sname, int Scode)
    {
        this.Sname = Sname;
        this.Scode = Scode;
    }
    public void subdisp()
    {
        System.out.println("Subject Name : "+Sname);
        System.out.println("Subject Code : "+Scode);
    }
}
