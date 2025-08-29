package com.example.Converter.to.text.Exceptions;

public class BadImageSizeException extends Exception {
    public BadImageSizeException(double ratio, double maxRatio) {
        super("Максимальное соотношение сторон изображения " + maxRatio + ", а у этой " + ratio);
    }
}
