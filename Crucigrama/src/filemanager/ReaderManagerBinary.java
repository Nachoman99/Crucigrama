package filemanager;

//import dataset.StudentList;
import crucigrama.Word;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderManagerBinary {

    private ObjectInputStream reader;

    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }

    
    public Word read() throws IOException, ClassNotFoundException {
        return (Word) reader.readObject();
    }

    public void close() throws IOException {
        reader.close();
    }
}
