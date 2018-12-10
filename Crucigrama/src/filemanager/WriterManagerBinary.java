package filemanager;

import crucigrama.Game;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import main.Main;

/**
 *
 * @author Kevin Trejos
 */
public class WriterManagerBinary {

    private ObjectOutputStream writer;

    /**
     * public void open(String fileName) throws IOException
     * this method opens the document to be read
     * @param fileName location of the document
     */
    public void open(String fileName) throws IOException {
        writer = new ObjectOutputStream(new FileOutputStream(fileName));
    }

    /**
     * public void write() throws IOException
     * this method writes about the document
     * @throws IOException
     */
    public void write() throws IOException {
        writer.writeObject(Game.USER_LIST_MANAGER);
    }

    /**
     * public void close() throws IOException
     * this method closes the document
     */
    public void close() throws IOException {
        writer.close();
    }
}
