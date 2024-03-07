//Complete the method that takes a boolean value and return
//a "Yes" string for true, or a "No" string for false.

//Minha solução

class YesOrNo
{
    public static String boolToWord(boolean b)
    {
        //Se variável b recebe o valor boleano true, retorna a String Yes
        if(b == true){
            return "Yes";
        }
        //Como boleano só recebe true ou false, a única alternativa de valor recebido por b será false, então retorna a String "No"
        return "No";
    }

}
