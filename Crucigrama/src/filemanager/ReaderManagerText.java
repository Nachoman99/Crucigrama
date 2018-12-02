package filemanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderManagerText {

    private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

//    private Student read() throws IOException {
//        Student person = null;
//        String line = reader.readLine(); //retorna null cuando no hay más registros
//        String datos[];
//        if (line != null) {
//            datos = line.split("-");
//            person = new Student(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]),
//                    new Address(datos[4], datos[5], datos[6], datos[7]));
//        }
//        return person;
//    }
//
//    public void readAll() throws IOException {
//        Student newStudent;
//        while ((newStudent = read()) != null) {
//            Main.LIST_MANAGER.addStudent(newStudent);
//        }

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
    }

//    public void close() throws IOException {
//        reader.close();
//    }
}
