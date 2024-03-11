//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//Examples
//"This is an example!" ==> "sihT si na !elpmaxe"
//"double  spaces"      ==> "elbuod  secaps"

//Minha solução
public class Kata{

    public static String reverseWords(final String original){
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        // Iterar sobre cada caractere na string original
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);

            // Se o caractere não for um espaço em branco, adicione-o à palavra atual
            if (c != ' ') {
                word.append(c);
            } else {
                // Se for um espaço em branco, inverter a palavra e adicionar ao resultado
                result.append(word.reverse());
                result.append(' '); // Adicione o espaço em branco

                // Limpar a palavra para a próxima palavra
                word.setLength(0);

                // Enquanto os próximos caracteres forem espaços em branco, adicione-os ao resultado
                while (i < original.length() - 1 && original.charAt(i + 1) == ' ') {
                    result.append(' ');
                    i++;
                }
            }
        }

        // Adicionar a última palavra ao resultado
        result.append(word.reverse());

        return result.toString();
    }
}


