package com.example.Converter.to.text.Services;

import com.example.Converter.to.text.Interfaces.TextColorSchema;

public class TextColorSchemaService implements TextColorSchema {
    private static final char[] ASCII_CHARS = {'#', '$', '@', '%', '*', '+', '-', '\''};

    @Override
    public char convert(int color) {
        int index = (int) ((color / 255.0) * (ASCII_CHARS.length - 1));
        return ASCII_CHARS[index];

    }
}
