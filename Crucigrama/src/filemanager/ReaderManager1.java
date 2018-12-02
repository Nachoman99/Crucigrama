package filemanager;

//import dataset.StudentList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderManager1 {

    private ObjectInputStream reader;

    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }

   /* public StudentList read() throws IOException, ClassNotFoundException {
        return (StudentList) reader.readObject();
    }*/

    public void close() throws IOException {
        reader.close();
    }
}
