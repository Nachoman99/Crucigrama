/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 *
 * @author Nacho
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
     * public String extraction(int filaInicial,int columnaInicial, char verticalHorizontal)
     * This method extracts a word from the crossword
     * @param filaInicial the 
     * @param columnaInicial
     * @param verticalHorizontal
     * @return return the extract word
     */
    public String extraction(int filaInicial,int columnaInicial, char verticalHorizontal, Crossword crossword){
        String palabra = "";
        Letter letter = new Letter('0');
        if(verticalHorizontal == 'V'){
            for (int i = columnaInicial; i < crossword.columnLength(); i++) {
                if(crossword.getChar(filaInicial, i) != letter.getLetter()){
                    palabra += crossword.getChar(filaInicial, i);
                }
            }
        }else if(verticalHorizontal == 'H'){
            for (int i = filaInicial; i < crossword.rowlength(); i++) {
                if(crossword.getChar(i, columnaInicial) != letter.getLetter()){
                    palabra += crossword.getChar(i, columnaInicial);
                }
            }
        }

        return palabra;
    }
      
    private int validar(int filas, Letter[] letra, Letter[] crossword, int letrasMalas){
        if (filas > letra.length-1) {
           // System.out.println(letrasMalas + 1);
            return letrasMalas;
        } else {
            if (letra[filas] != crossword[filas]) {
                letrasMalas += 1;
               // System.out.println("Hola");
            }
            return validar(filas + 1, letra, crossword, letrasMalas);
        }
    }
       public int validar(Letter[] letra, Letter[] palabraCorrecta){
        return validar(0, letra, palabraCorrecta, 0);
    }
       

       
}
