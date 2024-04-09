package org.iesvdm;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BingoTest {
    @Test
    public void ordenar() {
        int[] array = {8,2,5};
        int[] arrayOrdenado = {2,5,8};
        Bingo.ordenar(array);
        assertArrayEquals(arrayOrdenado, array);
    }

    @Test
    public void insertarAlFinal() {
        int[] array = {8,2,5};
        int[] arrayAñadido = {8,2,5,1};
        assertArrayEquals(arrayAñadido, Bingo.insertarAlFinal(array, 1));
    }

    @Test
    public void pintarCarton() {
        int aciertos = 2;
        int[][] carton = {{1,2,3},{4,5,6}};
        int[] bolas = {9,10,23,3,4};
        Assert.assertEquals(aciertos, Bingo.pintarCarton(carton, bolas));
    }

    @Test
    public void buscarValorRepetido() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int repe = 1;
        assertTrue(Bingo.buscarValorRepetido(array,repe));
    }

    @Test
    public void buscarColumna() {
        int[][] carton = {{1,2,-1},{2,-1,-1}};
        assertTrue(Bingo.buscarColumna(carton,1));
    }

    @Test
    public void buscarFila() {
        int[][] carton = {{1,2,-1},{2,-1,-1}};
        assertTrue(Bingo.buscarFila(carton,2,0));
    }

    @Test
    public void ponerBlancos() {
        int[][] carton = {{1,2,3},{12,15,17},{21,23,24},{31,35,36},{41,43,44},{51,52,53},{61,64,66},{71,72,74},{82,83,85}};
        int[] bolas = {3,2};
        Bingo.ponerBlancos(carton);
        Bingo.pintarCarton(carton,bolas);
    }

    @Test
    public void rellenarNumerosCarton() {
        int[][] carton = new int[9][3];
        Bingo.rellenarNumerosCarton(carton);
        int[] bolas = {3,2};
        Bingo.pintarCarton(carton,bolas);
    }
}
