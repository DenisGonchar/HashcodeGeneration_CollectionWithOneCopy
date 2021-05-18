package com.epam.honchar.hash.code.generation.mechanism;

import java.util.Objects;
import java.util.stream.IntStream;


public class MyStringSum {
    private final String key;
    private static final int ZERO = 0;
    private static final int FOUR = 4;

    public MyStringSum(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        MyStringSum myStringSum = (MyStringSum) object;
        return Objects.equals(key, myStringSum.key);
    }

    @Override
    public int hashCode() {
        int result = 0;
        if (key != null) {
            result = IntStream.range(ZERO, FOUR).map(key::charAt).sum();
        }
        return result;
    }
}
