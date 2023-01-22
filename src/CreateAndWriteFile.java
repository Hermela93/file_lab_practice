import java.io.File;// Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
public class CreateAndWriteFile{
    public static void main(String[] args) {
           try{
               File newObj= new File("Myfile.txt");
            if(newObj.createNewFile()) {
                System.out.println("File created: " + newObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("Myfile.txt");
            myWriter.write("This is an example of a file in java" +
                    "And this is a statement to write in java");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
            }
        }
    }
