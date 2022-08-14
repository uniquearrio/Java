package day18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperation {
	public static void main(String[] args) throws IOException {
	//	createFile();
//		createDirectory();
		//deleteFile();
		//deleteDirectories();
		copy();
	}
	
	private static void copy() throws IOException {
		
		var source = Path.of("src/readme.txt");
		var dest = Path.of("src/another.txt");
		Files.copy(source, dest);
		
		System.out.println("Copy success");
	}

	private static void deleteDirectories() throws IOException {
		var path  = Path.of(".data");
		System.out.println("exist: " + Files.exists(path));
		var deletedDir = Files.deleteIfExists(path);
		if(deletedDir)
			System.out.println("Delete Success");
		else
			System.out.println("Something wrong");
		
	}

	private static void deleteFile() throws IOException {
		Path path = Path.of("src/readme.txt");
		boolean fileDeleted = Files.deleteIfExists(path);
		if(fileDeleted)
			System.out.println("Delete success");
		else
			System.out.println("Something is wrong");
	}

	private static void createDirectory() throws IOException {
		Path path = Path.of("src/test");
		if(Files.notExists(path)) {
			Files.createDirectories(path);
			System.out.println("Creating new directory");
		}else {
			System.out.println("The directory already exist!");
		}
		
	}

	private static void createFile() throws IOException {
		//locate
		Path path = Path.of("src/readme.txt");
		if(Files.exists(path)) {
			System.out.println("File already exist!");
		}else {
			Files.createFile(path);
			System.out.println("Creating new file");
		}
	}
}
