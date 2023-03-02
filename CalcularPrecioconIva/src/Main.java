public class Main {
    public static void main(String[] args) {

        class PrecioConIva {

            // Función que calcula el precio con el IVA incluido
            public static double calcularPrecioConIva(double precioSinIva) {
                double iva = 0.21;  // Por ejemplo, el IVA del 21%
                double precioConIva = precioSinIva * (1 + iva);
                return precioConIva;
            }

            // Ejemplo de uso de la función
            public static void main(String[] args) {
                double precioSinIva = 50.0;
                double precioConIva = calcularPrecioConIva(precioSinIva);
                System.out.println("El precio con IVA incluido es: " + precioConIva);
            }
        }
    }
}