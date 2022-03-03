package aulasoma;


public class AulaSoma {

    
    public static void main(String[] args) {
        
        Soma resultado = new Soma();
        Subtracao ressub = new Subtracao();
        Multi resmulti = new Multi();
        Divisao resdivi = new Divisao();
        
        //resultado.soma(4,2);
        resultado.soma(4,2);
        resdivi.divisao(4, 2);
        ressub.subtracao(4, 2);
        resmulti.multi(4, 2);
    }
    
}
