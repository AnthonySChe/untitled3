package com.github.AnthonySChe;

import org.apache.commons.lang3.StringUtils;

public class Main {
    /**
     * Пять раз приветствует
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(StringUtils.upperCase("Hello") + " i = " + i);
        }
    }
}
