import java.util.Scanner;

class SumarDigitos {

    public static int res(int x){
        String a = String.valueOf(x);
        if(a.length()==1) return x;
        int resultado = 0;
        while(x > 0) {
            resultado += x % 10;
            x = x / 10;
        }
        return res(resultado);

    }

    public static void main(String [] args){
        System.out.println(res(155));
    }
}
