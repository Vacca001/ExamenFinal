public class AnalisisAcademico {

   
    public static int contarEstudiantesAprobados(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int nota : fila) {
                if (nota >= 60 && nota <= 100) {
                    contador++;
                }
            }
        }
        return contador;
    }

 
    public static double promedioNotasAltas(int[][] matriz) {
        int suma = 0, contador = 0;
        for (int[] fila : matriz) {
            for (int nota : fila) {
                if (nota >= 80 && nota <= 100) {
                    suma += nota;
                    contador++;
                }
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }


    public static void imprimirNotasBajas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 50) {
                    System.out.println("Nota baja en [" + i + "][" + j + "]: " + matriz[i][j] + " puntos");
                }
            }
        }
    }

    public static int[] posicionNotaMaxima(int[][] matriz) {
        int max = Integer.MIN_VALUE;
        int filaMax = -1, columnaMax = -1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    filaMax = i;
                    columnaMax = j;
                }
            }
        }
        return new int[]{filaMax, columnaMax};
    }
    //BONUS
    public static int contarNotasFueraDeRango(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int nota : fila) {
                if (nota < 0 || nota > 100) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[][] notas = {
            {85, 92, 78, 101}, 
            {45, 60, 49, 88},
            {33, 100, 72, -5}   
        };

        System.out.println("Estudiantes aprobados: " + contarEstudiantesAprobados(notas));
        System.out.println("Promedio de notas altas: " + promedioNotasAltas(notas));
        imprimirNotasBajas(notas);
        int[] maxPos = posicionNotaMaxima(notas);
        System.out.println("Nota máxima en posición [" + maxPos[0] + "][" + maxPos[1] + "]");
        System.out.println("Notas fuera de rango: " + contarNotasFueraDeRango(notas));
    }
}