package com.curso.android.app.practica.proyecto;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class CompararTest extends TestCase {

    private Comparar mComparar;

    @Before
    public void setUp() {
        mComparar = new Comparar();
    }

    @Test
    public void compararNotNull(){
        assertNotNull(mComparar);
    }

    @Test
    public void Comparar() throws Exception{
        assertEquals("hola",mComparar("hola"));
    }
}