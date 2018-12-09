/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 * this class is in charge of handling the crossword methods
 *
 * @version 29/11/2018
 * @author Jose Ignacio Zamora/Edwin Molina/Kevin Trejos
 */
public class Crossword {
    private Letter[][] crossword;

    /**
     *
     */
    public Crossword() {
    
    }
    /**
     * Declaration public Crossword(int row, int column)
     * This is a constructor method that initializes and
     * gives the size of the crossword
     * @param row the number of rows of the matrix
     * @param column the number of columns of the matrix
     */
    public Crossword(int row, int column) {
        crossword = new Letter[row][column];
        for (int i=0; i < crossword.length; i++){
            for (int j=0; j < crossword[0].length; j++){
                Letter letter = new Letter('0');
                crossword[i][j] = letter; 
            }
        }
    }

    /**
     *
     * @param crossword
     */
    public Crossword(Letter[][] crossword) {
        this.crossword = crossword;
    }

    /**
     *
     * @return
     */
    public Letter[][] getCrossword() {
        return crossword;
    }

    /**
     *
     * @param crossword
     */
    public void setCrossword(Letter[][] crossword) {
        this.crossword = crossword;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Crossword{" + "crossword=" + crossword + '}';
    }
     /**
     * public void setLetterPosition(int row, int column, Letter letter)
     * This method inserts a letter in the crossword
     * @param row position in the row
     * @param column the position in the column
     * @param letter the letter to insert
     */
    public void setLetterPosition(int row, int column, Letter letter){
        crossword[row][column] = letter;
        if (crossword[row][column].toString() != null) {
            System.out.println(crossword[row][column].toString());
        }
        
    }
     
    /**
     * public String print()
     * This method print the crossword matrix
     * @return return the printed matrix
     */
    public String print(){
        String print ="";
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[0].length; j++) {
                print += " ("+crossword[i][j].getLetter()+")";
            }
            print += "\n";
        }
        return print;
    }
    
    /**
     *
     * @param letra
     * @param palabraCorrecta
     * @return
     */
    public int validar(Letter[] letra, Letter[] palabraCorrecta){
        return validar(0, letra, palabraCorrecta, 0);
    }
    
//    private int validar(int filas, Letter[] letra, Letter[] crossword, int letrasMalas){
//        if (filas > getLegth(letra)) {
//           // System.out.println(letrasMalas + 1);
//            return letrasMalas;
//        } else {
//            if (letra[filas] != crossword[filas]) {
//                letrasMalas += 1;
//               // System.out.println("Hola");
//            }
//            return validar(filas + 1, letra, crossword, letrasMalas);
//        }
//    }
//    
    /**
     * This method validates whether the words 
     * entered by the user are correct or not
     * @param rows the position where the letters are
     * @param letter the correct letters
     * @param crossword the letters that the user typed
     * @param letrasMalas the total of letters that are incorrect
     * @return the bad letters
     */
    private int validar(int rows, Letter[] letter, Letter[] crossword, int letrasMalas){
        if (rows > letter.length-1) {
           // System.out.println(letrasMalas + 1);
            return letrasMalas;
        } else {
            if (letter[rows] != crossword[rows]) {
                letrasMalas += 1;
               // System.out.println("Hola");
            }
            return validar(rows + 1, letter, crossword, letrasMalas);
        }
    }
    
//    /**
//     * public String extraction(int filaInicial,int columnaInicial, char verticalHorizontal)
//     * This method extracts a word from the crossword
//     * @param filaInicial the 
//     * @param columnaInicial
//     * @param verticalHorizontal
//     * @return return the extract word
//     */
//    public String extraction(int filaInicial,int columnaInicial, char verticalHorizontal){
//        String palabra = "";
//        Letter letter = new Letter('0');
//        if(verticalHorizontal == 'V'){
//            for (int i = columnaInicial; i < crossword[0].length; i++) {
//                if(crossword[filaInicial][i].getLetter() != letter.getLetter()){
//                    palabra += crossword[filaInicial][i].getLetter();
//                }
//            }
//        }else if(verticalHorizontal == 'H'){
//            for (int i = filaInicial; i < crossword.length; i++) {
//                if(crossword[i][columnaInicial].getLetter() != letter.getLetter()){
//                    palabra += crossword[i][columnaInicial].getLetter();
//                }
//            }
//        }
//
//        return palabra;
//    }
//     /**
//     * public Letter[] stringToLetter(String extraction)
//     * This method converts the extraction string to a 
//     * array Letter
//     * @param extraction
//     * @return return the array of Letter
//     */
//    public Letter[] stringToLetter(String extraction){
//        Letter[] palabra = new Letter[extraction.length()];
//        for (int i = 0; i < extraction.length(); i++) {
//            char intemedio = extraction.charAt(i);
//            Letter letra = new Letter(intemedio);
//            palabra[i]=(letra); 
//        }
//        return palabra;
//    }
     /**
     * public Letter getLetters (int row,  int column)
     * This method 
     * @param row
     * @param column
     * @return return the letter of the position
     */
    public Letter getLetters (int row,  int column){
        return crossword[row][column];
    }
    
    /**
     * public int rowLenght()
     * this method returns the lenght of the crossword rows
     * @return the lenght of the crossword rows
     */
    public int rowLength (){
        return crossword.length;
    }
    
    /**
     * public int columnLenght()
     * this method returns the lenght of the crossword columns
     * @return the lenght of the crossword columns
     */
    public int columnLength(){
        return crossword[0].length;
    }
    
    /**
     * public char getChar(int row, int column)
     * this method gets a letter from the crossword
     * @param row row where the letter is
     * @param column column where the letter is
     * @return 
     */
    public char getChar (int row, int column) {
    return crossword[row][column].getLetter();
    } 
  
}
