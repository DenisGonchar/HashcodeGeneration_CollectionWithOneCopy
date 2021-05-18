package com.epam.honchar.hash.code.generation.mechanism;

import java.util.Objects;

public class MyStringLength {
    private final String key;

    public MyStringLength(String key) {
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
        MyStringLength myString = (MyStringLength) object;
        return Objects.equals(key, myString.key);
    }

    @Override
    public int hashCode() {
        int result = 0;
        if (key != null) {
            result = key.length();
        }
        return result;
    }

}
