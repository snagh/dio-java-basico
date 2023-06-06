package edu.anderson.segundasemana;
public class MInhaClasse {

    public static void main (String [] args) {
        
        String primeiroNome = "Anderson José";
        String segundoNome = "Campos Martins";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println (nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }
    
}
