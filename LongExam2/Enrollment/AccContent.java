package Enrollment;
import java.io.*;
import java.util.ArrayList;

public class AccContent {
	
    private String path;
    private final ArrayList<Account> accounts = new ArrayList<>();

    public AccContent(String path) {
        this.path = path;
        this.read();
    }

    @SuppressWarnings("resource")
	void read() {
        BufferedReader reader = null;
        String line;
        try {
            reader = new BufferedReader(new FileReader(this.path));

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                accounts.add(new Account(row[0], row[1]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write() {
        StringBuilder text = new StringBuilder();
        for (Account acc : this.accounts) {
            text.append(acc.getUsername()).append(",").append(acc.getPassword()).append("\n");
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(this.path, false));
            writer.write(String.valueOf(text));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public void addAcc(String uname, String pass) {
        accounts.add(new Account(uname, pass));
    }
}

