import java.io.*;

public class FileHandler {
    public void writeIntoFile(String fileContent) throws IOException
    {
        FileWriter fw = new FileWriter("log.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(fileContent);
        bw.newLine();
        bw.close();
    }
}
