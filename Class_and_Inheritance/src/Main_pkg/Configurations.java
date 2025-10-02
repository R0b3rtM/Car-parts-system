package Main_pkg;

import java.io.File;

public class Configurations {
	
	private File file;
	private String db_file_url;
	
	//Default constructor (required by Jackson)
	public Configurations() {}
	
	public Configurations(File file) {
		this.file = file;
	}
	
	public void setFile(File file) {
		this.file = file;
	}
	
	public File getFile() {
		return file;
	}
	
	public void setDataFile(String db_url) {
		this.db_file_url = db_url;
	}
	
	public String getDataFile() {
		return db_file_url;
	}
}
