class method
{
    String name;
    int age;
    method(String n,int a)
    {
        this.name=n;
        this.age=a;
    }
    public void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
}
  class Mainprogrammer extends method
{
    String companyname;
   Mainprogrammer(String n,int a,String c)
    {
        super(n,a);
        this.companyname=c;
    }
    public void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Company Name="+companyname);
    }
}  
class methodoveridding
{
    public static void main(String args[])
    {
        Mainprogrammer o=new Mainprogrammer("Ram",22,"Technologies");
        o.display();
    }
}