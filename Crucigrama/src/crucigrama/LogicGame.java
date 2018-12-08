/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 * This class manages the game in the logical part
 * 
 *@version 7/12/2018
 * @author Jose Ignacio Zamora/Edwin Molina/Kevin Trejos
 */
public class LogicGame {
     /**
     * public Letter[] stringToLetter(String extraction)
     * This method converts the extraction string to a 
     * array Letter
     * @param extraction
     * @return return the array of Letter
     */
    public static Letter[] stringToLetter(String extraction){
        Letter[] palabra = new Letter[extraction.length()];
        for (int i = 0; i < extraction.length(); i++) {
            char intemedio = extraction.charAt(i);
            Letter letra = new Letter(intemedio);
            palabra[i]=(letra); 
        }
        return palabra;
    }
    
    /**
     * public void addCrossword(String word, int initialRow, int initialColumn, char verticalHorizontal, Crossword crossword)
     * This method adds a letter to the crossword
     * @param word word to insert
     * @param initialRow start position of the row to insert the word
     * @param initialColumn start position of the column to insert the word
     * @param verticalHorizontal check if the word is vertical or horizontal
     * @param crossword crossword to insert the word
     */
    public void addCrossword(String word, int initialRow, int initialColumn, char verticalHorizontal, Crossword crossword){
        int contador = 0;
        if(verticalHorizontal == 'H'){
            for (int i = initialColumn; i < crossword.columnLength(); i++) {
                if(contador != word.length()){
                    Letter newLetter = new  Letter(word.charAt(contador));
                    crossword.setLetterPosition(initialRow, i, newLetter);
                    contador += 1;
                }
            }
        }else if(verticalHorizontal == 'V'){
            for (int i = initialRow; i < crossword.rowLength(); i++) {
                if(contador != word.length()){
                    Letter newLetter = new  Letter(word.charAt(contador));
                    crossword.setLetterPosition(i, initialColumn, newLetter);
                    contador += 1;
                }
            }
        }
        
    }
    
    /**
     * public void addCrosswordEmpty(int index, String word, int initialRow, int initialColumn, char verticalHorizontal, Crossword crossword)
     * this method adds the index of the words and puts blank spaces for the 
     * user to write the words
     * @param index word index
     * @param word palabra a insertar "en blanco"
     * @param initialRow start position of the row to insert the word
     * @param initialColumn start position of the column to insert the word
     * @param verticalHorizontal check if the word is vertical or horizontal
     * @param crossword crossword to insert the word
     */
    public void addCrosswordEmpty(int index,String word, int initialRow, int initialColumn, char verticalHorizontal, Crossword crossword){
        int contador = 0;
        if(verticalHorizontal == 'H'){
            for (int i = initialColumn; i < crossword.columnLength(); i++) {
                if(contador != word.length()){
                    Letter letterEmpty = new  Letter(' ');
                    crossword.setLetterPosition(initialRow, i, letterEmpty);
                    contador += 1;
                }
            }
        }else if(verticalHorizontal == 'V'){
            for (int i = initialRow; i < crossword.rowLength(); i++) {
                if(contador != word.length()){
                    Letter letterEmpty = new  Letter(' ');
                    crossword.setLetterPosition(i, initialColumn, letterEmpty);
                    contador += 1;
                }
            }
        }
        
        String newIndex = Integer.toString(index);
        char newIndex2 = newIndex.charAt(0);
        Letter letterEmpty = new  Letter(newIndex2);
        crossword.setLetterPosition(initialRow, initialColumn, letterEmpty);
        
        
    }
     
    /**
     * public String extraction(int filaInicial,int columnaInicial, char verticalHorizontal, Crossword crossword)
     * This method extracts a word from the crossword
     * @param initialRow start position of the row to extract the word
     * @param initialColumn start position of the column to extract the word
     * @param verticalHorizontal Verify if the word is vertical or horizontal
     * @return return the extract word
     */
    public String extraction(int initialRow, int initialColumn, char verticalHorizontal, Crossword crossword){
        String palabra = "";
        Letter letter = new Letter('0');
        if(verticalHorizontal == 'V'){
            for (int i = initialColumn; i < crossword.columnLength(); i++) {
                if(crossword.getChar(initialRow, i) != letter.getLetter()){
                    palabra += crossword.getChar(initialRow, i);
                }
            }
        }else if(verticalHorizontal == 'H'){
            for (int i = initialRow; i < crossword.rowLength(); i++) {
                if(crossword.getChar(i, initialColumn) != letter.getLetter()){
                    palabra += crossword.getChar(i, initialColumn);
                }
            }
        }

        return palabra;
    }
      
   /**
    * private int validate(int rows, Letter[] letter, Letter[] crossword, int badLetters)
     * This method validates whether the words 
     * entered by the user are correct or not
     * @param rows the position where the letters are
     * @param letter the letters that the user typed
     * @param crossword the correct letters
     * @param letrasMalas the total of letters that are incorrect
     * @return the bad letters
     */
      private int validar(int filas, String respuesta, String crossword, int letrasMalas){
        if (filas > respuesta.length()-1) {
           // System.out.println(letrasMalas + 1);
            return letrasMalas;
        } else {
            if (respuesta.charAt(filas) != crossword.charAt(filas)) {
                letrasMalas += 1;
               // System.out.println("Hola");
            }
            return validar(filas + 1, respuesta, crossword, letrasMalas);
        }
    }
    
    /**
     * public int validar(Letter[] letter, Letter[] right word)
     * This method calls the private method
     * @param letter the letters that the user typed
     * @param rightWord the correct letters
     * @return the bad letters
     */
    public int validar(String respuesta, String palabraCorrecta){
        return validar(0, respuesta, palabraCorrecta, 0);
    }
       

       
}
