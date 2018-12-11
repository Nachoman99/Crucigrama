package filemanager;

import crucigrama.Game;
import crucigrama.Word;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *this class is responsible for reading text files
 * 
 * @version 10/12/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class ReaderManagerText {

    private BufferedReader reader;

    /**
     * public void open(String fileName) throws FileNotFoundException
     * this method opens the document to be read
     * @param fileName location of the document
     * @throws java.io.FileNotFoundException
     */
    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }
    
    /**
     * public int[] readRowColumn()  throws IOException
     *  this method returns the size of the matrix of each crossword
     * @return the size of the matrix of each crossword
     * @throws java.io.IOException
     */
    public int[] readRowColumn() throws IOException{
        int[] size = new int[2];
        String line = reader.readLine();
        String datos[];
        if (line != null) {
            datos = line.split("-");
            int row = Integer.parseInt(datos[0]);
            int column = Integer.parseInt(datos[1]);
            size[0] = row;
            size[1] = column;
            return size;
        }
        return null;
    }
    
    /**
     * private Word read() throws IOException
     * this method reads everything related to the words of the crossword
     * @return what he read
     */
    private Word read() throws IOException{
        Word word = new Word();
        String caso = reader.readLine();
        if(caso == null){
            return null;
        }else {    
           if(caso.length() < 10){
                String line = reader.readLine();
                String datos[];
                String datos2[];
                String datos4[];
                if (line != null) {
                    datos = line.split("/");
                    word.setIndex(Integer.parseInt(datos[1]));
                    word.setVerticalHorizontal( datos[2].charAt(0));
                    word.setWord(datos[3]);
                    word.setClue(datos[4]);  
                    datos2 = line.split("-");
                    System.out.println("lengt= "+datos2[1]);
                    word.setInitRow(Integer.parseInt(datos2[0]));
                    String datos3;
                    datos3 = datos[0];
                    datos4 = datos3.split("-");
                    word.setInitColumn(Integer.parseInt(datos4[1]));
                }
            }else{
                String datos[];
                String datos2[];
                String datos4[];
                datos = caso.split("/");
                word.setIndex(Integer.parseInt(datos[1]));
                word.setVerticalHorizontal( datos[2].charAt(0));
                word.setWord(datos[3]);
                word.setClue(datos[4]);  
                datos2 = caso.split("-");
                word.setInitRow(Integer.parseInt(datos2[0]));
                String datos3;
                datos3 = datos[0];
                datos4 = datos3.split("-");
                word.setInitColumn(Integer.parseInt(datos4[1]));   
            } 
        }
        return word;
    }

    /**
     * public void readAll() throws IOException
     * this method reads the entire document
     * @throws java.io.IOException
     */
    public void readAll() throws IOException {
        Word newWord = read();
        while (newWord != null) {
            Game.WORD_LIST_MANAGER.addWord(newWord);
            newWord = read();
          
        }
    }

    /**
     * public void close() throws IOException
     * this method closes the document
     * @throws java.io.IOException
     */
    public void close() throws IOException {
        reader.close();
    }
}
