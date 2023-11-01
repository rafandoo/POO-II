package com.atv1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQLColTest {

    @Test
    public void testCreateColumnScriptNotNullAutoIncrement() {
        String script = SQLCol.criarColuna("codigo", "INT", true, true);
        assertEquals("'codigo' INT NOT NULL AUTO_INCREMENT", script);
    }

    @Test
    public void testCreateColumnScriptAutoIncrement() {
        String script = SQLCol.criarColuna("codigo", "INT", false, true);
        assertEquals("'codigo' INT AUTO_INCREMENT", script);
    }

    @Test
    public void testCreateColumnScriptNotNull() {
        String script = SQLCol.criarColuna("codigo", "INT", true, false);
        assertEquals("'codigo' INT NOT NULL", script);
    }

    @Test
    public void testCreateColumnScriptDefault() {
        String script = SQLCol.criarColuna("codigo", "INT", false, false);
        assertEquals("'codigo' INT", script);
    }
}