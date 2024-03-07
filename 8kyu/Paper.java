//Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
//
//Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
//
//Example:
//n= 5, m=5: 25
//n=-5, m=5:  0
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

//Minha solução

public class Paper
{
    public static int paperWork(int n, int m)
    {
        //Se n ou m for menor que zero, retorna zero
        if(n < 0  || m < 0){
            return 0;
        }
        // qualquer outro valor para m ou n, eles serão multiplicados.
        return n*m;
    }
}
