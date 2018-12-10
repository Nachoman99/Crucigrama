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
     *
     * @param fileName
     * @throws IOException
     */
    public void open(String fileName) throws IOException {
        writer = new ObjectOutputStream(new FileOutputStream(fileName));
    }

    /**
     *
     * @throws IOException
     */
    public void write() throws IOException {
        writer.writeObject(Game.USER_LIST_MANAGER);
    }

    /**
     *
     * @throws IOException
     */
    public void close() throws IOException {
        writer.close();
    }
}
