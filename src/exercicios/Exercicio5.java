package exercicios;

public class Exercicio5 {

    public static void main(String[] args) {
        
        String palavra = "desenvolvimento-web";

        char[] caracteres = new char[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            caracteres[i] = palavra.charAt(i);
        }

        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
    }
}
