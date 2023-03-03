public class ConcatenarTextos {

    public static void main(String[] args) {
        String[] textos = {"Hola", "mundo", "!", "Esto", "es", "una", "prueba."};
        String resultado = "";

        for (int i = 0; i < textos.length; i++) {
            resultado += textos[i] + " ";  // Concatenar cada texto con un espacio en blanco
        }

        System.out.println("El resultado final es: " + resultado);
    }
}