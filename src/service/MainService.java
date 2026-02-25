package service;

import model.Student;

public class MainService {

	public static void main(String[] args) {
		//datu tips, nosaukums, new un tad konstruktors
		Student stud1 = new Student();
		System.out.println(stud1);
		
		Student stud2 = new Student("Guntis","Eglitis","785412-96541");
		System.out.println(stud2);
		
		Student stud3 = new Student("Gunt1s","egltis",null);
		System.out.println(stud3);

	}

}
