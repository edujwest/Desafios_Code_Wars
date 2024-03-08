//Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
//
//Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
//
//Example:
//
//Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
//Note that the Java version expects a return value of null for an empty string or null.


//Minha solução
public class JadenCaseStrrings {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null; // Retorna null se a string estiver vazia
        }

        StringBuilder jadenCasePhrase = new StringBuilder();

        // Converte a primeira letra da frase para maiúscula
        jadenCasePhrase.append(Character.toUpperCase(phrase.charAt(0)));

        // Itera sobre os caracteres da frase começando do segundo caractere
        for (int i = 1; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);

            // Se o caractere anterior for um espaço, converte o caractere atual para maiúscula
            if (phrase.charAt(i - 1) == ' ') {
                jadenCasePhrase.append(Character.toUpperCase(currentChar));
            } else {
                jadenCasePhrase.append(currentChar);
            }
        }

        return jadenCasePhrase.toString();
    }

}