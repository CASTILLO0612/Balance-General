public class App {
        // Definimos las categorías
        private static final String[] CATEGORIAS = {"Activos", "Pasivos", "Patrimonio"};
    
        // Creamos arreglos para almacenar los valores de cada categoría
        private static double[] activos = {10000, 5000, 3000}; // Ejemplo de valores iniciales
        private static double[] pasivos = {4000, 2000, 1000}; // Ejemplo de valores iniciales
        private static double[] patrimonio = {6000, 3000, 2000}; // Ejemplo de valores iniciales
    
        // Método para calcular el total de una categoría
        private static double calcularTotal(double[] categoria) {
            double total = 0;
            for (double valor : categoria) {
                total += valor;
            }
            return total;
        }
        
            // Método para imprimir el balance general
            public static void imprimirBalanceGeneral() {
                System.out.println("Balance General");
                System.out.println("------------------------------");
                for (int i = 0; i < CATEGORIAS.length; i++) {
                    double total = 0;
                    switch (i+1) {
                        case 1:
                            total = calcularTotal(activos);
                            break;
                        case 2:
                            total = calcularTotal(pasivos);
                            break;
                        case 3:
                            total = calcularTotal(patrimonio);
                            break;
                    }
                    System.out.println(CATEGORIAS[i] + ": $" + total);
                }
                System.out.println("------------------------------");
            }
    public static void main(String[] args) throws Exception {
            // Método main para probar el balance general
                imprimirBalanceGeneral();
            }
        }
        
    

