package pruebatecnica;

/**
 * Creado por Karelys Vargas
 */
public class MostrarNumeroLCD {

    private static boolean[][] SEGMENTOS = {{true, true, true, true, true, true, false},
                                            {false, true, true, false, false, false, false},
                                            {true, true, false, true, true, false, true},
                                            {true, true, true, true, false, false, true},
                                            {false, true, true, false, false, true, true},
                                            {true, false, true, true, false, true, true},
                                            {true, false, true, true, true, true, true},
                                            {true, true, true, false, false, false, false},
                                            {true, true, true, true, true, true, true},
                                            {true, true, true, false, false, true, true}};


    /**
     * Crea un NumeroLCD con los segmentos especoficos para representar el numero establecido en verdadero
     * Tamaño del tamaño de @param de la pantalla LCD
     * @param num numero de un digito para crear como NumeroLCD
     * @return
     */
    public static NumeroLCD crearNumeroLCD(int size, int num) {
        NumeroLCD ret = new NumeroLCD(size, num, SEGMENTOS[num]);

        return ret;
    }


}
