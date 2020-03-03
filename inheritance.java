class college
{
	private int student;
	private int   teachers;
	private int   workers;
	public college(int stud,int  teach, int  work )
	{
		student=stud;
		teachers=teach;
		workers=work;
	}
	public int  getstudent()
	{
		return student;
	} 
	public int getteachers()
	{
		return teachers;
	}
	public int  getworkers()
	{
		return workers;
	}
}
class cmru extends college
{
	 private int  floors;
	 public cmru(int  stud, int teach, int work, int floor)
	 {
	 	super(stud,teach,work);
	 	floors=floor;
	 }
	 public int getfloors()
	 {
	 	return floors;
	 }
}
class Inheritance
{
	public static void main(String[]args)
	{
		cmru c = new cmru(500,50,40,5);
		System.out.println("students in cmru :"+c.getstudent());
		System.out.println("teachers teaching in cmru :"+c.getteachers());
		System.out.println("workers in cmru :"+c.getworkers());
		System.out.println("total no.of floors in cmru :"+c.getfloors());

	}
}









