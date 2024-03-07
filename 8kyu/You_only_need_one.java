//You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
//
//Array can contain numbers or strings. X can be either.
//
//Return true if the array contains the value, false if not.


//Minha solução

public class You_only_need_one {
    public static boolean check(Object[] a, Object x) {
        // Percorre o array para verificar se o objeto x está presente
        for (Object element : a){
            if(element.equals(x)){
                return true; // Se encontrado, retorna true
            }
        }
        return false; // Se não encontrado, retorna false
    }

}