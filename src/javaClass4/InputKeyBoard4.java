package javaClass4;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class InputKeyBoard4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("please enter your name");
		
		String name=scanner.nextLine();
		System.out.println("please enter your age");
		int age=scanner.nextInt();
		System.out.println("hi "+name+" you are "+age+" years old");
		

	}

}
