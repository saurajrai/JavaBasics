public class Student {
	int id;
	String name;
	String subject;
    
	void insert (int i, String n, String s) {
		id = i;
		name = n;
		subject = s;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 776;
		s1.name = "Sauraj";
		s1.subject = "Computer Science";
		Student s2 = new Student();
		s2.id = 778;
		s2.name = "Sonu";
		s2.subject = "Information Technology";
		Student s3 = new Student ();
		s3.insert(780, "Monu", "Science");
		System.out.println("the name of student 1 is : " + s1.name);
		System.out.println("the id of student 1 is : " + s1.id);
		System.out.println("name: " + s2.name + " id:" + s2.id + " subjects: " + s2.subject);
		System.out.println("name: " + s3.name + " id:" + s3.id + " subjects: " + s3.subject);
	}
}
