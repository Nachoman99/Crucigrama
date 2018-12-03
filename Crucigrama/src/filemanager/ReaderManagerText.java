package filemanager;

import crucigrama.Game;
import crucigrama.Word;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderManagerText {

    private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }
    
    /*private Word readRow() throws IOException {
        Word size = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            datos = line.split("-");
            size = new Word(Integer.parseInt(datos[0]));
        }
        return size;
    }*/

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
    
   /*public int readColumn() throws IOException{
        Word size = null
        String line = reader.readLine();
        String datos[];
        if (line != null) {
            datos = line.split("-");
            size = new Word()
        }
   }*/
    private Word read() throws IOException {
        Word word = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            datos = line.split("-");
            word = new Word(Integer.parseInt(datos[2]), Integer.parseInt(datos[3]), Integer.parseInt(datos[4]), datos[5].charAt(0), datos[6], datos[7]);
        }
        return word;
    }

    public void readAll() throws IOException {
        Word newWord;
        while ((newWord = read()) != null) {
            Game.WORD_LIST_MANAGER.addWord(newWord);
        }

        //otra forma
//        Student newStudent = read();
//        while(newStudent != null) {
//            Main.LIST_MANAGER.addStudent(newStudent);
//            newStudent = read();
//        }
        //otra forma
//        Student newStudent;
//        boolean hasNext = true;
//        while(hasNext) {
//            newStudent = read();
//            if (newStudent != null) {
//                Main.LIST_MANAGER.addStudent(newStudent);
//            } else {
//                hasNext = false;
//            }
//        }
    public void close() throws IOException {
        reader.close();
    }
    }

//    public void close() throws IOException {
//        reader.close();
//    }
//}
