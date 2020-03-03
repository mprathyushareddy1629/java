class person
{
	public String name;
	public String address;
    public int phone;
    public String email;
	public person(String name,String address,int phone,String email)
	{
		this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
	}
	public void getInfo()
	{
		System.out.println("class:person");
		System.out.println("name  :"+name);
	}

}
class student extends person
{
	 final String status="fresher";
	public student(String name,String address,int phone,String email)
	{
		super( name,address,phone,email);
	}
	
	public void getInfo()
	{
		System.out.println("class : student");
		System.out.println("name  :"+name);
	}
}
class employee extends person
{
   String office ;
   double salary;
   String doj;
  public employee(String name,String address,int phone,String email,String office,double salary,String doj)
  {
  	super( name,address,phone,email);
    this.office=office;
	this.salary=salary;
	this.doj=doj;
  }
	public void getInfo()
	{
		System.out.println("class : employee");
		System.out.println("name  :"+name);
	}
}
class staff extends employee
{
	 String title;
	public staff(String name,String address,int phone,String email,String office,double salary,String doj,String title)
	{
		super(name,address,phone,email,office,salary,doj);
		title=title;
	}
public void getInfo()
	{
		System.out.println("class : staff");
		System.out.println("name  :"+name);
	}
}
class faculty extends employee
{
	String officehours;
	 String ranks;
	public faculty(String name,String address,int phone,String email,String office,double salary,String doj,String officehours,String ranks)
	{
		
		super(name,address,phone,email,office,salary,doj);
        
		this.officehours=officehours;
		this.ranks=ranks;
	}
	public void getInfo()
	{
		System.out.println("class : faculty");
		System.out.println("name  :"+name);
	}
}
class result
{
	static public final strictfp synchronized void main(String... reddy)
	{
		person p=new person("piggu","hosur",452736,"mee1@gmail.com");
	    p.getInfo();

	    student s=new student("mee","Hosur",6724234,"mee2@gmail.com");
	    s.getInfo();

	    employee e=new employee("privthi","dash",4273843,"pirthvi@gmail","bang",73564,"4/6/2010");
	    e.getInfo();

	    faculty f=new faculty("manju","goa",8375623,"manj@gmail.com","sgjeyw",723786,"5/3/400","8","36");
	    f.getInfo();

	    staff t=new staff("dj","jfgsy",7238542,"dj@gmail.com","ywjas",823295,"328/34/78","etgu");
	    t.getInfo();
	}

}
