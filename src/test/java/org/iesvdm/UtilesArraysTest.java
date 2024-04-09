package org.iesvdm;

import jdk.jshell.execution.Util;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class UtilesArraysTest {
    @Test
    public void limpiar() {
        int[] arrayVacio = new int[0];
        Assert.assertArrayEquals(arrayVacio, UtilesArrays.limpiar());
    }

    @Test
    public void rellenar() {
        int[] array = {0,0,0};
        Assert.assertArrayEquals(array, UtilesArrays.rellenar(array, 3));
    }

    @Test
    public void rellenar2() {
        int[] array = {2,2,2};
        Assert.assertArrayEquals(array, UtilesArrays.rellenar(array, 3,2));
    }

    @Test
    public void insertarAlFinal() {
        int[] array = {2,2,2};
        int[] arrayAñadido = {2,2,2,3};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.insertarAlFinal(array,3));
    }

    @Test
    public void insertarAlPrincipio() {
        int[] array = {2,2,2};
        int[] arrayAñadido = {3,2,2,2};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.insertarAlPrincipio(array, 3));
    }

    @Test
    public void insertarEnPosicion() {
        int[] array = {2,2,2};
        int[] arrayAñadido = {2,3,2,2};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.insertarEnPosicion(array, 3, 1));
    }

    @Test
    public void insertarOrdenado() {
        int[] array = {2,11,23};
        int[] arrayAñadido = {2,11,14,23};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.insertarOrdenado(array, 14));
    }

    @Test
    public void eliminarUltimo() {
        int[] array = {2,11,23};
        int[] arrayAñadido = {2,11};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.eliminarUltimo(array));
    }

    @Test
    public void eliminarPrimero() {
        int[] array = {2,11,23};
        int[] arrayAñadido = {11,23};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.eliminarPrimero(array));
    }

    @Test
    public void eliminarPosicion() {
        int[] array = {2,11,23};
        int[] arrayAñadido = {2,23};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.eliminarPosicion(array,1));
    }

    @Test
    public void eliminar() {
        int[] array = {2,11,23,1};
        int[] arrayAñadido = {2,11,23};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.eliminar(array,1));
    }

    @Test
    public void ordenar() {
        int[] array = {11,23,2};
        int[] arrayAñadido = {2,11,23};
        Assert.assertArrayEquals(arrayAñadido, UtilesArrays.ordenar(array));
    }

    @Test
    public void desordenar() {
        int[] array = {2,11,23};
        UtilesArrays.desordenar(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void invertir() {
        int[] array = {2,11,23};
        int[] arrayInvertido = {23,11,2};
        Assert.assertArrayEquals(arrayInvertido,UtilesArrays.invertir(array));
    }

    @Test
    public void imprimir() {
        int[] array = {51,121,1233};
        UtilesArrays.imprimir(array);
    }

    @Test
    public void estaOrdenado() {
        int[] array = {51,121,1233};
        Assert.assertTrue(UtilesArrays.estaOrdenado(array));
    }

    @Test
    public void buscar() {
        int[] array = {51,121,1233};
        Assert.assertEquals(1,UtilesArrays.buscar(array, 121));
    }


    @Test
    public void partirPor() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] arrayCortado = {4,5,6};
        Assert.assertArrayEquals(arrayCortado,UtilesArrays.partirPor(array, 3,6));
    }

    @Test
    public void sonIguales() {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] array2 = {1,2,3,4,5,6,7,8};
        Assert.assertTrue(UtilesArrays.sonIguales(array, array2));
    }

    @Test
    public void elementosIguales() {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] array2 = {1,2,3,4,5,6,7,8};
        Assert.assertTrue(UtilesArrays.elementosIguales(array, array2, 2));
    }

    @Test
    public void concatenarArrays() {
        int[] array = {1,2,3};
        int[] array2 = {4,5,6};
        int[] arrayConcatenado = {1,2,3,4,5,6};
        Assert.assertArrayEquals(arrayConcatenado,UtilesArrays.concatenarArrays(array, array2));
    }
}
