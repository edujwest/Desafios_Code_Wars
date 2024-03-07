//It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
//You're given one parameter, the original string. You don't have to worry about strings with less than two characters.


//Minha solução

public class RemoveChars {

    public static String remove(String str) {
        //Retorna uma substring da string original, onde essa substring inicia no índice 1
        // (como os índices das Strings em Java começam em 0, ela remove o primiero caractere)
        //e termina no índice "length() -1", que seria o tamanho da string - 1, assim também removendo o último caractere da string"
        return str.substring(1, str.length() - 1);

    }
}