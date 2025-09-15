package Main_pkg;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class output_handler {
	
	static void read_file(String file_name) {
		try {
			List<String> lines = Files.readAllLines(Paths.get(file_name));
			
			for(int i = 0; i < lines.size(); i++) {
				String line = lines.get(i);
				System.out.println(line);
			}
			
		} catch (Exception e){
			System.out.println("Application error " + e.getMessage());
		}
	}
}
