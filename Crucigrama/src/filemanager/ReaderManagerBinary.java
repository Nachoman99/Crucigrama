package filemanager;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import users.UserList;

/**
 *
 * @author Kevin Trejos
 */
public class ReaderManagerBinary {

    private ObjectInputStream reader;

    /**
     *
     * @param fileName
     * @throws IOException
     */
    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }

    /**
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public UserList read() throws IOException, ClassNotFoundException {
        return (UserList) reader.readObject();
    }

    /**
     *
     * @throws IOException
     */
    public void close() throws IOException {
        reader.close();
    }
}
