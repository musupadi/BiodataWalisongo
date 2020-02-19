package com.destinyapp.biodatawalisongo.Model;

import java.util.Random;

public class Method {
    public int BabiGuling(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
