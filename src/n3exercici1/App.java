package n3exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumnos student1=new Alumnos("Luis", 30, "Angular", 8);
		Alumnos student2=new Alumnos("Jose", 35, "PHP", 7);
		Alumnos student3=new Alumnos("Nacho", 10, "Java", 4);
		Alumnos student4=new Alumnos("Ana", 20, "PHP", 6);
		Alumnos student5=new Alumnos("Maria", 25, "NodeJs", 9);
		Alumnos student6=new Alumnos("Laura", 18, "PHP", 10);
		Alumnos student7=new Alumnos("Gerard", 55, "Java", 5);
		Alumnos student8=new Alumnos("Pau", 13, "Java", 4);
		Alumnos student9=new Alumnos("Angel", 30, "Java", 3);
		Alumnos student10=new Alumnos("Ines", 45, "NodeJs", 8);
		
		List<Alumnos> studentList=(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,
				student9,student10));
		
		
		showNameAge(studentList);
		
		showNameStartA(studentList);
		
		qualificationMin5(studentList);
		
		qualificationMin5NotPhp(studentList);
		
		adultJava(studentList);
		
	}

	private static void showNameAge(List<Alumnos> studentList) {
		
		studentList.stream().forEach(a->System.out.println(a.getName()+" "+a.getAge()));
	}

	private static void showNameStartA(List<Alumnos> studentList) {
		
		List<Alumnos>filteredList=studentList.stream().filter(a->a.getName().startsWith("A")).collect(Collectors.toList());
		filteredList.forEach(System.out::println);
	}

	private static void qualificationMin5(List<Alumnos> studentList) {
		
		List<Alumnos>filteredList2=studentList.stream().filter(a->a.getQualification()>=5).collect(Collectors.toList());
		filteredList2.forEach(System.out::println);
	}

	private static void qualificationMin5NotPhp(List<Alumnos> studentList) {
		
		List<Alumnos>filteredList3=studentList.stream().filter(a->a.getQualification()>=5&& a.getCourse()!="PHP").collect(Collectors.toList());
		filteredList3.forEach(System.out::println);
	}

	private static void adultJava(List<Alumnos> studentList) {
		
		List<Alumnos>filteredList2=studentList.stream().filter(a->a.getAge()>=18 && a.getCourse().equals("Java")).collect(Collectors.toList());
		filteredList2.forEach(System.out::println);
	}
	

}
