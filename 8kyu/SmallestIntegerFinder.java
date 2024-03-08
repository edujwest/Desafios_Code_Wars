//Given an array of integers your solution should find the smallest integer.
//
//For example:
//
//Given [34, 15, 88, 2] your solution will return 2
//Given [34, -345, -1, 100] your solution will return -345
//You can assume, for the purpose of this kata, that the supplied array will not be empty.


//Minha solulção
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        // Inicializa a variável para armazenar o menor inteiro
        int menorInteiro = args[0];

        // Itera sobre os elementos do array
        for (int i = 1; i < args.length; i++) {
            // Se o elemento atual for menor que o menorInteiro, atualiza o menorInteiro
            if (args[i] < menorInteiro) {
                menorInteiro = args[i];
            }
        }

        // Retorna o menor inteiro encontrado no array
        return menorInteiro;
    }


    //outra solução para fins de comparação e estudo

    public class SmallestIntegerFinder {
        public static int findSmallestInt(int[] args) {
            return IntStream.of(args).min().getAsInt();
        }
    }


}