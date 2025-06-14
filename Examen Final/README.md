Prueba Final Lógica – “Análisis de Resultados Académicos”
Contexto:
Una institución quiere analizar el desempeño de estudiantes. Cada fila de una matriz notas[][] representa un grupo de estudiantes, y cada columna una nota final (entre 0 y 100).
🔧 Enunciado:
Implementa los siguientes métodos:
public static int contarEstudiantesAprobados(int[][] matriz)
Cuenta cuántos estudiantes tienen una nota mayor o igual a 60.
public static double promedioNotasAltas(int[][] matriz)
Calcula el promedio de las notas mayores o iguales a 80.
public static void imprimirNotasBajas(int[][] matriz)
Imprime las posiciones [i][j] de las notas menores a 50:
"Nota baja en [i][j]: X puntos".
public static int[] posicionNotaMaxima(int[][] matriz)
Devuelve un arreglo con la posición [fila, columna] de la nota más alta.
🎯 BONUS:
public static int contarNotasFueraDeRango(int[][] matriz)
Cuenta cuántas notas están fuera del rango [0, 100].
✅ Criterios de evaluación:
Criterio
Puntos
Uso correcto de arreglos y matrices
1.5
Uso de condicionales adecuados
1.5
Aplicación correcta de bucles
1.0
Métodos bien definidos y llamados
1.0
BONUS: implementación correcta
+0.5
Total base
5.0

SOLUCION


#  ✅ Prueba Final de Lógica – Análisis de Resultados Académicos

Este proyecto fue desarrollado como parte de la **prueba final de Lógica**, con el objetivo de analizar el desempeño académico de los estudiantes a través de una matriz de notas.

Cada fila de la matriz representa un grupo de estudiantes, y cada columna corresponde a una nota final (valor entre 0 y 100). A partir de esta matriz, se implementaron diferentes métodos en Java para realizar análisis útiles como promedios, detección de notas bajas, ubicación de la mejor calificación y más.

---

## 🔧  Métodos implementados

A continuación se describen los métodos solicitados en el enunciado y su funcionalidad:

- `contarEstudiantesAprobados(int[][] matriz)`  
  Cuenta cuántas notas son mayores o iguales a 60, considerando que esa es la calificación mínima para aprobar.

- `promedioNotasAltas(int[][] matriz)`  
  Calcula el promedio de todas las notas que sean iguales o mayores a 80. Este valor representa el rendimiento sobresaliente.

- `imprimirNotasBajas(int[][] matriz)`  
  Muestra las posiciones `[i][j]` de todas las notas que sean menores a 50, con un mensaje claro:  
  `"Nota baja en [i][j]: X puntos"`.

- `posicionNotaMaxima(int[][] matriz)`  
  Busca la nota más alta de toda la matriz y devuelve su ubicación exacta en forma de un arreglo `[fila, columna]`.

- 🎯 **BONUS:** `contarNotasFueraDeRango(int[][] matriz)`  
  Verifica si hay datos incorrectos contando las notas que están fuera del rango válido (menores a 0 o mayores a 100).

---

## ✅ Ejemplo de uso en código

```java
int[][] notas = {
    {85, 92, 78, 101},  // una nota fuera de rango
    {45, 60, 49, 88},
    {33, 100, 72, -5}   // otra nota fuera de rango
};

