package edu.carlos.segundasemana;
public class MinhaClasse2 {
    public static void main (String[] args){
        String primeiroNome = "Carlos";
        String segundoNome = "Alexandre";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
