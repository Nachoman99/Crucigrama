package filemanager;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import users.UserList;

/**
 * This class is responsible for reading binary files
 * 
 *@version 10/12/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class ReaderManagerBinary {

    private ObjectInputStream reader;

    /**
     * public void open(String fileName) throws IOException
     * this method opens the document to be read
     * @param fileName location of the document
     * @throws java.io.IOException
     */
    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }

    /**
     * public UserList read() throws IOException, ClassNotFoundException
     * this method reads kine by line the document
     * @return what he read
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public UserList read() throws IOException, ClassNotFoundException {
        return (UserList) reader.readObject();
    }

    /**
     *this method closes the document
     * @throws java.io.IOException
     */
    public void close() throws IOException {
        reader.close();
    }
}
