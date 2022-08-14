package day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReadingData {
	public static void main(String[] args) throws IOException {
		var path = Path.of("src/employee.txt");
		
		try(Stream<String>lines = Files.lines(path)){
			
		}
	}
}
