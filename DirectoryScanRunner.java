package com.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
	static Predicate<String> predicate = p -> p.equalsIgnoreCase("jaki");
public void showName(String name) {
	System.out.println(predicate.test(name));
}
public static void main(String[] args)throws IOException {
	new DirectoryScanRunner().showName("jaki");
	Path currentDirectory = Paths.get(".");
	//Files.list(currentDirectory).forEach(System.out::println);
	System.out.println(predicate.test("khan"));
	
	
	//Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
	
	Predicate<Path> javaMatcher 
	= (path) -> String.valueOf(path).contains(".java");

	BiPredicate<Path, BasicFileAttributes> directoryMatcher 
	= (path,attributes) -> attributes.isDirectory();

	
	Files.find(currentDirectory, 4, directoryMatcher )
						.forEach(System.out::println);
	     
}

}