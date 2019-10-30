package pruebatecnica;

import java.util.Arrays;

/**
 * Creado por Karelys Vargas
 * Interfaz que especifica las funcionalidades de todas las implementaciones de n�meros
* Para la representaci�n, utiliza una representaci�n de 7 segmentos, esto significa. el primer segmento est� en la parte superior, luego ve hacia la derecha,
 * dejando el segmento medio como el �ltimo segmento
 *
 *       _0_
 *   5 |   | 1
 *    |_6_|
 *  4|   | 2
 *  |_ _|
 *    3
 */
public class NumeroLCD {

    private char[][] matriz;
    private boolean[] segmentos;
    private int size;
    private int numero;


    public NumeroLCD(int size, int number, boolean[] segments) {
        this.size = size;
        this.matriz = new char[2*size + 1][(2*size)+1];
        this.segmentos = segments;
        this.numero = number;
        //Rellena la matriz con espacios
        for (char[] c: matriz) {
            Arrays.fill(c, ' ');
        }
        ConstruirMatriz();


    }

    int numeroFila(){
        return matriz.length;
    }
    public int numeroColumna(){
        return matriz[0].length;
    }

    public char[][] getMatrizRespresentacion(){
        return matriz;
    }
    public boolean[] getSegmentos(){
        return segmentos;
    }

    public void setSegmentos(boolean[] segmentos){
        this.segmentos = segmentos;

    }

    /**
     * obtener la fila espec�fica en su representaci�n de cadena
     * @param fila a devolver
     * @return Representaci�n de cadena de la fila espec�fica
     */
    public String getRowAsString(int row){
        return new String(matriz[row]);
    }

    /**
     *  construir la matriz con los segmentos establecidos en verdadero
     */
    private void ConstruirMatriz(){
        for (int i = 0; i < segmentos.length; i++) {
            if(segmentos[i]) LlenarSegmentos.llenar(i, matriz);
        }
    }

    public int getNumbero() {
        return numero;
    }
}
