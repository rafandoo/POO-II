package com.atv1;

public class SQLCol {
    public static String criarColuna(String coluna, String tipo, boolean notNull, boolean autoIncrement) {
        StringBuilder script = new StringBuilder();
        script.append("'" + coluna + "' " + tipo);

        if (notNull) {
            script.append(" NOT NULL");
        }

        if (autoIncrement) {
            script.append(" AUTO_INCREMENT");
        }

        return script.toString();
    }
}
