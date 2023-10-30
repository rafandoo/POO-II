package com.testes;
import junit.framework.TestCase;
public class JUnitTeste extends TestCase {

    Operacao op = new Operacao();

    public void testAdicao() {
        assertEquals(4.0, op.adicao(2, 2));
        assertEquals(3.0, op.adicao(2, 1));
        assertEquals(6.0, op.adicao(2, 4));
    }

    public void testSubtracao() {
        assertEquals(2.0, op.subtracao(4, 2));
        assertEquals(1.0, op.subtracao(1, 1));
        assertEquals(-2.0, op.subtracao(4, 2));
    }

    public void testMultiplicacao() {
        assertEquals(4.0, op.multiplicacao(2, 2));
        assertEquals(3.0, op.multiplicacao(1, 1));
        assertEquals(6.0, op.multiplicacao(2, 4));
    }

    public void testDivisao() {
        assertEquals(2, op.divisao(4, 2));
        assertEquals(1, op.divisao(1, 1));
        assertEquals(-2, op.divisao(4, 2));
    }
}
