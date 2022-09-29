package class11;

public class DogH {
	String bread;
	String age;
	String color;
	String gender;
	boolean vacinated;
	
	void sound () {
		System.out.println("Barking all day");
	}
	void eat () {
		System.out.println("Eating special food");
	}
	void smart () {
		System.out.println("This bread is very smart");
		
	}
	void friendly () {
		System.out.println("This bread is very friendly");
		
	}
	void agressive () {
		System.out.println("This bread is very agressive");
	}
	public static void main(String[] args) {
		DogH husky = new DogH ();
		husky.bread= "Husky";
		husky.age= "3 years";
		husky.gender = "F";
		husky.vacinated= true;
		
		System.out.println(husky.bread + " vaccination status is "+ husky.vacinated + " "+ husky.age + " old");
		husky.eat ();
		System.out.println("                       **********************");
		
		DogH bulldog =new DogH ();
		bulldog.bread= "bulldog";
		bulldog.age= "2 years";
		bulldog.gender = "M";
		bulldog.vacinated= true;
		System.out.println(bulldog.bread + " vaccination status is "+ bulldog.vacinated + " "+ bulldog.age + " old");
		bulldog.agressive ();
		System.out.println("                       **********************");
		
		DogH labrador = new DogH ();
		labrador.bread= "labrador";
		labrador.age= "1 years";
		labrador.gender = "M";
		labrador.vacinated= true;
		System.out.println(labrador.bread + " vaccination status is "+ labrador.vacinated + " "+ labrador.age + " old");

		labrador.friendly ();
		
		
		
		
		
	}

}
