import java.io.*;
import java.util.*;
public class ReadFile() {
    String[] students;
    int[] days;
    public ReadFile(String fname) throws FileNotFoundException {
        File f = new File(fname);
        int index = 0;
        Scanner input = new Scanner(f);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            int space=line.indexOf(" ");
            students[index]=input.substring(0, space);
            days[index]=Integer.parseInt(line.substring(space+1));
            index++;
        }
        input.close();
}
public static void main(String[] args) {
    try {
        ReadFile r=new ReadFile("names.txt");
    } catch (IOException e) {

    }
}
