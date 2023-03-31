package Enrollment;

import java.io.*;

public class RememberMe {
	
    private String path;
    private String username;
    private String password;
	

    public RememberMe(String path) {
       this.path = path; // constructor
       this.read();

    }
   
    @SuppressWarnings("resource")
	public void read() {
        BufferedReader reader = null; //reader
        String line;
        try {
            reader = new BufferedReader(new FileReader(this.path));

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                this.username = row[0];
                this.password = row[1];
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(String uname, String pass) {
        BufferedWriter writer = null;
        String text = uname + "," + pass;

        try {
            writer = new BufferedWriter(new FileWriter(this.path, false));
            writer.write(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //getter
    public String getUsername() {
    	return this.username;
    }
    
    public String getPassword() {
    	return this.password;
    }
}

