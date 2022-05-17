package org.overload;

public class OverLoading {
	//datatype
	public void empDetail(int id) {
		System.out.println("id is"+id);
	}
	public void empDetail(String name) {
		System.out.println("name is"+name);

	}
	public void empDetail(long phone) {
		System.out.println("phonenumber:  "+phone);
	}
	public void empDetail(String name,int age) {
		System.out.println("name is :  "+name+"/n+age is :"+age);
		
	}
	public void empDetails(String add,char genter,long phno,float salary) {
	System.out.println("add is  :"+add+"\ngenter is  :"+genter+"\tphno is  :"+phno+"\nsalary is:  "+salary);

	}
	public static void main(String[] args) {
		OverLoading l =new OverLoading();
		l.empDetail(1234);
		l.empDetail("aswin");
		l.empDetail(6381640562l);
		l.empDetail("Rock", 18);
		l.empDetails("aswin",'M', 6381640562l,140.345f);
		
	}

}
