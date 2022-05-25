package com.siet.inheritence;

class Student1
{
	int id;
	String name;
	String course;
	String email;
	int phno;
	
	public Student1(int id, String name, String course, String email, int phno) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
		this.phno = phno;
	}
	public Student1(int id, String name) {	
		this.id = id;
		this.name = name;
	}

	public Student1() 
	{
		
	}

	
@Override
	public String toString() {
		return "Student1 with [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + ", phno=" + phno
				+ "]";
	}
	
}
public class Student {

	


		public static void main(String[] args) 
		{
			System.out.println("The students of SIET are");
		Student1 obj1=new Student1(1,"bhavya","BE","agag",3565767);
		System.out.println(obj1);
		Student1 obj2=new Student1(2,"sampath","BE","afadg",35463);
		System.out.println(obj2);
		
	Student1 obj3=new Student1(3,"Keerthi","BE","afadg",35463);
		System.out.println(obj3);
		Student1 obj4=new Student1(4,"gayatri");
		System.out.println(obj4);
		}

	

	}


