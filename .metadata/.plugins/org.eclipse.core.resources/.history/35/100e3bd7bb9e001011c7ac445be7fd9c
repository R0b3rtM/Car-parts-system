package Main_pkg;

import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.File;

public class CarPartsSystem {
	
	private static Scanner scan = new Scanner(System.in);
	private static Configurations curr_configs = new Configurations();
	private static ObjectMapper mapper = new ObjectMapper();
	private static File conf_file = null;			
	private static FilesHandler files_handler = new FilesHandler(curr_configs, mapper, conf_file);
	
	public static void main(String[] args) throws IOException {
		
			boolean isRunning = true;
			int curr_menu = 0;
			
			//Print application welcome message.
			System.out.println(Constants.msg_welc);
			
			//Initiate configuration file
			files_handler.conf_initiation();
			
			//Start the application.
			while(isRunning) {
				switch (curr_menu) {
					case Constants.mnu_main:
						System.out.println(Constants.msg_menu);
						curr_menu = scan.nextInt();
						console_clear();
						break;
						
					case Constants.mnu_parts:
						parts_options();
						curr_menu = 0;
						console_clear();
						break;
						
					default:
						System.out.println("Incorrect input");
						curr_menu = 0;
						console_clear();
						break;
				}
				
			}
			
			scan.close();

		}
	
	private static void console_clear() {
		for(int i=0; i<50; i++) System.out.println();
	}
	
	private static void parts_options() {
		boolean return_to_main = false;
		int option = Integer.MAX_VALUE;
		String read_line;
		
		//consume the leftover '\n' that left from the 'nextInt()'
		scan.nextLine();
		
		while(return_to_main == false) {
			files_handler.data_file_init();
			read_line = scan.nextLine();
			
			if(read_line.isEmpty()) {
				return_to_main = true;
			}else {
				try {
					option = Integer.parseInt(read_line);
				} catch (NumberFormatException e) {
					return_to_main = true;
				}
			}
			switch (option) {
				case Constants.part_add:
					//Adding part to the database
					new_part();
					break;
				case Constants.part_remov:
					//Remove part from the database
					break;
				case Constants.page_next:
					//Show next page of the database
					break;
				case Constants.page_prev:
					//Show previous page of the database
					break;
				default:
					//return to main menu
					System.out.println("Invalid option number\n");
					break;
			}
		}
	}
	
	private static void new_part() {
		
		String[] part_info = new String[5];
		String read_line;
		System.out.println(files_handler.getDataFile().getName());
		//Start user dialog to get the part info
		for(int i = 0; i<5; i++) {
			System.out.println("Enter the " + Constants.part_info[i] + ": ");
			read_line = scan.nextLine();
			part_info[i] = read_line;
		}
		
		Part new_part = new Part(part_info[0], part_info[1], part_info[2], part_info[3], part_info[4]);
		files_handler.add_part_to_database(new_part, files_handler.getDataFile());
		
	}
}
