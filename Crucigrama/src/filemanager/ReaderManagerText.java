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
    private Word read() throws IOException{
        Word word = new Word();
        String caso = reader.readLine();
        System.out.println("me cago1= "+caso);
        if(caso == null){
          return null;
        }else {    
           if(caso.length() < 10){
                String line = reader.readLine(); //retorna null cuando no hay más registros
                String datos[];
                String datos2[];
                String datos4[];
                System.out.println("me cago3= "+line);
                if (line != null) {
                    System.out.println("me cago= "+line);
                    System.out.println("lengt= "+line.length());
                    datos = line.split("/");
                    
                    //datos = line.split("/");
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
                    System.out.println("me cago3= "+caso);

                        System.out.println("me cago= "+caso);
                        System.out.println("lengt= "+caso.length());
                        datos = caso.split("/");

                        //datos = line.split("/");
                        word.setIndex(Integer.parseInt(datos[1]));
                        word.setVerticalHorizontal( datos[2].charAt(0));
                        word.setWord(datos[3]);
                        word.setClue(datos[4]);  

                        datos2 = caso.split("-");
                        System.out.println("lengt= "+datos2[1]);
                        word.setInitRow(Integer.parseInt(datos2[0]));
                        
                        String datos3;
                        datos3 = datos[0];
                        datos4 = datos3.split("-");
                        word.setInitColumn(Integer.parseInt(datos4[1]));
                      
            } 
        }
        
        
        return word;
        
    }

    public void readAll() throws IOException {
        Word newWord = read();
        while (newWord != null) {
            Game.WORD_LIST_MANAGER.addWord(newWord);
            newWord = read();
          
        }
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
